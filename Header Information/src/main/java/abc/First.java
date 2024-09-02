package abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public First() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Enumeration<String> e1 = request.getHeaderNames();
		out.print("<table border=1>");
		while (e1.hasMoreElements()) {
			String name = (String) e1.nextElement();
			String value = request.getHeader(name);
			out.print("<tr>");
			out.print("<td>");
			out.print(name);
			out.print("</td>");
			out.print("<td>");
			out.print(value);
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table border=1>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}

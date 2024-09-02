package abc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sport")
public class Sport extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Sport() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie[] arr = request.getCookies();
		out.print("<table border=1>");
		for (Cookie c : arr) {
			out.print("<tr>");
			out.print("<td>");
			out.print(c.getName());
			out.print("</td>");
			out.print("<td>");
			out.print(c.getValue());
			out.print("<td>");
			out.print("</tr>");
		}
		out.print("</table");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

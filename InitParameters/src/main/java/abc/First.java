package abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/First", "/MyServlet.do", "/test" }, initParams = {
        @WebInitParam(name = "Driver1", value = "com.mysql.cj.jdbc.Driver"),
        @WebInitParam(name = "admin", value = "admin1") })
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public First() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext sc = getServletContext();
		Enumeration<String> e1 = sc.getInitParameterNames();
		out.print("<table border='1'>");
		while (e1.hasMoreElements()) {
			String name = (String) e1.nextElement();
			String value = sc.getInitParameter(name);
			out.print("<tr>");
			out.print("<td>");
			out.print(name);
			out.print("</td>");
			out.print("<td>");
			out.print(value);
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

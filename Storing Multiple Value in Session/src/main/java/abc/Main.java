package abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Main() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String n = request.getParameter("fname");
		String n1 = request.getParameter("lname");
		Student st = new Student(n, n1);
		// Save Data in Session Object
		HttpSession hs = request.getSession();
		hs.setAttribute("data", st);
		out.print("<a href=Movie>Movie</a>");
		out.print("<br>");
		HttpSession hs1 = request.getSession();
		hs1.setAttribute("data1", st);
		out.print("<a href=Sport>Sport</a>");
		out.print("<br>");
		out.print(hs.getId());
		out.print("<br>");
		out.print(hs1.getId());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

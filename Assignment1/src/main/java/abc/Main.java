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
		String n = request.getParameter("name");
		String n1 = request.getParameter("phone");
		String e = request.getParameter("qualification");
		String e1 = request.getParameter("institute");
		String e2 = request.getParameter("marks");
		Personal per = new Personal(n, n1, e, e1, e2);
		// Create Session Object
		HttpSession hs = request.getSession();
		hs.setAttribute("personal", per);
		
		out.print(hs.getId());
		out.print("<br>");
		out.print(hs.getId());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

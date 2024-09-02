package abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		String n = request.getParameter("cname");
		String n1 = request.getParameter("cvalues");
		Cookie c = new Cookie(n, n1);
		response.addCookie(c);
		out.print("<a href=Movie>Movie</a>");
		out.print("<br><a href=Sport>Sport</a>");
		HttpSession hs = request.getSession();
		if (hs.isNew()) {
			hs.setAttribute("count1", 0);
			out.println("Count is 0");
		} else {
			Integer i = (Integer) hs.getAttribute("count1");
			i++;
			out.println("Count is " + i);
			hs.setAttribute("count1", i);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

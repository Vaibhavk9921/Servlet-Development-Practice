package abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Sport")
public class Sport extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Sport() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession hs = request.getSession();
		String n = (String) hs.getAttribute("uname");
		String n1 = (String) hs.getAttribute("vname");
		out.print("Hello" + " " + n + " " + n1);
		out.print("<br>");
		out.print(hs.getId());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

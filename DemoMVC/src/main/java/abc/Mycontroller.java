package abc;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Mycontroller")
public class Mycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Mycontroller() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String b1=request.getParameter("login");
			String b2=request.getParameter("action");
			String un=request.getParameter("uname");
			String p=request.getParameter("pass");
			MyModel ob=new MyModel();
			if(b1!=null) {
				//login 
				if(ob.check(un, p)) {
					RequestDispatcher rd;
					rd=getRequestDispatcher("valid.jsp");
					rd.forward(request, response);
				}else {
					RequestDispatcher rd;
					rd=getRequestDispatcher("invalid.jsp");
					rd.forward(request, response);
				}
			}else if(b2!=null) {
				//register
				ob.register(un, p);
				response.sendRedirect("index.jsp");
			}else {
				response.sendRedirect("index.jsp");
			}
		}catch(Exception e) {}
	}
	private RequestDispatcher getRequestDispatcher(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

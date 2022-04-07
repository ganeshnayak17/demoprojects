package validationoflogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		if(user.equalsIgnoreCase("ganesh") && password.equalsIgnoreCase("ganesh@12"))
		{
			out.print("Welcome to LoginPage");
			HttpSession session = request.getSession();
			session.setAttribute("username", user);
			response.sendRedirect("DashBoard");
		}
		else
		{
			request.getRequestDispatcher("Login.html").include(request, response);
			out.print("INCORRECT DETAILS");
		}
	}

}

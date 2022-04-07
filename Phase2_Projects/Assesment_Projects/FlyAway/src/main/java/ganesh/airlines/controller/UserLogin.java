package ganesh.airlines.controller;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ganesh.airlines.dao.Dao;

public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			Dao dao = new Dao();
			HashMap<String, String> user = dao.checkUser(email.toLowerCase(), password);
			HttpSession session = request.getSession();
			if (user != null) {
				session.setAttribute("user", user);
				response.sendRedirect("Homepage.jsp");
			} else {
				session.setAttribute("message", "Invalid Details");
				response.sendRedirect("Userpage.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

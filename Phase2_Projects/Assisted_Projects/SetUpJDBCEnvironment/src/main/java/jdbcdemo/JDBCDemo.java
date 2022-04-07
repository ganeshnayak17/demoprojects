package jdbcdemo;

import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ecommerce.DBconnection;
/**
 * Servlet implementation class JDBCDemo
 */
@WebServlet("/JDBCDemo")
public class JDBCDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBCDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
        try {
                 PrintWriter out = response.getWriter();
                 out.println("<html><body>");
                 
                InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
                Properties props = new Properties();
                props.load(in);
                
                DBconnection conn = new DBconnection(props.getProperty("url"), props.getProperty("root"), props.getProperty("ganesh@12"));
                out.println("DB Connection initialized.<br>");
                
                conn.closeConnection();
                out.println("DB Connection closed.<br>");
                
                
                out.println("</body></html>");
                conn.closeConnection();
                
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        } catch (SQLException e) {
                e.printStackTrace();
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

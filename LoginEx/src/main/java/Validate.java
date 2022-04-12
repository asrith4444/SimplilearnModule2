

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = res.getWriter();
				String user=req.getParameter("username");
				String pass =req.getParameter("password");
				if(user.equals("admin")&& pass.equals("admin")) {
					pw.println("Success");
				}
				else {
					pw.println("Failed");
				}
	}
	
	

	

}

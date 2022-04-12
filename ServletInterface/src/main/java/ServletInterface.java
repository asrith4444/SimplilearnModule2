

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInterface
 */
@WebServlet("/ServletInterface")
public class ServletInterface implements Servlet {
	private static final long serialVersionUID = 1L;
	 ServletConfig config=null;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("In destroy() method");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		 return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This is a sample servlet info";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
        System.out.println("Initialization complete");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(getServletInfo());
        System.out.println(getServletConfig());
        res.setContentType("text/html");
        PrintWriter pwriter=res.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("In the service() method<br>");
        pwriter.print("</body>");
        pwriter.print("</html>");
		
	}

}

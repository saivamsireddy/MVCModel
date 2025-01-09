

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetResult
 */
@WebServlet("/GetResult")
public class GetResult extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) {
		try {
			String regno=req.getParameter("regno");
			String passw=req.getParameter("pass");
			Model m=new Model();
			m.setAddmission(regno);
			m.setPassword(passw);
			
			boolean b=m.getResults();
			if(b==true) {
				String name=m.getName();
				String Addmi=m.getAddmission();
				String password=m.getPassword();
				int marks=m.getMarks();
				
				HttpSession session=req.getSession(true);
				session.setAttribute("name",name);
				session.setAttribute("addmission",Addmi);
				session.setAttribute("password",password);
				session.setAttribute("marks",marks);
				
				
				res.sendRedirect("dis.jsp");
			}
			else
			{
				res.sendRedirect("incorrect.html");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}

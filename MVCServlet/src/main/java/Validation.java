
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validation")
public class Validation extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) {
		String addm = req.getParameter("regno");
		String pass = req.getParameter("pass");

		try {
			if (addm.length() != 4 || pass.length() == 0) {
				res.sendRedirect("invalid.html");
			} else {
				req.getServletContext().getRequestDispatcher("/GetResult").forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

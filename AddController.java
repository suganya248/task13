package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import Exception.CustomException;

@WebServlet("/AddController")
public class AddController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StaffController controller = new StaffController();

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Long salary = Long.parseLong(request.getParameter("salary"));
		int exp = Integer.parseInt(request.getParameter("exp"));
		controller.addStaff(id, name, salary, exp);
		response.sendRedirect("Login");

	}

	public static void invokeCustomException() {
		try {
			throw new CustomException();
		} catch (CustomException e) {
			System.out.println(e);
		}
	}
}
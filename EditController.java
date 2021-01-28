package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Exception.CustomException;

@WebServlet("/EditController")
public class EditController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StaffController controller = new StaffController();

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		long salary = Integer.parseInt(request.getParameter("salary"));
		int exp = Integer.parseInt(request.getParameter("exp"));
		controller.editStaff(id, name, salary, exp);
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
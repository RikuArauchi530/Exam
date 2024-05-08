package StudentManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentListAction extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<String> enrollmentYears = getEnrollmentYearsFromDatabase();
			List<String> classes = getClassesFromDatabase();
			
			request.setAttribute("enrollmentYears", enrollmentYears);
			request.setAttribute("classes", classes);
			
			request.getRequestDispatcher("/student_list.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private List<String> getEnrollmentYearsFromDatabase() {
		List<String> years = new ArrayList<>();
		
		return years;
	}
	
	private List<String> getClassesFromDatabase() {
		List<String> classes = new ArrayList<>();
		
		return classes;
	}
	
    }
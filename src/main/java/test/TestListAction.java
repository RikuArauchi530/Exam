package test;
import java.util.List;

import bean.Student;
import bean.TestListStudent;
import bean.TestListSubject;
import dao.StudentDAO;
import dao.TestListStudentDAO;
import dao.TestListSubjectDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;


public class TestListAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {
		
		
		HttpSession session=request.getSession();
		
		
		String keyword=request.getParameter("keyword");
		if (keyword==null) keyword="";
		
		
		StudentDAO dao=new StudentDAO();
		List<Student> list=dao.search(keyword);
		
		
		session.setAttribute("list", list);
		
		return "Scoremanage.jsp";
	}
	
	public String setTestListSubject(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {
			
			
		HttpSession session=request.getSession();
			
			
		String keyword=request.getParameter("keyword");
		if (keyword==null) keyword="";
			
			
		TestListSubjectDAO dao=new TestListSubjectDAO();
		List<TestListSubject> list=dao.search(keyword);
			
			
		session.setAttribute("list", list);
			
		return "Scoremanage.jsp";
	}
	
	public String setTestListStudent(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {
				
				
			HttpSession session=request.getSession();
				
				
			String keyword=request.getParameter("keyword");
			if (keyword==null) keyword="";
				
				
			TestListStudentDAO dao=new TestListStudentDAO();
			List<TestListStudent> list=dao.postfilter(keyword);
				
				
			session.setAttribute("list", list);
				
			return "Scoremanage.jsp";
		}
}
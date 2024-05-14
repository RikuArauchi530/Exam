package subjectmanager;
import java.util.List;

import bean.Subject;
import dao.SubjectDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;


public class SubjectUpdateAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {
		
		
		HttpSession session=request.getSession();
		
		
		String keyword=request.getParameter("keyword");
		if (keyword==null) keyword="";
		
		
		SubjectDAO dao=new SubjectDAO();
		List<Subject> list=dao.search(keyword);
		
		
		session.setAttribute("list", list);
		
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		request.setAttribute("code", code);
		request.setAttribute("name", name);
		request.getRequestDispatcher("subject_update.jsp").forward(request, response);

		
		return "subject_update.jsp";
	}
}
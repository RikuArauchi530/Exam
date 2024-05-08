package subjectmanager;
import java.io.IOException;
import java.util.List;

import dao.SubjectDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//登録データを一覧表示するクラス
@WebServlet("/NakamuraListDisplay")
public class SubjectListAction extends HttpServlet{
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //データベース一覧表示
        SubjectDAO nd = new SubjectDAO();
        List<Subject> nlist = nd.showAllList();

        //セッションの開始
        HttpSession session = request.getSession();
        //セッションスコープにデータ登録
        session.setAttribute("nlist",nlist);

        RequestDispatcher rd = request.getRequestDispatcher("nakamura_list.jsp");
        rd.forward(request, response);
    }
}

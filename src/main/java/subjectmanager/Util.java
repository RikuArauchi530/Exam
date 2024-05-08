package subjectmanager;

import bean.Teacher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;


@WebServlet(urlPatterns={"/subjectmanager/util"})
public class Util extends HttpServlet {
    public Teacher getUser(HttpServletRequest request) {
        // ここにメソッドの実装を記述してください。
        return null;
    }

    public void setClassNumSet(HttpServletRequest request) {
        // ここにメソッドの実装を記述してください。
    }

    public void setEntYearSet(HttpServletRequest request) {
        // ここにメソッドの実装を記述してください。
    }

    public void setSubjects(HttpServletRequest request) {
        // ここにメソッドの実装を記述してください。
    }

    public void setNumSet(HttpServletRequest request) {
        // ここにメソッドの実装を記述してください。
    }

    // 他のメソッドやクラスのメンバー変数が必要であれば、ここに追加してください。

}
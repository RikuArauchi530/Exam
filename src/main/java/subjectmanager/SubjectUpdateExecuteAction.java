package subjectmanager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import tool.Action;


public abstract class SubjectUpdateExecuteAction extends Action {
//	public String execute(
//			HttpServletRequest request, HttpServletResponse response
//		) throws Exception {
//			
//			
//			HttpSession session=request.getSession();
//			
//			
//			String keyword=request.getParameter("keyword");
//			if (keyword==null) keyword="";
//			
//			
//			SubjectDAO dao=new SubjectDAO();
//			List<Subject> list=dao.search(keyword);
//			
//			
//			session.setAttribute("list", list);
//			
//			String code = request.getParameter("code");
//			String name = request.getParameter("name");
//			request.setAttribute("code", code);
//			request.setAttribute("name", name);
//			request.getRequestDispatcher("subject_update_done.jsp").forward(request, response);
//
//			
//			return "subject_update_done.jsp";
//		}
//	
//	
	private static String RDB_DRIVE="org.h2.Driver";
	private static String URL="jdbc:h2:tcp://localhost/~/exam";
	private static String USER="sa";
	private static String PASSWD="";
	
	public static void main(String[] args) {
		try{
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL,USER,PASSWD);
			Statement smt = con.createStatement();
			String sql = "UPDATE subject SET update_column = ${name} WHERE condition_column = ${subject.name}";
			@SuppressWarnings("unused")
			int rowsCount = smt.executeUpdate(sql);
			
			smt.close();
			con.close();
		}catch (Exception e) {
			System.out.println("JDBCデータベース接続エラー");
		}
	}
}


//import sqlite3
//
//def update_database(sql_query):
//    try:
//        # データベースに接続します
//        connection = sqlite3.connect('your_database.db')
//
//        # カーソルを作成します
//        cursor = connection.cursor()
//
//        # SQLクエリを実行します
//        cursor.execute(sql_query)
//
//        # 変更をコミットします
//        connection.commit()
//
//        # クローズします
//        cursor.close()
//        connection.close()
//
//        print("データベースが更新されました")
//
//    except sqlite3.Error as error:
//        print("データベースエラー:", error)
//
//# 使用例
//sql_query = "UPDATE your_table SET column1 = 'value1' WHERE column2 = 'value2';"
//update_database(sql_query)

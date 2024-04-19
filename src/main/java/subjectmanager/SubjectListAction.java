package subjectmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SubjectListAction {

    public static void main(String[] args) {
        // データベース接続情報
        String url = "jdbc:h2:tcp://localhost/~/exam";
        String username = "sa";
        String password = "";

        // JDBCドライバのロード
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBCドライバをロードできませんでした。");
            e.printStackTrace();
            return;
        }

        // データベース接続
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("データベースに接続しました。");

            // SQLクエリの実行
            String sql = "SELECT * FROM subject";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {

                // 結果の処理
                while (resultSet.next()) {
                    // レコードからデータを取得
                    String school_cd = resultSet.getString("school_cd");
                    String cd = resultSet.getString("cd");
                    String name = resultSet.getString("name");

                }
            } catch (SQLException e) {
                System.out.println("SQLクエリの実行中にエラーが発生しました。");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("データベースに接続できませんでした。");
            e.printStackTrace();
        }
    }
}

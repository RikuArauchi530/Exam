package dao;

import java.sql.ResultSet;
import java.util.List;

import bean.School;
import bean.Student;

public class StudentDAO extends DAO {

	
	public Student get(String no) {
        // 学生番号に基づいてデータベースから学生情報を取得するロジックを実装
        return null; // 仮の戻り値
    }

    
    public List<Student> postFilter(ResultSet rs, School school) {
        // ResultSetを解析して、特定の学校に該当する学生のリストを返すロジックを実装
        return null; // 仮の戻り値
    }

    public List<Student> filter(School school, int entryYear, String classNum, boolean isAttend) {
        // 学校、入学年、クラス番号、出席状況に基づいて学生をフィルタリングするロジックを実装
        return null; // 仮の戻り値
    }

    public List<Student> filter(School school, int entryYear, boolean isAttend) {
        // 学校、入学年、出席状況に基づいて学生をフィルタリングするロジックを実装
        return null; // 仮の戻り値
    }

   
    public List<Student> filter(School school, boolean isAttend) {
        // 学校と出席状況に基づいて学生をフィルタリングするロジックを実装
        return null; // 仮の戻り値
    }

   
    public boolean save(Student student) {
        // 学生情報をデータベースに保存するロジックを実装
        return false; // 仮の戻り値
    }

    
    public boolean delete(Student student) {
        // 学生情報をデータベースから削除するロジックを実装
        return false; // 仮の戻り値
    }
}

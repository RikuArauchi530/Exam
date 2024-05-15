package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class StudentDAO extends DAO {
	
	public List<Student> search(String keyword) throws Exception {
		List<Student> list=new ArrayList<>();
		
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"select * from student where name like ?");
		st.setString(1, "%"+keyword+"%");
		ResultSet rs=st.executeQuery();
		
		while (rs.next()) {
			Student s=new Student();
			s.setNo(rs.getString("no"));
			s.setName(rs.getString("name"));
			s.setEntYear(rs.getInt("ent_Year"));
			s.setClassNum(rs.getString("class_Num"));
			list.add(s);
		}
		
		st.close();
		con.close();
		
		return list;
	}
	
	public int insert(Student student) throws Exception {
		Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement(
				"INSERT INTO student (no, name, ent_Year, class_Num) VALUES (?, ?, ?, ?)");
		st.setString(1, student.getNo());
		st.setString(2, student.getName());
		st.setInt(3, student.getEntYear());
		st.setString(4, student.getClassNum());
		
		int affectedRows = st.executeUpdate();
		
		st.close();
		con.close();
		
		return affectedRows;
		
	}
}
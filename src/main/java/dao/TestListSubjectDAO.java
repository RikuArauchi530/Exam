package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.TestListSubject;

public class TestListSubjectDAO extends DAO {
	public List<TestListSubject> postFilter(ResultSet rSet) throws Exception {
		List<TestListSubject> list=new ArrayList<>();
		
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"select subject_cd from test where name like ?");
		st.setString(1, "%"+rSet+"%");
    	ResultSet rs=st.executeQuery();
    	
    	while (rs.next()) {
    		TestListSubject s=new TestListSubject();
    		s.setEntYear(rs.getInt("EntYear"));
    		
    	}
    st.close();
    con.close();
    
    return list;
	}
	
	public List<TestListSubject> search(int entYear,String classNum,String keyword) throws Exception {
		List<TestListSubject> list=new ArrayList<>();
		
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"select * from test where name like ?");
		st.setString(1, "%"+keyword+"%");
    	ResultSet rs=st.executeQuery();
		
    	while (rs.next()) {
    		TestListSubject s=new TestListSubject();
    		s.setEntYear(rs.getInt("EntYear"));
    		s.setStudentNo(rs.getString("Student_No"));
    		s.setStudentName(rs.getString("Student_Name"));
    		s.setClassNum(rs.getString("Class_Num"));
    		list.add(s);
    	}
	
	st.close();
	con.close();
	
	return list;
		
	}
	
	
}
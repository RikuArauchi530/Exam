package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.TestListStudent;

public class TestListStudentDAO extends DAO {
	/*public List<TestListStudent> postFilter(ResultSet rSet) throws Exception {
		List<TestListStudent> list=new ArrayList<>();
		
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"select subject_cd from test where name like ?");
		st.setString(1, "%"+rSet+"%");
    	ResultSet rs=st.executeQuery();*/
    	
    	
	
	public List<TestListStudent> postfilter(String keyword) throws Exception {
		List<TestListStudent> list=new ArrayList<>();
		
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"select * from test where student_no like ?");
		st.setString(1, "%"+keyword+"%");
    	ResultSet rs=st.executeQuery();
		
    	while (rs.next()) {
    		TestListStudent s=new TestListStudent();
    		s.setSubjectName(rs.getString("subjectName"));
    		s.setSubjectCd(rs.getString("subjectCd"));
    		s.setNum(rs.getInt("num"));
    		s.setPoint(rs.getInt("point"));
    		list.add(s);
    	}
	
	st.close();
	con.close();
	
	return list;
		
	}
	
	
}
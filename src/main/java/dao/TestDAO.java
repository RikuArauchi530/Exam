package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Test;

public class TestDAO extends DAO {
	public List<Test> search(String keyword) throws Exception {
		List<Test> list=new ArrayList<>();
		Connection con=getConnection();
    	
    	PreparedStatement st=con.prepareStatement(
    			"select * from test where name like ?");
    	st.setString(1, "%"+keyword+"%");
    	ResultSet rs=st.executeQuery();
    	
    	while (rs.next()) {
    		Test s=new Test();
    		s.setstudentNo(rs.getString("studentNo"));
    		s.setClassNum(rs.getString("cd"));
    		s.setsubjectCd(rs.getString("subjectCd"));
    		s.setschoolCd(rs.getString("schoolCd"));
    		s.setNo(rs.getInt("no"));
    		s.setPoint(rs.getInt("student"));
    		list.add(s);
    	}
    	
    	st.close();
    	con.close();
    	
    	return list;
	}
	
	
}
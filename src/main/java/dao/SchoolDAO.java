package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.School;

public class SchoolDAO extends DAO {
	public void search(String cd) throws Exception {
		Connection con=getConnection();
    	
    	PreparedStatement st=con.prepareStatement(
    			"select * from school where name like ?");
    	st.setString(1, "%"+cd+"%");
    	ResultSet rs=st.executeQuery();
    	
    	while (rs.next()) {
    		School s=new School();
    		s.setCd(rs.getString("cd"));
    		s.setName(rs.getString("name"));
    	}
    	
    	st.close();
    	con.close();
    	
    	return ;
	}
}
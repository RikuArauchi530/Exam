package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClassNumDAO extends DAO {
	public List<String> search(String keyword) throws Exception {
		List<String> list=new ArrayList<>();
		Connection con=getConnection();
    	
    	PreparedStatement st=con.prepareStatement(
    			"select * from classnum where name like ?");
    	st.setString(1, "%"+keyword+"%");
    	ResultSet rs=st.executeQuery();
    	
    	while (rs.next()) {
    		String s=new String();
    	
    		list.add(s);
    	}
    	
    	st.close();
    	con.close();
    	
    	return list;
	}
}
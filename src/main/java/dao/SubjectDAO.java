package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Subject;

public class SubjectDAO extends DAO {

    public List<Subject> search(String keyword) throws Exception {
    	List<Subject> list=new ArrayList<>();
    	
    	Connection con=getConnection();
    	
    	PreparedStatement st=con.prepareStatement(
    			"select * from subject where name like ?");
    	st.setString(1, "%"+keyword+"%");
    	ResultSet rs=st.executeQuery();
    	
    	while (rs.next()) {
    		Subject s=new Subject();
    		s.setSchool_cd(rs.getString("school_cd"));
    		s.setCd(rs.getString("cd"));
    		s.setName(rs.getString("name"));
    		list.add(s);
    	}
    	
    	st.close();
    	con.close();
    	
    	return list;
    	
    }
    
    public int insert(Subject subject) throws Exception {
        Connection con = getConnection();
        
        PreparedStatement st = con.prepareStatement(
                "INSERT INTO subject (school_cd, cd, name) VALUES (?, ?, ?)");
        st.setString(1, subject.getSchool_cd());
        st.setString(2, subject.getCd());
        st.setString(3, subject.getName());
        
        int affectedRows = st.executeUpdate();
        
        st.close();
        con.close();
        
        return affectedRows;
    }
}

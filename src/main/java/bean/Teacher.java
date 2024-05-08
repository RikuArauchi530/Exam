package bean;


public class Teacher implements java.io.Serializable {
	
	private String id;
	private String password;
	private String name;
	private School school;
	private String school_cd;
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public School getSchool() {
		return school;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSchool(School school) {
		this.school=school;
	}
	public void setSchool_cd(String school_cd) {
		this.school_cd=school_cd;	
	}
}
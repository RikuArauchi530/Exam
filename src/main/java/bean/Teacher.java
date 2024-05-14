package bean;


public class Teacher implements java.io.Serializable {
	
	private String id;
	private String password;
	private String name;
	private School school;
	private String schoolCd;
	
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
	public String getSchoolCd() {
		return schoolCd;
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
	public void setSchoolCd(String schoolCd) {
		this.schoolCd=schoolCd;
	}
}
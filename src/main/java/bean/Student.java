package bean;

public class Student implements java.io.Serializable {
	
	private String no;
	private String name;
	private int ent_Year;
	private String class_Num;
	private boolean is_Attend;
	private School school;
	
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getEntYear() {
		return ent_Year;
	}
	public String getClassNum() {
		return class_Num;
	}
	public boolean getIsAttend() {
		return is_Attend;
	}
	public School getSchool() {
		return school;
	}
	
	public void setNo(String no) {
		this.no=no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEntYear(int ent_Year) {
		this.ent_Year=ent_Year;
	}
	public void setClassNum(String class_Num) {
		this.class_Num=class_Num;
	}
	public void setIsAttend(boolean is_Attend) {
		this.is_Attend=is_Attend;
	}
	public void setSchool(School school) {
		this.school=school;
	}
}
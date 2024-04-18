package bean;

import java.util.Map;


public class TestListSubject implements java.io.Serializable {
	
	private int entYear;
	private String student_No;
	private String student_name;
	private String classNum;
	private Map<Integer,Integer> points;
	private int key;
	private int value;
	
	public TestListSubject() {
		
	}
	public int getEntYear() {
		return entYear;
	}
	public String getStudentNo() {
		return student_No;
	}
	public String getStudentName() {
		return student_name;
	}
	public String getClassNum() {
		return classNum;
	}
	public Map<Integer,Integer> getPoints() {
		return points;
	}
	public String getPoint(String key) {
		return key;
	}
	
	public void setEntYear(int entYear) {
		this.entYear = entYear;
	}
	public void setStudentNo(String student_No) {
		this.student_No = student_No;
	}
	public void setStudentName(String student_name) {
		this.student_name  = student_name;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	public void setPoints(Map<Integer,Integer> points) {
		this.points = points;
	}
	public void putPoint(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	
}
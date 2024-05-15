package bean;

public class Test implements java.io.Serializable {
	
	private Student student;
	private String classNum;
	private Subject subject;
	private School school;
	private int no;
	private int point;
	private String studentNo;
	private String subjectCd;
	private String schoolCd;
	
	public Student getStudent() {
		return student;
	}
	public String getClassNum() {
		return classNum;
	}
	public Subject getSubject() {
		return subject;
	}
	public School getSchool() {
		return school;
	}
	public int getNo() {
		return no;
	}
	public int getPoint() {
		return point;
	}
	public String getstudentNo() {
		return studentNo;
	}
	public String getsubjectCd() {
		return subjectCd;
	}
	public String getschoolCd() {
		return schoolCd;
	}
	
	public void setStudent(Student student) {
		this.student=student;
	}
	public void setClassNum(String classNum) {
		this.classNum=classNum;
	}
	public void setSubject(Subject subject) {
		this.subject=subject;
	}
	public void setSchool(School school) {
		this.school=school;
	}
	public void setNo(int no) {
		this.no=no;
	}
	public void setPoint(int point) {
		this.point=point;
	}
	public void setstudentNo(String studentNo) {
		this.studentNo=studentNo;
	}
	public void setsubjectCd(String subjectCd) {
		this.subjectCd=subjectCd;
	}
	public void setschoolCd(String schoolCd) {
		this.schoolCd=schoolCd;
	}
}
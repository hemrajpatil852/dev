package pojo;


import java.util.*;

public class Student {

	private int studentId;
	private String studentName;
	private int StudentAge;
	private String studentCity;
	private int studentPercentage;
	private static ArrayList<Course> course;

	public Student(int studentId, String studentName, int studentAge, String studentCity, int studentPercentage,
			ArrayList<Course> course) {
		this.studentId = studentId;
		this.studentName = studentName;
		StudentAge = studentAge;
		this.studentCity = studentCity;
		this.studentPercentage = studentPercentage;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public int getStudentPercentage() {
		return studentPercentage;
	}

	public void setStudentPercentage(int studentPercentage) {
		this.studentPercentage = studentPercentage;
	}

	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", StudentAge=" + StudentAge
				+ ", studentCity=" + studentCity + ", studentPercentage=" + studentPercentage + ", course=" + course
				+ "]";
	}

}
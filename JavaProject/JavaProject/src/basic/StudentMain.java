package basic;

import java.util.HashSet;

class Course {
	int courseId;
	String courseName;

	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}

}

class Student {
	int studId;
	String studName;
	int studRollNo;
	Course c;

	public Student(int studId, String studName, int studRollNo, Course c) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studRollNo = studRollNo;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studRollNo=" + studRollNo + ", c=" + c + "]";
	}

}
     
public class StudentMain {

	public static void main(String[] args) {

		HashSet<Student> set = new HashSet<>();
		set.add(new Student(1, "Raj", 1001, new Course(123, "Java")));
		set.add(new Student(2, "rahul", 1002, new Course(125, "php")));
		set.add(new Student(3, "kunal", 1003, new Course(124, "c")));
		set.add(new Student(4, "himanshu", 1004, new Course(125, "php")));
		set.add(new Student(3, "kunal", 1003, new Course(124, "c")));

		
		
		System.out.println(set.size());
		for (Student s : set) {
			System.out.println(s);
		}

	}
}

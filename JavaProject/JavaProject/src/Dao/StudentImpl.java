
package Dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import Exceptions.StudentNotFoundException;
import pojo.Course;
import pojo.Student;

public class StudentImpl implements StudentCrud {

	List<Student> list = new ArrayList<Student>();
	
	HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

	Scanner sc = new Scanner(System.in);

	@Override
	public void addStudent() {

		System.out.println("Enter the Student Id : ");
		int studentId = sc.nextInt();

		System.out.println("Enter the Student Name : ");
		String studentName = sc.next();

		System.out.println("Enter the Student age : ");
		int studentAge = sc.nextInt();

		System.out.println("Enter the Student City : ");
		String studentCity = sc.next();

		System.out.println("Enter the Student Percentage : ");
		int studentPercentage = sc.nextInt();

		ArrayList<Course> course = new ArrayList<>();

		int courseId = 0;
		String courseName = null;
		for (int i = 1; i <= 2; i++) {
			System.out.println(" 1.Java \n 2.python \n 3.DotNet \n 4.SqL");
			System.out.println("Enter the course using above Menu");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				courseId = 101;
				courseName = "Java";
				break;
			case 2:
				courseId = 102;
				courseName = "Python";
				break;
			case 3:
				courseId = 103;
				courseName = "DotNet";
				break;
			case 4:
				courseId = 104;
				courseName = "Sql";
				break;
			default:
				System.err.println("Invalid Choise Please Try Later...!");

			}

			System.out.println("Enter the Course Fees : ");
			int courseFees = sc.nextInt();

			if (courseId != 0 && courseName != null) {

				course.add(new Course(courseId, courseName, courseFees));
			}
		}

		list.add(new Student(studentId, studentName, studentAge, studentCity, studentPercentage, course));

		System.out.println("\n Student added successfully...!");
	}

	@Override
	public void removeStudent() {

		System.out.println("Enter the Student id you want to Remove : ");
		int removeId = sc.nextInt();

		Iterator<Student> itr = list.iterator();

		while (itr.hasNext()) {
			Student str = itr.next();
			if (str.getStudentId() == removeId) {
				itr.remove();
			}
		}

		System.out.println("Student Removed Successfully...!");

	}

	@Override
	public void updateStudent() {

		System.out.println("Enter the Student id you want to Update : ");
		int updateId = sc.nextInt();

		for (Student stud : list) {
			if (updateId == stud.getStudentId()) {
				ArrayList<Course> course = stud.getCourse();

				for (Course c : course) {
					System.out.println(c.getCourseName());
				}

				System.out.println("Enter te couser name");
				String courseName = sc.next();

				for (Course c : course) {
					if (c.getCourseName().equalsIgnoreCase(courseName)) {
						System.out.println("Enter the New Fees For that Course : ");
						int newFee = sc.nextInt();

						c.setCourseFees(newFee);
					}
				}

			}
		}

		// Logic For only Course fee Update

//		for (Student s : al) {
//			if (s.getStud_id() == s_id) {
//				System.out.println("Enter the new Course Fee For Update : ");
//				int new_fee = sc.nextInt();
//				s.getC().setFees(new_fee);
//			}
//		}

		System.out.println("Student Update Successfully...!");
	}

	@Override
	public void searchStudent() throws StudentNotFoundException {

		System.out.println("Enter the Student Name : ");
		String searchName = sc.next();
		Student stud = null;
		int flag = 0;
		for (int i = 0; i < list.size(); i++) {
			stud = list.get(i);
			if (stud.getStudentName().equalsIgnoreCase(searchName)) {

				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			System.out.println("Student Id : " + stud.getStudentId());
			System.out.println("Student Name : " + stud.getStudentName());
			System.out.println("Student Age : " + stud.getStudentAge());
			System.out.println("Student City : " + stud.getStudentCity());
			System.out.println("Student Percentage : " + stud.getStudentPercentage());

			ArrayList<Course> course = stud.getCourse();

			for (Course c : course) {

				System.out.println();
				System.out.println("Course Id : " + c.getCourseId());
				System.out.println("Course Name : " + c.getCourseName());
				System.out.println("Course Fees : " + c.getCourseFees());
			}
		} else {
			throw new StudentNotFoundException("Student with name " + searchName + " not found...!");
		}
	}

	@Override
	public List<Student> displayAllStudents() {

		System.out.println("\n List of all students...!");
		System.out.println();

		for (Student stud : list) {

			System.out.println("Student Id : " + stud.getStudentId());
			System.out.println("Student Name : " + stud.getStudentName());
			System.out.println("Student Age : " + stud.getStudentAge());
			System.out.println("Student City : " + stud.getStudentCity());
			System.out.println("Student Percentage : " + stud.getStudentPercentage());

			ArrayList<Course> course = stud.getCourse();

			for (Course c : course) {

				System.out.println();
				System.out.println("Course Id : " + c.getCourseId());
				System.out.println("Course Name : " + c.getCourseName());
				System.out.println("Course Fees : " + c.getCourseFees());
			}

			System.out.println("----------------------");

		}
		return list;
	}

	@Override
	public List<Student> displayStudentsByCourse() {

		// Map - key is course name and values is list of names of students from course

		Iterator<Student> itr = list.iterator();

		while (itr.hasNext()) {
			Student stud = itr.next();
			ArrayList<Course> course = stud.getCourse();

			for (Course c : course) {
				String courseName = c.getCourseName();

				if (hashMap.containsKey(courseName)) {
					ArrayList<String> list = hashMap.get(courseName);
					list.add(stud.getStudentName());
					hashMap.put(courseName, list);

				} else {
					ArrayList<String> list1 = new ArrayList<String>();
					list1.add(stud.getStudentName());
					hashMap.put(courseName, list1);
				}
			}
		}

		Set<Entry<String, ArrayList<String>>> entry = hashMap.entrySet();

		for (Map.Entry<String, ArrayList<String>> map : entry) {

			System.out.println(map.getKey() + "  " + map.getValue());
		}

		System.out.println("Name of Students By Course...!");
		return list;

	}

	@Override
	public void searchStudentByCourse() {

		System.out.println("Enter the Course Name : ");
		String courseName = sc.next();
		//this.displayStudentsByCourse();

		if (hashMap.containsKey(courseName)) {
			ArrayList<String> studentName = hashMap.get(courseName);

			for (String stud : studentName) {
				System.out.println(stud);
			}
		}
	}

}

package Dao;

import java.util.List;

import com.OOPS.Student;

import Exceptions.StudentNotFoundException;

public interface StudentCrud {

	public void addStudent();

	public void removeStudent();

	public void updateStudent();
	
	public void searchStudentByCourse();

	public void searchStudent() throws StudentNotFoundException;

	List<pojo.Student> displayAllStudents();

	List<pojo.Student> displayStudentsByCourse();
}

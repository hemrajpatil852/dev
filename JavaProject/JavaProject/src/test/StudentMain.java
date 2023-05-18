package test;

import java.util.Scanner;

import Dao.StudentCrud;
import Dao.StudentImpl;
import Exceptions.StudentNotFoundException;

public class StudentMain {

	public static void main(String[] args) {

		System.out.println("Display All Student Data");
		String input = "";

		Scanner sc = new Scanner(System.in);

		StudentCrud student = new StudentImpl();

		do {

			System.out.println("1. Add A Student");
			System.out.println("2. Remove A Student");
			System.out.println("3. Search For A Student By Name");
			System.out.println("4. Update Student");
			System.out.println("5. Display A List Of All Students");
			System.out.println("6. Display A List Of Students By Course");
			System.out.println("7. Search Student By Course");
			System.out.println("0. Exit");

			System.out.print("Enter your choice: ");

			int choise = sc.nextInt();

			switch (choise) {

			case 1:
				student.addStudent();
				break;

			case 2:
				student.removeStudent();
				break;

			case 3:
				try {
					student.searchStudent();
				} catch (StudentNotFoundException e) {

					System.err.println(e.getMessage());
				}
				break;

			case 4:
				student.updateStudent();
				break;

			case 5:
				student.displayAllStudents();
				break;

			case 6:
				student.displayStudentsByCourse();
				break;

			case 7:
				student.searchStudentByCourse();
				break;

			case 0:
				System.out.println("Exit");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");

			}
			System.out.println();

			System.out.println("Do you want to continue yes/no");
			input = sc.next();

		} while (input.equalsIgnoreCase("Yes"));

		sc.close();
	}
}
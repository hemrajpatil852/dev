package com.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Stu {
    private String name;
    private String studentID;
    private String course;

    public Stu(String name, String studentID, String course) {
        this.name = name;
        this.studentID = studentID;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getCourse() {
        return course;
    }
}

class StudentManagementSystem {
    private List<Stu> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();

        Stu student = new Stu(name, studentID, course);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name or ID to remove: ");
        String searchTerm = scanner.nextLine();

        boolean removed = false;
        for (Stu student : students) {
            if (student.getName().equals(searchTerm) || student.getStudentID().equals(searchTerm)) {
                students.remove(student);
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void searchStudentByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name to search: ");
        String searchTerm = scanner.nextLine();

        boolean found = false;
        for (Stu student : students) {
            if (student.getName().equalsIgnoreCase(searchTerm)) {
                System.out.println("Student found:");
                System.out.println("Name: " + student.getName());
                System.out.println("Student ID: " + student.getStudentID());
                System.out.println("Course: " + student.getCourse());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of all students:");
            for (Stu student : students) {
                System.out.println("Name: " + student.getName());
                System.out.println("Student ID: " + student.getStudentID());
                System.out.println("Course: " + student.getCourse());
                System.out.println("---------------------------");
            }
        }
    }

    public void displayStudentsByCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course name to display students: ");
        String searchTerm = scanner.nextLine();

        boolean found = false;
        System.out.println("List of students in course '" + searchTerm + "':");
        for (Stu student : students) {
            if (student.getCourse().equalsIgnoreCase(searchTerm)) {
                System.out.println("Name: " + student.getName());
                System.out.println("Student ID: " + student.getStudentID());
                System.out.println("---------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No students found in the specified course.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        int choice;
        do {
            System.out.println("Student Management System Menu:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search for a student by name");
            System.out.println("4. Display a list of all students");
            System.out.println("5. Display a list of students by course");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    system.addStudent();
                    break;
                case 2:
                    system.removeStudent();
                    break;
                case 3:
                    system.searchStudentByName();
                    break;
                case 4:
                    system.displayAllStudents();
                    break;
                case 5:
                    system.displayStudentsByCourse();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 0);
    }
}


package Exceptions;

@SuppressWarnings("serial")
public class StudentNotFoundException extends Exception {

	public StudentNotFoundException(String name) {
		super(name);
	}
}

package day14_2InvalidAgeException.copy;

public class InvalidAgeException extends RuntimeException{

	public InvalidAgeException() {
		super("not eligible to vote");
		// TODO Auto-generated constructor stub

	}
	public InvalidAgeException(String mg) {
		super(mg);
	}

	
}

package day14_1InvalidAgeException;

public class InvalidAgeException extends Exception{

	public InvalidAgeException() {
		super("not eligible to vote");
		// TODO Auto-generated constructor stub

	}
	public InvalidAgeException(String mg) {
		super(mg);
	}

	
}

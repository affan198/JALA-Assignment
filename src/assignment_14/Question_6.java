/*
6. Write a program to create your own exception
*/
package assignment_14;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		if(age <18) {
			throw new VoterEligibility("you are not eligible for voting.");
		}

	}

}

class VoterEligibility extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public VoterEligibility(String message) {
		super(message);
	}

	
}
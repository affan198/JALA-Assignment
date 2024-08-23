package assignment_14;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(5/0);
		} catch (Exception e) {
			System.out.println("handling arithmetic exception.");
			e.printStackTrace();
		}
		
	}

}

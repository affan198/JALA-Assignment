/*
6. Program for relational operators (<,<==, >, >==)
*/
package assignment_2;

public class Question_6 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 2;

		if(a<b) {
			System.out.println("if a is less then b this block will be executed");
		}
		if(b<=d) {
			System.out.println("if b less then or equals to d, this block will be executed");
		}
		if(c>b) {
			System.out.println("if c is greater then b this block will be executed");
		}
		if(d>=b) {
			System.out.println("if d is greater then or equals to b, this block will be executed");
		}
		
		
	}

}

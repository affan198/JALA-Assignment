/*3. Read text from a .txt file using BufferedInputStream
*/
package assignment_15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in;
		try {
			in = new FileInputStream("C:\\Users\\affan\\Desktop\\hello.txt");
			BufferedInputStream bis = new BufferedInputStream(in); 
			byte[] allBytes = bis.readAllBytes();
			for(byte b : allBytes) {
				System.out.print((char)b);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

/*
4. Write text to a .txt file using BufferedOutputStream
*/
package assignment_15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutputStream out;
		try {
			out = new FileOutputStream("C:\\Users\\affan\\Desktop\\hello.txt");
			BufferedOutputStream bos = new  BufferedOutputStream(out);
			String s = "data is inserting through BufferedOutputStream";
			
			for(int i=0;i<s.length();i++) {
				char charAt = s.charAt(i);
				bos.write((byte)charAt);
			}
			bos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

/*8. Write text to a .txt file using BufferedWriter
*/
package assignment_15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Writer w;
		try {
			w = new FileWriter(new File("C:\\Users\\affan\\Desktop\\hello.txt"));
			BufferedWriter bw = new BufferedWriter(w);
			String s = "adding data to txt file using BufferedWriter.";
			Writer append = bw.append(s);
			append.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

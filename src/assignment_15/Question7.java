/*7. Read text from a .txt file using BufferedReader
*/
package assignment_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reader in;
		try {
			in = new FileReader(new File("C:\\Users\\affan\\Desktop\\hello.txt"));
			BufferedReader br = new BufferedReader(in);
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

/*9. Write a program to read data from properties file.
*/

/*hello.properties this is file name
url=jdbc:oracle:@localhost:thin:1521:xe
username=affan
password=xyz
*/


package assignment_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\affan\\Desktop\\hello.properties"));
			p.load(fis);
			
			String url = p.getProperty("url");
			String uname = p.getProperty("username");
			String pass = p.getProperty("password");
			System.out.println(url);
			System.out.println(uname);
			System.out.println(pass);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

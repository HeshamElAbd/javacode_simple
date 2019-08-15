/* @Author: Hesham El Abd
 * @Description: a Demo for file handling in JAVA
 * @usage: java FileHandling.java
 */
import java.io.File;
import java.io.IOException;

public class FileHandling{
	public static void main(String []args) {
		File d_File= new File("DemoFile.txt");
		try {if (d_File.createNewFile()) {
			System.out.println("Your File has been created"+d_File.getName());
		}else {
			System.out.println("File Already exist.");
		}
		}catch(IOException e) {
			System.out.println("An error has occured");
			e.printStackTrace();
		}
	}
}
/* @Author: Hesham El Abd
 * @Description: A java program to print a summary about a file.
 * @usage: java FileSummary.java file
 *
 */
import java.io.IOException;
import java.io.File;

public class FileSummary{
	public static void main(String []args) {
		
		if (args.length<1) {
			System.out.println("No File was provided !!!");
			return;
		}
		try {
			File inputFile = new File(args[0]);
			if (inputFile.exists()) {
				System.out.println("The File name is: "+inputFile.getName());
				System.out.println("The absolute path is: "+inputFile.getAbsolutePath());
				System.out.println("The canonical path is: "+inputFile.getCanonicalPath());
				System.out.println("File Size: "+inputFile.length()+" bytes");
				System.out.println("Writable: "+inputFile.canWrite());
				System.out.println("Readable: "+inputFile.canRead());
				System.out.println("Executable: "+inputFile.canExecute());
			}
		}catch(IOException e) {
			System.out.println("a problem occured during execution");
			e.printStackTrace();
		}
	}
}
 
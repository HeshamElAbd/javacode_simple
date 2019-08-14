/* @Author: Hesham EL Abd
 * @Description: A code to illustrate the use of exception in JAVA
 * @Usage: $ java ExceptionDemo.java 
 */
import java.io.*;
public class ExceptionDemo{
	public static void main(String []args) {
		int[] smallArray = {1,2,4};
		System.out.println("Declaring an array with three elements");
		System.out.println("Accessing the 4 elements will raise an exception as follow");
		try {
			System.out.println("Here is the error"+smallArray[smallArray.length+1]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The exceptions has been captured as: "+e);
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}
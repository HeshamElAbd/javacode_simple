/*A simple Do while Loop in JAVA
 * The code illustrates the main differences between while and do while */

public class SimpleDoWhileLoop{
	public static void main(String []args) {
		// a while loop that while loop that will not be executed
		boolean flag=false;
		while(flag) {System.out.println("I will not be exectued");}
		// using a do while loop
		do {
			System.out.println("I will be executed");
		}while(flag);
		System.out.println("End execution");
		
	}
}
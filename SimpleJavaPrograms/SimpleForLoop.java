/*A simple for loop in JAVA*/
public class SimpleForLoop{
	public static void main(String []args) {
		for(int iter=0;iter<100;iter++) {
			if(iter%2==0) {
				System.out.println("it is an even number");
			} else {
				System.out.println("it is an odd number");
			}
		}
		System.out.println("Your Code has been executed");
	}
}
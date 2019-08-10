/* A study case for some examples in java programming */
public class JavaOps{
	public static void main(String []args) {
		int a,b,c; // declaring three variables
		a=1;
		b=5;
		c=25;
		String res = (c%b==0)? "yeap":"nope";
		System.out.println("The result is "+res);
		if(res instanceof String) {System.out.println("it is an instance of String Object");}
	}
}
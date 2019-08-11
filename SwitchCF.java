/*Switch control flow in JAVA*/
public class SwitchCF{
	public static void main(String []args) {
		// this is the input value to compare against a metric scheme
		int grade=1;
		switch(grade) {
		case  4:
			System.out.println("almost made it");
			break;
		case 3:
			System.out.println("Hmm, not bad");
			break;
		case 2: 
			System.out.println("Push harder man, you are almost there");
			break;
		case 1: 
			System.out.println("Good Work man,  good work");
		}
		System.out.println("Your Code has been executed");
		
	}
}
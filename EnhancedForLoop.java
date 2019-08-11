/*An Enhanced For-loop in JAVA*/
public class EnhancedForLoop{
	public static void main(String []args) {
		int [] numbers= {1,2,3,4,5,6,7,8,9}; // declare an array of numbers
		for(int num:numbers) {
			System.out.println("Currently at: "+num);
		}
		System.out.println("The Enhanced For Loop has been executed");
		
		String [] names= {"dev_1","dev_2","dev_3","dev_4","dev_5"};
		
		for(String name:names) {
			System.out.println("Current name is "+name);
		}
	}
}
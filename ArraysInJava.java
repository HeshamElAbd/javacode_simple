/* Working with JAVA Arrays*/
public class ArraysInJava{
	public static void main(String []args) {
		// constructing two arrays,the first has the value and the second 
		// stores the square of the first element
		double [] array_1= {1,2,3,4,5,6,7,8,9};
		double [] pow_array= new double[array_1.length];
		System.out.println("Computing the Square of array 1");
		for(int iter=0;iter<array_1.length;iter++) {
			pow_array[iter]=Math.pow(array_1[iter], 2);
		}
		
		System.out.println("Printing the output");
		for(int iter=0;iter<array_1.length;iter++) {
			System.out.println("Input value: "+array_1[iter]
					+" Squared value"+pow_array[iter]);
		}		
	}
}

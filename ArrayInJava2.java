public class ArrayInJava2{
	
	public static double [] reverse(double [] input_array) {
		/* 
		 * The function takes an input array, reverse the order of its elements
		 * and return the output array */
		double [] result_array=new double[input_array.length];
		int counter=1;
		for(int iter=0;iter<input_array.length;iter++) {
			int idx=input_array.length-counter;
			result_array[idx]=input_array[iter];
			counter++;
		}
		return result_array;
	}
	
	public static void main(String []args) {
		double [] array_1= {1,2,3,4,5,6,7,8,9,10};
		double [] array_2=reverse(array_1);
		
		for(int iter=0;iter<array_1.length;iter++) {
			System.out.println("the original elements"+array_1[iter]
					+" the reversed-index elements"+array_2[iter]);
		}
		System.out.println("end execution");
	}
}







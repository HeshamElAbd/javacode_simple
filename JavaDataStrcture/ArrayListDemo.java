/* @Authror: Hesham El Abd
 * @Description: a simple java program to demonstrate how to work with 
 * Java collections 
 * @usage: $ java JavaCollectionsExample.java*/

 import java.util.ArrayList;
 
 public class ArrayListDemo{
	 public static void printArray(ArrayList<String> anarray) {
		 /*Print the element of an ArrayList in JAVA*/
		 if(anarray.size()==0) {
			 System.out.println("Sorry, your array is empty. There is nothing to print ");
		 } else {
			 for (int iter=0;iter<anarray.size();iter++) {
				 System.out.println("The "+iter+" th element of the array is ==>"+
			 anarray.get(iter));
			 }
		 }
	 }
	 public static void main(String []args) {
		 System.out.println("A demo for Array list usages in JAVA");
		 // declare an input array
		 ArrayList<String> array_list=new ArrayList<String>(5);
		 // the integer inside the declaration represent the reserved size, a 
		 // form of resource allocation.
		 // declare a classical array of fixed size to hold some variables
		 String [] plan_array = {"I","Love","JAVA","So","much","3>"};
		 System.out.println("Adding the elements of the old vector to the new vector");
		 for (String word:plan_array) {
			 array_list.add(word);
		 }
		 System.out.println("The elements of the new array is");
		 printArray(array_list);
		 System.out.println("Adding values to the array after its decleration");
		 array_list.add("Work");
		 array_list.add("Harder");
		 array_list.add("Get");
		 array_list.add("Stronger");
		 System.out.println("printing the elements of the array:");
		 printArray(array_list);
		 System.out.println("Removing three elements from the array");
		 array_list.remove(0); // remove the first element
		 array_list.remove(3); // remove the third elements
		 System.out.println("The elements of the array list after removing the elements: ");
		 printArray(array_list);
		 System.out.println("Remove all the element of the array");
		 array_list.clear();
		 printArray(array_list);
		 System.out.println("End Execution");
	 }
 }
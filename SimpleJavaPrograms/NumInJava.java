/*working with number through the MATH Package*/
public class NumInJava{
	public static void main(String []args) {
		System.out.println("Number methods");
		Integer a=5; 
		//first to string: 
		String b= a.toString();
		if (b instanceof String) {
			System.out.println("b is a string ");
		}
		Double c = a.doubleValue();
		System.out.println("working with it");
		Double d=Math.exp(a);
		System.out.println("The Exp of a is: "+d.toString());
		Double e = Math.pow(a, d);
		System.out.println("The output of 5 raised to the power of exp(5) is: "+e.toString());
		// working with the trig functions:
		Double sin_e=Math.sin(e);
		Double cos_e=Math.cos(e);
		Double tahn_e=Math.tan(e);
		System.out.println("The output of the trig"
				+ ": sin==> "+sin_e.toString()+"\t"
				+ "cos==> "+cos_e.toString()+"\t"
				+ "tan==> "+tahn_e.toString()+"\t"
				);
	}
}
/*Learning about class construction and enums in JAVA*/
class Juice{
	enum JuiceSize{Small,Meduim,Large} // an eumirator of restricted possible values
	JuiceSize size;
}

public class JuiceTest{
	public static void main(String []args) {
		Juice juice=new Juice(); // an instance of class Juice
		juice.size=Juice.JuiceSize.Large;
		System.out.println("your juice size is: "+juice.size);
	}
}
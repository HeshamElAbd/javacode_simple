/* an impelementation of the Class Dog*/
public class Dog{
	// Declare some enms:
	enum DogSize{Small, Large, Huge}
	enum Breed{A,B,C,D,E}
	// Define the fields
	String name;
	int age;
	String color;
	DogSize size;
	Breed breed;
	
	// Define the class constructors: 
	public Dog() { // default constructor
		name="A dog";
		age=1;
		color="black";
		size=DogSize.Small;
		breed=Breed.A;
		System.out.println("A dog has been created using the default values");
	}
	
	public Dog(String dogname, int dogage,
			String dogcolor,DogSize dogsize,Breed dogbreed){
		name=dogname; age=dogage; color=dogcolor;size=dogsize;breed=dogbreed;
		System.out.println("The Dog has been created using your charachters");
	};
	
	// Define the class methods:
	void barking() {} // these function return a void type
	void sleeping() {} 
	void eating() {}
	
	// adding some getter and sitter functions: 
	String getName() {
		return name;
	}
	 void setName(String dogname) {
		 name=dogname;
	 }
	 
	 void printName(){
		 System.out.println("your Dog name is: "+name);
	 }
	// defining main: 
	public static void main(String []args) {
		System.out.println("constructing two dogs");
		Dog firstDog=new Dog(); // creating Dog with the default constructor
		Dog secondDog=new Dog("myDog", 4,"Black",DogSize.Huge,Breed.D);
		System.out.println("Your first Dog name is: "+ firstDog.getName());
		System.out.println("your second Dog name is: "+ secondDog.getName());
		System.out.println("Change the Dog name using the sitter method");
		firstDog.setName("alpha-42");
		System.out.println("The name of the first dog after updating its name is"+firstDog.getName());
		System.out.println("Done with the Execution");
	}
}
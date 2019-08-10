/* Building the blueprint for the class Employee*/
public class Employee{
	// fields declarations:
	String name;
	String designation;
	int age;
	double salary;
	
	//writing the constructors:
	Employee(){
		name="Not-assigned";
		designation="Not-assigned";
		age=0;
		salary=0.0;
	}
	
	Employee(String empname,String empdesg,int empage, double empSal){
		name=empname;
		designation=empdesg;
		age=empage;
		salary=empSal;
	}
	// writing the sit and get functions: 
	public String getName() {return name;}
	public String getDesignation() {return designation;}
	public int getAge() {return age;}
	public double getSalary() {return salary;}
	
	public void setName(String empname) {name=empname;}
	public void setDesignation(String empdes) {designation=empdes;}
	public void setAge(int empage) {age=empage;}
	public void setSalary(double empsal) {salary=empsal;}
	
	// A print functions:
	public void printInfo() {
		System.out.println("******* print the Employee info *******");
		System.out.println("\t Name: "+name);
		System.out.println("\t Designation:"+designation);
		System.out.println("\t Age: "+age);
		System.out.println("\t Salary: "+salary);
		System.out.println("****************************************");
	}
	
}
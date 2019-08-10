/* The Employee Test file*/
public class EmployeeTest{
	public static void main(String []argc) {
	Employee emp_1=new Employee(); // declare an employee without any informations
	Employee emp_2=new Employee("bob","developer",26,1000); // declare an employee with informations
		// print the information about both employees:
	emp_1.printInfo(); // print the info of the first employee;
	emp_2.printInfo(); // print the info of the second employee;
	// updating the info of emp_1
	emp_1.setName("bob_2");
	emp_1.setDesignation("developer_2");
	emp_1.setAge(35);
	emp_1.setSalary(2000);
	// print the information after updating it: 
	System.out.println("updating emp_1 infos ..");
	System.out.println("The information of emp_1 after updating");
	emp_2.printInfo();
	System.out.println("******** End Execution ********");
	}
	
	
}

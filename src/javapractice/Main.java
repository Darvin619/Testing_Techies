package javapractice;

public class Main{

	public static void main(String[] args) {
		 
		Employee Emp = new Employee();
		Manager MGR = new Manager();
		
		Emp.Name = "Raj";
		Emp.Age = 25;
		Emp.PhoneNumber = "9587463210";
		Emp.Address = "India";
		Emp.Salary = 2365478;
		Emp.Specialization = "Employee";
		Emp.PrintEmp();
		Emp.printsalary();
		
		System.out.println("");
		
		MGR.Name = "Sachin";
		MGR.Age = 45;
		MGR.PhoneNumber = "8032145698";
		MGR.Address = "America";
		MGR.Salary = 6255478;
		MGR.department = "Manager";
		MGR.printMGR();	
		MGR.printsalary();
				
	}
}

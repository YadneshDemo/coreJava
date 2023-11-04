package OOPS;

public class Employee {
	
	public String Name;
	public int EmpId;
	private int Salary;
	
	public void Display()
	
	{
		System.out.println("Name of the employee is :" +Name);
		System.out.println("Employee ID of the employee is:" +EmpId);
		System.out.println("Salary of the employee is :" +Salary);

	}
	
	public void SetSalary(int sal)
	{
		this.Salary=sal;
	}
	
	public Employee()
	{
		System.out.println("Inside default constructor");
	}
	
	public Employee(String Name1, int EmpId, int Sal)
	{
		this.Name= Name1;
	
		this.EmpId= EmpId;
		this.Salary= Sal;
	}
}

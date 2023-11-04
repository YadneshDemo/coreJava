package OOPS;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.EmpId=100;
		emp1.Name="Yadnesh";
		emp1.SetSalary(50000);
		
		Employee emp2= new Employee();
		emp2.EmpId=101;
		emp2.Name="Pravin";
		emp2.SetSalary(40000);
		
		Employee emp3= new Employee("Piyush", 102, 60000);
		
		emp1.Display();
		emp2.Display();
		emp3.Display();
		
		
	
	}

}

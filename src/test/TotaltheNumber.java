package test;

public class TotaltheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1= 10282023;
		int num2;
		int sum=0;
		int rev=0;
		
		while(num1 !=0)
		{
			num2= num1%10;
			System.out.println("Current Remainder :" +num2);
			
			num1= num1/10;
			System.out.println("Current Number :" +num1);
			
			sum= sum+num2;
			System.out.println("Current total :" +sum);
			
			rev= (rev*10)+num2;
			System.out.println("Reverse value :" +rev); 
		}
		System.out.println("Final Total :" +sum);
		System.out.println("Final Reverse Value :" +rev);

	}

}

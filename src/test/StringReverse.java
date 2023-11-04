package test;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am feeling lucky";
		String rev = "";
		char x;

		System.out.println("Orignal String is :" + str);

		for (int i = 0; i < str.length(); i++) {
			x = str.charAt(i);
			System.out.println("Current Character :" + x);

			rev = x + rev;
			System.out.println("Current String :" + rev);
		}
		System.out.println("Reverse String is:" + rev);

	}

}

package Report;

public class report_5_10 {

	public static void main(String[] args) {
		String a = "javaprogramming";
//		            0123456789abcde
		a = a.substring(5,7);
//		ro
		char b = a.charAt(1);
//		ro���� 1�� �ε��� o
		a = a+b; // ro+o
		System.out.println(a);
	} // end of main

} // end of class

package Unviersity;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int n;
		
		System.out.print("���� �Է� : ");
		str = sc.next();
		System.out.print("�ڸ� ���� �Է� : ");
		n = sc.nextInt();

		String[] subStringArray = str.split("(?<=\\G.{" + n + "})");

		System.out.println(Arrays.toString(subStringArray));
	} // end of main

} // end of class

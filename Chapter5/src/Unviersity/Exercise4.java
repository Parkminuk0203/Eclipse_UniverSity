package Unviersity;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int n;
		
		System.out.print("문자 입력 : ");
		str = sc.next();
		System.out.print("자를 개수 입력 : ");
		n = sc.nextInt();

		String[] subStringArray = str.split("(?<=\\G.{" + n + "})");

		System.out.println(Arrays.toString(subStringArray));
	} // end of main

} // end of class

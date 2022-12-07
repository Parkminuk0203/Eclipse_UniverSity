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

		String[] subarr = str.split("(?<=\\G.{" + n + "})");
		
		System.out.print("분리된 문자열 :");
		for(int i=0; i<subarr.length; i++) {
			System.out.print("[\"" + subarr[i] + "\"]");
		}
	} // end of main

} // end of class

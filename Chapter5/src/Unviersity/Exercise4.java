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

		String[] subarr = str.split("(?<=\\G.{" + n + "})");
		
		System.out.print("�и��� ���ڿ� :");
		for(int i=0; i<subarr.length; i++) {
			System.out.print("[\"" + subarr[i] + "\"]");
		}
	} // end of main

} // end of class

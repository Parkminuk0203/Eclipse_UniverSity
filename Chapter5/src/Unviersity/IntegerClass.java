package Unviersity;
import java.util.*;
public class IntegerClass {

	public static void main(String[] args) {
		String s1, s2;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ���� �ΰ� �Է� : ");
		s1 = sc.next(); // next�� �����̽��ٷ� �Է��ص� ��
		s2 = sc.next();
		
		sum += Integer.parseInt(s1) + Integer.parseInt(s2); // ���ڿ��� ������ �ٲ���
		System.out.println(s1 + " + " + s2 + " = " + sum);
		System.out.println("������ : " + Integer.toBinaryString(sum)); // �������� �ٲ���
		
	} // end of main

} // end of class

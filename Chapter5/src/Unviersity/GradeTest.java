package Unviersity;
import java.util.*;
public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int English = sc.nextInt();
		Grade me = new Grade(math,science,English);
		System.out.println("����� " + me.average(math, science, English));
	} // end of main

} // end of class

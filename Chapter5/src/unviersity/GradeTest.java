package unviersity;
import java.util.*;
public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int English = sc.nextInt();
		Grade me = new Grade(math,science,English);
		System.out.println("평균은 " + me.average(math, science, English));
	} // end of main

} // end of class

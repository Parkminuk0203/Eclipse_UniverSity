package Unviersity;
import java.util.*;
public class IntegerClass {

	public static void main(String[] args) {
		String s1, s2;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("더 할 숫자 두개 입력 : ");
		s1 = sc.next(); // next는 스페이스바로 입력해도 됨
		s2 = sc.next();
		
		sum += Integer.parseInt(s1) + Integer.parseInt(s2); // 문자열을 정수로 바꿔줌
		System.out.println(s1 + " + " + s2 + " = " + sum);
		System.out.println("이진수 : " + Integer.toBinaryString(sum)); // 이진수로 바꿔줌
		
	} // end of main

} // end of class

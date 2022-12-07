package Unviersity;
import java.util.*;
public class Test {

	public static void main(String[] args) {
// 문자열 변환 프로그램
		String my_str, str_lower;
		byte arr[];
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		my_str = sc.next();
		str_lower = my_str.toLowerCase();
		System.out.print("변환된 문자열 : " + str_lower);
//		arr = str_lower.getBytes();
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
	} // end of main

} // end of class

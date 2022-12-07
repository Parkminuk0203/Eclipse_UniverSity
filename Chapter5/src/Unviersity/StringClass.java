package Unviersity;
import java.util.*;
public class StringClass {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열을 입력하세요>");
			str = sc.next();
			if(str.equals("quit")==true) { // 만약 str이 quit와 비교하여 true이면
				break; // 반복 종료
			}
			if(str.matches("^www\\.(.+)")) {
				System.out.println(str + " 은 'www'로 시작합니다.");
			} else {
				System.out.println(str + " 은 'www'로 시작하지 않습니다.");
			}
			
		}
	} // end of main

} // end of class

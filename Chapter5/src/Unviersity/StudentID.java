package Unviersity;

import java.util.Scanner;

public class StudentID {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("학번을 입력하세요> ");
			str = sc.next();
			if(str.equals("quit")==true) { // 만약 str이 quit와 비교하여 true이면
				break; // 반복 종료
			}
			if(str.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
				System.out.println(str + " 은 '학번'입니다.");
			} else {
				System.out.println(str + " 은 '학번'이 아닙니다.");
			}
			
		}
	}

}

package Unviersity;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
//	세균 증식 프로그램
	Scanner sc = new Scanner(System.in);
	int number = 0, time = 0, sum=0;
	
	while (true) {
	System.out.print("세균마리수 : ");
	number = sc.nextInt();
	sum = number;
	System.out.print("경과 시간 : ");
	time = sc.nextInt();
	if (1 > number || 10 < number) {
		System.out.println("세균 마리수가 범위를 벗어났습니다.");
	} 
	else if(1 > time || 15 < time) {
		System.out.println("시간이 너무 많습니다.");
	}
	else {
		for(int i=0; i<time; i++) {
			sum *= 2;
		}		
		System.out.println(number+"마리가 " + time + "시간 후에 " + sum + "마리로 번식함");
	}
	System.out.println("-----------------------------");
	}
	
	} // end of main

} // end of class
package UniverSity;

import java.util.*;

public class ArrayTest1 {

	public static void main(String[] args) {
//		사용자 5명의 성적을 입력받아 평균을 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum=0, avg=0;
		// 성적 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1+"번 성적을 입력하시오:");
			arr[i] = sc.nextInt();
		}

		// 평균 성적 구하기
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		avg = sum / arr.length;
		System.out.println("평균 성적은 " + avg + "입니다.");

	} // end of main

} // end of class

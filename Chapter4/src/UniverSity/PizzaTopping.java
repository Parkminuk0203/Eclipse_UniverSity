package UniverSity;

import java.util.*;

public class PizzaTopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
//		arr[3] = sc.next();
//		arr[4] = sc.next(); // next는 스페이스로 구분되어서 3번에 스페이스 입력하면 4번에 넘어가짐
//		arr[4] = sc.nextLine(); // 띄어쓰기도 허용 엔터 칠때 까지 입력 받음
		
		// 토핑 입력 받아 추가
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"번 토핑 :");
			arr[i] = sc.next();
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	} // end of main

} // end of class

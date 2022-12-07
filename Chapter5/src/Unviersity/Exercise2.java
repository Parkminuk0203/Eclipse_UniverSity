package Unviersity;

import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
//	숫자 맞추기 야구게임 프로그램
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int com, c1, c2, c3, user, u1, u2, u3, count=0, strike=0, ball=0;

		// 난수 생성
		for (;;) {
			com = rnd.nextInt(886) + 102;
			c3 = com % 10;         // 일의 자리
			c2 = (com / 10) % 10;  // 십의 자리
			c1 = (com / 100) % 10; // 백의 자리

			if (c1 == c2 || c2 == c3 || c1 == c3) {
				continue;
			} else {
				break;
			}
		} // end of for
		System.out.println("com : " + com);
		
		do {
			strike = 0;
			ball = 0;
			System.out.print("숫자 3자리 입력 : ");
			user = sc.nextInt();
			u3 = user % 10;
			u2 = (user/10) % 10;
			u1 = (user/100) % 10;
			if (u3 == c3) {
				strike++;
			} else if (u3 == c1 || u3 == c2) {
				ball++;
			}
			if (u2 == c2) {
				strike++;
			} else if (u2 == c1 || u2 == c3) {
				ball++;
			}
			if (u1 == c1) {
				strike++;
			} else if (u1 == c2 || u1 == c3) {
				ball++;
			}
			System.out.println(strike + " strike " + ball + " ball" );
			count++;
		} while(strike<3);
		System.out.printf("*** 축하합니다. %d번만에 성공!! ***",count);
		
		
	} // end of main

} // end of class

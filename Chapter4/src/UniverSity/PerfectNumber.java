package UniverSity;
import java.util.*;
public class PerfectNumber {
	public static void main(String[] args) {
//		완전수 구하기
		int i = 0, j = 0, sum = 0;
		for (i = 1; i <= 1000; i++) {
			sum = 0;
			for (j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			// 약수만 출력
			if (i == sum) {
				System.out.println(i);
			}
		}
		System.out.println("약수의 합:" + sum);
	} // end of main

} // end of class
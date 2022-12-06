package UniverSity;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] dice = new int[100];
		int[] freq = new int[7];
		
		// 난수 생성
		for(int i=0; i<dice.length; i++) {
			dice[i] = rnd.nextInt(6)+1; // 1~6까지 난수 100개 생성 
		}
		// 빈도 배열을 사용하여 숫자가 나온 횟수 적립
		for(int i=0; i<dice.length; i++) {
			freq[dice[i]]++;
		}
		// 1~6까지 나온 횟수 출력
		for(int i=1; i<freq.length; i++) {
			System.out.printf("%d : %d\n",i,freq[i]);
		}
		
		
		
	} // end of main

} // end of class

package UniverSity;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		int[] dice = new int[100]; // 100번 저장 공간
		int[] freq = new int[7];  // 빈도 배열
		Random rnd = new Random();
		
		// 난수생성 100개
		for(int i=0; i<dice.length; i++) {
			dice[i] = rnd.nextInt(6)+1; // 1~6 난수 생성
			freq[dice[i]]++;
//			dice[i] = 1 -> freq[1]++
//			dice[i] = 2 -> freq[2]++
//			dice[i] = 3 -> freq[3]++
//			dice[i] = 4 -> freq[4]++
//			dice[i] = 5 -> freq[5]++
//			dice[i] = 6 -> freq[6]++
		}
		for(int i=1; i<freq.length; i++) {
			System.out.println(i + ":" + freq[i] + "개");
		}
		
		
	} // end of main

} // end of class

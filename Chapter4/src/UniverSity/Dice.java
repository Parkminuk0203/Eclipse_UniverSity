package UniverSity;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] dice = new int[100];
		int[] freq = new int[7];
		
		// ���� ����
		for(int i=0; i<dice.length; i++) {
			dice[i] = rnd.nextInt(6)+1; // 1~6���� ���� 100�� ���� 
		}
		// �� �迭�� ����Ͽ� ���ڰ� ���� Ƚ�� ����
		for(int i=0; i<dice.length; i++) {
			freq[dice[i]]++;
		}
		// 1~6���� ���� Ƚ�� ���
		for(int i=1; i<freq.length; i++) {
			System.out.printf("%d : %d\n",i,freq[i]);
		}
		
		
		
	} // end of main

} // end of class

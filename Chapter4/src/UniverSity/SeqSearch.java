package UniverSity;
import java.util.*;
public class SeqSearch {

	public static void main(String[] args) {
//		Ư���� �� ã��
		int[] s = {0,10,20,30,40,50,60,70,80,90,100};
		int value = 0, index = -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� ��: ");
		value = sc.nextInt();
		
		for(int i=0; i<s.length; i++) {
			if(s[i]==value) {
				index = i;
			}
		}
		
		if(index < s.length && index >= 0) {
			System.out.printf("%d���� %d��ġ�� �ֽ��ϴ�.",value,index);
		}
	} // end of main

} // end of class

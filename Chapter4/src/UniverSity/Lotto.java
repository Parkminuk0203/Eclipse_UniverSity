package UniverSity;
import java.util.*;
public class Lotto {

	public static void main(String[] args) {
//	�󵵹迭�� Ȱ���Ͽ� �ߺ����� �ζ� ��ȣ ����
		Random rnd = new Random();
		int[] lotto = new int[6]; 
		int[] freq = new int[46];
		
		System.out.println("===== �ζ� ���ǹ�ȣ ���� =====");
		
		// �ߺ�����
		int i=0;
		for(i=0; i<lotto.length; i++) {
			lotto[i] = rnd.nextInt(45)+1; // 1. lotto[0]�� �ε����� 1�� ���´ٰ� ����
			if(freq[lotto[i]] == 1) {     // 3. lotto[1]�� �ε����� 1�� ���´ٸ� freq[1]�� �ε����� �Ǵµ�
				i--;					  // �̹� 1�� �Ǿ������� i--�Ͽ� �ݺ��Ͽ� �ߺ��� �����Ѵ�.
			}
			else {                        // 2. lotto[0]���� ���� 1�̶� freq[1]�� �ε����� 1�� �ٲ��ش�.
				freq[lotto[i]] = 1;
			}
		}
		
		for(i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		
	} // end of main

} // end of class

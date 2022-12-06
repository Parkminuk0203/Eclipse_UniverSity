package UniverSity;
import java.util.*;
public class Lotto {

	public static void main(String[] args) {
//	빈도배열을 활용하여 중복없이 로또 번호 생성
		Random rnd = new Random();
		int[] lotto = new int[6]; 
		int[] freq = new int[46];
		
		System.out.println("===== 로또 복권번호 생성 =====");
		
		// 중복제거
		int i=0;
		for(i=0; i<lotto.length; i++) {
			lotto[i] = rnd.nextInt(45)+1; // 1. lotto[0]번 인덱스에 1이 나온다고 가정
			if(freq[lotto[i]] == 1) {     // 3. lotto[1]번 인덱스도 1이 나온다면 freq[1]번 인덱스가 되는데
				i--;					  // 이미 1로 되어있으니 i--하여 반복하여 중복을 제거한다.
			}
			else {                        // 2. lotto[0]번의 값은 1이라서 freq[1]번 인덱스를 1로 바꿔준다.
				freq[lotto[i]] = 1;
			}
		}
		
		for(i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		
	} // end of main

} // end of class

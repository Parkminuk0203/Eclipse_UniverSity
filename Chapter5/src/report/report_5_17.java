package report;
import java.util.*;
public class report_5_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		String[] array = str.split(""); // 배열에 한글자씩 저장
		
		
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
		
	}

}

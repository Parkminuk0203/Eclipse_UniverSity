package report;
import java.util.*;
public class report_5_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();
		String[] array = str.split(""); // �迭�� �ѱ��ھ� ����
		
		
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
		
	}

}

package UniverSity;
import java.util.*;
public class Measure {

	public static void main(String[] args) {
//		��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		int i=0;
		for(i=1; i<num; i++) {
			if(num%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("����� ��:"+sum);
	}

}

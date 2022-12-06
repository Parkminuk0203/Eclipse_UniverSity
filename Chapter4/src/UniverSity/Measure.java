package UniverSity;
import java.util.*;
public class Measure {

	public static void main(String[] args) {
//		약수 구하기
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int i=0;
		for(i=1; i<num; i++) {
			if(num%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("약수의 합:"+sum);
	}

}

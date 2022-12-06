package UniverSity;
import java.util.*;
public class ArrayTest2 {

	public static void main(String[] args) {
//		실수를 입력받아 출력
		double[] arr = new double[5];
		Scanner sc = new Scanner(System.in);
		
		// 입력 받기
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번 실수 입력 : ");
			arr[i] = sc.nextDouble();
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	} // end of main

} // end of class

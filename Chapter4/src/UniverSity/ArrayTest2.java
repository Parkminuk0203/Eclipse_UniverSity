package UniverSity;
import java.util.*;
public class ArrayTest2 {

	public static void main(String[] args) {
//		�Ǽ��� �Է¹޾� ���
		double[] arr = new double[5];
		Scanner sc = new Scanner(System.in);
		
		// �Է� �ޱ�
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"�� �Ǽ� �Է� : ");
			arr[i] = sc.nextDouble();
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	} // end of main

} // end of class

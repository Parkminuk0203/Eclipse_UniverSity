package UniverSity;

import java.util.*;

public class PizzaTopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
//		arr[3] = sc.next();
//		arr[4] = sc.next(); // next�� �����̽��� ���еǾ 3���� �����̽� �Է��ϸ� 4���� �Ѿ��
//		arr[4] = sc.nextLine(); // ���⵵ ��� ���� ĥ�� ���� �Է� ����
		
		// ���� �Է� �޾� �߰�
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"�� ���� :");
			arr[i] = sc.next();
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	} // end of main

} // end of class

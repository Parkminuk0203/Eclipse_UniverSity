package UniverSity;

import java.util.*;

public class ArrayTest1 {

	public static void main(String[] args) {
//		����� 5���� ������ �Է¹޾� ����� ���ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� �� �Է� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum=0, avg=0;
		// ���� �Է�
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1+"�� ������ �Է��Ͻÿ�:");
			arr[i] = sc.nextInt();
		}

		// ��� ���� ���ϱ�
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		avg = sum / arr.length;
		System.out.println("��� ������ " + avg + "�Դϴ�.");

	} // end of main

} // end of class

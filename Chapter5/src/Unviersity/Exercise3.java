package Unviersity;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
//	���ڿ� ��ȯ �ý���
		Scanner sc = new Scanner(System.in);
		String str, result;
		byte[] arr;
		byte temp;
		System.out.print("���ڿ� �Է� : ");
		str = sc.next();
		result = str.toLowerCase();
		arr = result.getBytes();
		Arrays.sort(arr); // ��������
		for(int i=0, j =arr.length-1; i<arr.length; i++,j--) {
			if(i<j) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		result = new String(arr);
		
		System.out.println("��ȯ�� ���ڿ� : " + result);
	} // end of main

} // end of class

package Unviersity;

import java.util.Scanner;

public class StudentID {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�й��� �Է��ϼ���> ");
			str = sc.next();
			if(str.equals("quit")==true) { // ���� str�� quit�� ���Ͽ� true�̸�
				break; // �ݺ� ����
			}
			if(str.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
				System.out.println(str + " �� '�й�'�Դϴ�.");
			} else {
				System.out.println(str + " �� '�й�'�� �ƴմϴ�.");
			}
			
		}
	}

}

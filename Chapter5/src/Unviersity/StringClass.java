package Unviersity;
import java.util.*;
public class StringClass {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���ڿ��� �Է��ϼ���>");
			str = sc.next();
			if(str.equals("quit")==true) { // ���� str�� quit�� ���Ͽ� true�̸�
				break; // �ݺ� ����
			}
			if(str.matches("^www\\.(.+)")) {
				System.out.println(str + " �� 'www'�� �����մϴ�.");
			} else {
				System.out.println(str + " �� 'www'�� �������� �ʽ��ϴ�.");
			}
			
		}
	} // end of main

} // end of class

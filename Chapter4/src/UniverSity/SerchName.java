package UniverSity;
import java.util.*;
public class SerchName {

	public static void main(String[] args) {
//		�̸��� ã�� ���° ������� �˾Ƴ���
		Scanner sc = new Scanner(System.in);
		String[] name = {"�ڹο�", "ȫ�浿"};
		String serch;
		int count = 0;
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.print("\nã�� ��� : ");
		serch = sc.next();
		
		for(int i=0; i<name.length; i++) {
			if(serch.equals(name[i])) {
				System.out.println(name[i] + "(��)�� " + (i+1) + "��° ����Դϴ�.");
				count++;
			}
		}
		if(count==0) {
			System.out.println(serch+"(��)�� ã�� �� �����ϴ�.");
		}
	} // end of main

} // end of class

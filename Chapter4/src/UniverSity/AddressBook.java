package UniverSity;
import java.util.*;
public class AddressBook {

	public static void main(String[] args) {
//		�̸��� ��ȭ��ȣ�� ���, �˻�, ����ϴ� ���α׷��� �ۼ�
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		String[] phone = new String[5];
		int menu = 0, count = 0;
		String serch;
		
		while (true) {
			do {
				System.out.println("===== ���� �ּҷ� �޴� =====");
				System.out.println("1.���");
				System.out.println("2.�˻�");
				System.out.println("3.���");
				System.out.println("4.����");
				System.out.println("======================");
				System.out.print("- �޴� ���� :");
				menu = sc.nextInt();
			} while (menu < 1 || menu > 4); {
				switch (menu) {
				case 1 :
					System.out.println("===== �ּҷ� ��� =====");
					System.out.print("����� �̸� : ");
					name[count] = sc.next();
					System.out.print("����� ��ȭ��ȣ : ");
					phone[count] = sc.next();
					count++;
					break;
				case 2 :
					System.out.println("�ּҷ� �˻�");
					System.out.print("- �˻��� �̸� : ");
					serch = sc.next();
					for(int i=0; i<name.length; i++) {
						if(serch.equals(name[i])) {
							System.out.println(name[i] +  " ��ȭ��ȣ : " + phone[i]);
						}
					}
					break;
				case 3 :
					System.out.println("===== �ּҷ� ��� ====="); 
					for(int i=0; i<count; i++) {
						System.out.print(name[i]+ ":" + phone[i]);
						System.out.println();
					}
					break;
				case 4 :
					System.out.println("�ý����� �����մϴ�.");
					break;
				} // end of switch
				if(menu == 4) {
					break;
				}
			} // end of while
		} // end of while
	} // end of main

} // end of class

package UniverSity;
import java.util.*;
public class AddressBook {

	public static void main(String[] args) {
//		이름과 전화번호를 등록, 검색, 출력하는 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		String[] phone = new String[5];
		int menu = 0, count = 0;
		String serch;
		
		while (true) {
			do {
				System.out.println("===== 간단 주소록 메뉴 =====");
				System.out.println("1.등록");
				System.out.println("2.검색");
				System.out.println("3.출력");
				System.out.println("4.종료");
				System.out.println("======================");
				System.out.print("- 메뉴 선택 :");
				menu = sc.nextInt();
			} while (menu < 1 || menu > 4); {
				switch (menu) {
				case 1 :
					System.out.println("===== 주소록 등록 =====");
					System.out.print("등록할 이름 : ");
					name[count] = sc.next();
					System.out.print("등록할 전화번호 : ");
					phone[count] = sc.next();
					count++;
					break;
				case 2 :
					System.out.println("주소록 검색");
					System.out.print("- 검색할 이름 : ");
					serch = sc.next();
					for(int i=0; i<name.length; i++) {
						if(serch.equals(name[i])) {
							System.out.println(name[i] +  " 전화번호 : " + phone[i]);
						}
					}
					break;
				case 3 :
					System.out.println("===== 주소록 출력 ====="); 
					for(int i=0; i<count; i++) {
						System.out.print(name[i]+ ":" + phone[i]);
						System.out.println();
					}
					break;
				case 4 :
					System.out.println("시스템을 종료합니다.");
					break;
				} // end of switch
				if(menu == 4) {
					break;
				}
			} // end of while
		} // end of while
	} // end of main

} // end of class

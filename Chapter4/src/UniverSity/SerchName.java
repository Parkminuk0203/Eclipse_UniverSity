package UniverSity;
import java.util.*;
public class SerchName {

	public static void main(String[] args) {
//		이름을 찾아 몇번째 사람인지 알아내기
		Scanner sc = new Scanner(System.in);
		String[] name = {"박민욱", "홍길동"};
		String serch;
		int count = 0;
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.print("\n찾을 사람 : ");
		serch = sc.next();
		
		for(int i=0; i<name.length; i++) {
			if(serch.equals(name[i])) {
				System.out.println(name[i] + "(은)는 " + (i+1) + "번째 사람입니다.");
				count++;
			}
		}
		if(count==0) {
			System.out.println(serch+"(은)는 찾을 수 없습니다.");
		}
	} // end of main

} // end of class

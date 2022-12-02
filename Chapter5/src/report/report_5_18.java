package report;
import java.util.*;
public class report_5_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		int Consonant=0, vowels=0, i=0;
		for(i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			Consonant++;
			break;
			default :
			vowels++;	
			}
		}
		System.out.printf("자음:%d, 모음:%d",Consonant,vowels);
		
	}

}

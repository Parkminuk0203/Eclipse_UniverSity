package Report;
import java.util.*;
public class LoginTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Login obj = new Login();
		
		System.out.print("아이디 입력 : ");
		obj.id = sc.next();
		obj.check();
		
	}

}

package Report;

public class Login {
	String id;
	
	void check () {
		if(id.equals("박민욱")) {
			System.out.println("아이디가 일치합니다.");
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
}

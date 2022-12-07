package Report;

public class report_5_4 {

	public static void main(String[] args) {
//		1
		String verb = "현실이 된다";
		System.out.println("생각이" + verb);
//		생각이현실이 된다
		
//		2
		String s = "1234567";
		System.out.println("문자열의 길이는" + s.length());
//		문자열의 길이는7
		
//		3
//		String s = "ABCDEFG"; // 변수 중복 선언 때문에 error
		String s1 = "ABCDEFG";
		s1.toLowerCase();     // 소문자로 만드는 함수, 값이 바뀌지는 않음
		System.out.println(s1);
//		ABCDEFG
		System.out.println(s1.toLowerCase());
//		abcdefg
		
//		4
		System.out.println("2 + 3 = " + (2 + 3));
//		2 + 3 = 5
		
//		5
		System.out.println("2 + 3 = " + 2 + 3);
//		2 + 3 = 23
	} // end of main
} // end of class

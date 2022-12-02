package unviersity;

public class StringTest {

	public static void main(String[] args) {
		String str = new String("Hello World!");
		
		System.out.println(str.charAt(6));  // 6번 인덱스
		System.out.println(str.charAt(11)); // 11번 인덱스
		System.out.println(str.equals("Hello World!")); // 문자열 비교
		System.out.println(str.compareTo("Aello World!"));
		System.out.println(str.concat("Aello")); // 문자열 합치기
		System.out.println(str.length()); // 문자열 길이
		System.out.println(str.isEmpty()); // length가 0이면 true 반환
		System.out.println(str.equalsIgnoreCase("hello world!")); // 대소문자를 무시하고 비교
		System.out.println(str.toUpperCase()); // 대문자로 변경
		System.out.println(str.toLowerCase()); // 소문자로 변경
	}

}

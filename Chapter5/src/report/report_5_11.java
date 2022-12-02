package report;

public class report_5_11 {

	public static void main(String[] args) {
		String x = "abc";
		x.toUpperCase(); 
		// 대문자로 바뀌는 함수, 이 상태에서는 값 자체가 바뀌지는 않는다.
		String y = x.replace('a', 'd');
		// a를 d로 바꾼다
		y = y + "xyz";
		// dbc + xyz
		System.out.println(y);
		
	} // end of main

} // end of class

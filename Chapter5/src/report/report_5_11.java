package report;

public class report_5_11 {

	public static void main(String[] args) {
		String x = "abc";
		x.toUpperCase(); 
		// �빮�ڷ� �ٲ�� �Լ�, �� ���¿����� �� ��ü�� �ٲ����� �ʴ´�.
		String y = x.replace('a', 'd');
		// a�� d�� �ٲ۴�
		y = y + "xyz";
		// dbc + xyz
		System.out.println(y);
		
	} // end of main

} // end of class

package Report;

public class report_5_4 {

	public static void main(String[] args) {
//		1
		String verb = "������ �ȴ�";
		System.out.println("������" + verb);
//		������������ �ȴ�
		
//		2
		String s = "1234567";
		System.out.println("���ڿ��� ���̴�" + s.length());
//		���ڿ��� ���̴�7
		
//		3
//		String s = "ABCDEFG"; // ���� �ߺ� ���� ������ error
		String s1 = "ABCDEFG";
		s1.toLowerCase();     // �ҹ��ڷ� ����� �Լ�, ���� �ٲ����� ����
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

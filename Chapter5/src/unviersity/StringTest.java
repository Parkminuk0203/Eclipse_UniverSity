package unviersity;

public class StringTest {

	public static void main(String[] args) {
		String str = new String("Hello World!");
		
		System.out.println(str.charAt(6));  // 6�� �ε���
		System.out.println(str.charAt(11)); // 11�� �ε���
		System.out.println(str.equals("Hello World!")); // ���ڿ� ��
		System.out.println(str.compareTo("Aello World!"));
		System.out.println(str.concat("Aello")); // ���ڿ� ��ġ��
		System.out.println(str.length()); // ���ڿ� ����
		System.out.println(str.isEmpty()); // length�� 0�̸� true ��ȯ
		System.out.println(str.equalsIgnoreCase("hello world!")); // ��ҹ��ڸ� �����ϰ� ��
		System.out.println(str.toUpperCase()); // �빮�ڷ� ����
		System.out.println(str.toLowerCase()); // �ҹ��ڷ� ����
	}

}

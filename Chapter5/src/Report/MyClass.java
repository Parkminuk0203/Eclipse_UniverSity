package Report;
class MyClass {}

class TTest {
	MyClass doSomething() {
		MyClass b = new MyClass(); // 6��° ��
		return b;
	}

	public static void main(String args[]) {
		TTest t = new TTest();				// TTest�� ����Ű�� ��ü t ����
		MyClass newObj = t.doSomething();   // myclass�� dosomething �޼��尡 ����Ǿ� ��ü b�� myclass�� ����Ű�� newobj�� ���� 
		newObj = new MyClass(); // 13��° ��    // newobj�� �ٽ� �����Ͽ� ���� ����Ű�� �ִ� ��ü b�� ����
	}									    // ������ 6��°��
}
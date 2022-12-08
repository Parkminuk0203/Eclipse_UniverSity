package Report;
class MyClass {}

class TTest {
	MyClass doSomething() {
		MyClass b = new MyClass(); // 6번째 줄
		return b;
	}

	public static void main(String args[]) {
		TTest t = new TTest();				// TTest를 가르키는 객체 t 생성
		MyClass newObj = t.doSomething();   // myclass의 dosomething 메서드가 실행되어 객체 b가 myclass를 가르키는 newobj에 대입 
		newObj = new MyClass(); // 13번째 줄    // newobj를 다시 선언하여 기존 가르키고 있던 객체 b가 끊김
	}									    // 정답은 6번째줄
}
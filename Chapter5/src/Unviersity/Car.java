package Unviersity;

public class Car {
//	private String color; // �� Ŭ�����ȿ����� ���� �����ϰ� ����
//	private int speed; 	  // �� Ŭ�����ȿ����� ���� �����ϰ� ����
//	private int gear;  	  // �� Ŭ�����ȿ����� ���� �����ϰ� ����
	String color; // ����
	int speed; 	  // �ӵ�
	int gear;  	  // ���
	void print() {
		System.out.println("color=" + color + "\nspeed=" + speed + "\ngear=" + gear);
	}
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		if(speed >= 10) { // ���ǵ尡 10�̻��� ����
			speed -= 10;  // ���ǵ� -10
		}
	}
	void setColor(String str) {
		color = str;
	}
}

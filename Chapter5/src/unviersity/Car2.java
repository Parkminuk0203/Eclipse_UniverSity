package unviersity;

public class Car2 {
	String color; // ����
	int speed; 	  // �ӵ�
	int gear;  	  // ���
	
	Car2(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
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

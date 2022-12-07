package Unviersity;

public class Car {
//	private String color; // 내 클래스안에서만 변경 가능하게 제한
//	private int speed; 	  // 내 클래스안에서만 변경 가능하게 제한
//	private int gear;  	  // 내 클래스안에서만 변경 가능하게 제한
	String color; // 색상
	int speed; 	  // 속도
	int gear;  	  // 기어
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
		if(speed >= 10) { // 스피드가 10이상일 때만
			speed -= 10;  // 스피드 -10
		}
	}
	void setColor(String str) {
		color = str;
	}
}

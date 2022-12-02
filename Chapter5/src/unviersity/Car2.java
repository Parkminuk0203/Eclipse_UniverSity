package unviersity;

public class Car2 {
	String color; // 색상
	int speed; 	  // 속도
	int gear;  	  // 기어
	
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
		if(speed >= 10) { // 스피드가 10이상일 때만
			speed -= 10;  // 스피드 -10
		}
	}
	void setColor(String str) {
		color = str;
	}
	
	

}

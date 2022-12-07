package Unviersity;

public class CarTest {

	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println(mycar.color + " " + mycar.gear + " " + mycar.speed);
		mycar.changeGear(1);
		mycar.speedUp();
		mycar.setColor("red");
		mycar.speedDown();
		mycar.speedDown();
		mycar.speedDown();
		
		System.out.println(mycar.color + " " + mycar.gear + " " + mycar.speed);
		mycar.print();
		
	} // end of main

} // end of class

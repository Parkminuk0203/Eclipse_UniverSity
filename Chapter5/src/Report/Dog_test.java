package Report;

public class Dog_test {

	public static void main(String[] args) {
		Dog d =new Dog();
		
		d.age = 2;
		d.breed = "말티즈";
		d.color = "하얀색";
		
		System.out.printf("나이 : %d, 품종 : %s, 색깔 : %s\n",d.age,d.breed,d.color);
		d.barking();
		d.hungry();
		d.sleeping();
	} // end of main

} // end of class

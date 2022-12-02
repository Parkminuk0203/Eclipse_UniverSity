package report;

public class Dog_test {

	public static void main(String[] args) {
		Dog d =new Dog();
		
		d.age = 10;
		d.breed = "Áøµ¾°³";
		d.color = "ÇÏ¾á»ö";
		
		System.out.printf("³ªÀÌ : %d, Ç°Á¾ : %s, »ö±ò : %s\n",d.age,d.breed,d.color);
		d.barking();
		d.hungry();
		d.sleeping();
	} // end of main

} // end of class

package Report;

public class Dog_test {

	public static void main(String[] args) {
		Dog d =new Dog();
		
		d.age = 2;
		d.breed = "��Ƽ��";
		d.color = "�Ͼ��";
		
		System.out.printf("���� : %d, ǰ�� : %s, ���� : %s\n",d.age,d.breed,d.color);
		d.barking();
		d.hungry();
		d.sleeping();
	} // end of main

} // end of class

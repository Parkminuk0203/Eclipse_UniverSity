package Unviersity;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
//	���� ���� ���α׷�
	Scanner sc = new Scanner(System.in);
	int number = 0, time = 0, sum=0;
	
	while (true) {
	System.out.print("���ո����� : ");
	number = sc.nextInt();
	sum = number;
	System.out.print("��� �ð� : ");
	time = sc.nextInt();
	if (1 > number || 10 < number) {
		System.out.println("���� �������� ������ ������ϴ�.");
	} 
	else if(1 > time || 15 < time) {
		System.out.println("�ð��� �ʹ� �����ϴ�.");
	}
	else {
		for(int i=0; i<time; i++) {
			sum *= 2;
		}		
		System.out.println(number+"������ " + time + "�ð� �Ŀ� " + sum + "������ ������");
	}
	System.out.println("-----------------------------");
	}
	
	} // end of main

} // end of class
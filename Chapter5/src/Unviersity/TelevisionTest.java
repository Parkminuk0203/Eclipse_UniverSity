package Unviersity;

public class TelevisionTest {

	public static void main(String[] args) {
		Television mytv = new Television();
		mytv.channel = 7;
		mytv.volume = 9;
		mytv.onOFF = true;
		mytv.setChannel(24); // ä�� �� 24�� �ٲ�
		int ch = mytv.getChannel();
		System.out.println("���� ä���� " + ch + "�Դϴ�.");
		mytv.volumeUp();     // ���� 1 ����
		mytv.print();
		
		System.out.println();
		Television yourtv = new Television();
		yourtv.channel = 9;
		yourtv.volume = 12;
		yourtv.onOFF = true;
		yourtv.print();
		ch = yourtv.getChannel(); 
		System.out.println("���� ä���� " + ch + "�Դϴ�.");
		
	} // end of main
} // end of class

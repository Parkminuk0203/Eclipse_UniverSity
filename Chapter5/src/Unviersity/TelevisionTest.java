package Unviersity;

public class TelevisionTest {

	public static void main(String[] args) {
		Television mytv = new Television();
		mytv.channel = 7;
		mytv.volume = 9;
		mytv.onOFF = true;
		mytv.setChannel(24); // 채널 값 24로 바꿈
		int ch = mytv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
		mytv.volumeUp();     // 볼륨 1 증가
		mytv.print();
		
		System.out.println();
		Television yourtv = new Television();
		yourtv.channel = 9;
		yourtv.volume = 12;
		yourtv.onOFF = true;
		yourtv.print();
		ch = yourtv.getChannel(); 
		System.out.println("현재 채널은 " + ch + "입니다.");
		
	} // end of main
} // end of class

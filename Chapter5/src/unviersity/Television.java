package unviersity;
public class Television {
	
	int channel;
	int volume;
	boolean onOFF;

	void volumeUp() {
		volume++;
	}
	void print() {
		System.out.println("ä�� : " + channel + "\n���� : " + volume);
	}
	int getChannel() {
		return channel;
	}
	int getVolume() {
		return volume;
	}
	void setChannel(int ch) {
		channel = ch;
	}
	
	
}


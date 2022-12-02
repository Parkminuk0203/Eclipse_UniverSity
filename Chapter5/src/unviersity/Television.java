package unviersity;
public class Television {
	
	int channel;
	int volume;
	boolean onOFF;

	void volumeUp() {
		volume++;
	}
	void print() {
		System.out.println("Ã¤³Î : " + channel + "\nº¼·ý : " + volume);
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


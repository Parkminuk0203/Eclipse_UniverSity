package Report;
class Complex_Number {
	int real;
	int imag;
	
	void cn_sum (int x, int y) {
		real = x;
		imag = y;
	}
	
	void print() {
		System.out.println(real+imag+"i");
	}
}

package Report;

public class date2 {
	int year;
	int month1;
	int day;
	String month2;

	void DateSet(int y, int m1, int d) {
		year = y;
		month1 = m1;
		day = d;
	}
	
	void DateSet(String m2,int d, int y) {
		month2 = m2;
		day = d;
		year = y;
	}
	
	void print1() {
		System.out.printf("%d.%d.%d", year, month1, day);
	}

	void print2() {
		System.out.printf("%s %d, %d", month2, day, year);
	}
}

package report;

public class date {
	int year;
	int month;
	int day;
	
	void Dateset(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	void print() {
		System.out.printf("%d�� %d�� %d��",year,month,day);
	}
}

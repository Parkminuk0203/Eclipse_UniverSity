package unviersity;

public class TV {
	String name;
	int year;
	int inch;
	
	TV (String n, int y, int i) {
		name = n;
		year = y;
		inch = i;
	}
	
	void show () {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV",name,year,inch);
	}
}

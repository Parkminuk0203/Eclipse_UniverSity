package Unviersity;

public class Grade {
	int math;
	int science;
	int English;
	
	Grade(int m, int s, int e) {
		math = m;
		science = s;
		English = e;
	}
	
	int average(int math, int science, int English) {
		return (math + science + English) / 3;
	}
}

package Report;


public class Report5_13 {
	int sum(int x, int y) {
		return x+y;
	}
	double sum(int x, double y) {
		return x+y;
	}
	double sum(double x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Report5_13 rpt = new Report5_13();
		System.out.println(rpt.sum(10, 20));
		System.out.println(rpt.sum(10.0, 20));
		System.out.println(rpt.sum(10, 20.0));
	
	} // end of main

} // end of class

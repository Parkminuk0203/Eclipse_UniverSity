package report;


public class report_5_12 {
	int sum(int x, int y) {
		return x+y;
	}
	int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	public static void main(String[] args) {
		report_5_12 rpt = new report_5_12();
		System.out.println(rpt.sum(10, 20));
		System.out.println(rpt.sum(10, 20, 30));
	
	} // end of main

} // end of class

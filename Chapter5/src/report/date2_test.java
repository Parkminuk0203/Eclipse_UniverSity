package report;

public class date2_test {

	public static void main(String[] args) {
		date2 d = new date2();
		
		d.DateSet(2012, 7, 12);
		d.print1();
		System.out.println();
		d.DateSet("July", 12, 2012);
		d.print2();
	} // end of main

} // end of class

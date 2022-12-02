package report;

public class Test {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 10;
        myRect.height = 20;
        System.out.println("면적은 " + myRect.area());
        System.out.println("둘레는 " + myRect.perimeter());
        
    } // end of main
} // end of class

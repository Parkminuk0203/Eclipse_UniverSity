package UniverSity;
import java.util.*;
public class Array2D {

	public static void main(String[] args) {
//	2차원 배열(3*5)에 100이하의 값의 난수로 채워서 행의 합계와 열의 합계를 출력하도록 하여라.
	Random rnd = new Random();
	int[][] arr = new int[3][5];
	int[] row = new int[3];
	int[] col = new int[5];
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			arr[i][j] = rnd.nextInt(100)+1;
			System.out.printf("%-5d",arr[i][j]);
			row[i] += arr[i][j];
			col[j] += arr[i][j];
		}
		System.out.println("(" + row[i] + ")");
	}
	for(int value : col) {
		System.out.printf("(%d)",value);
	}
	
	} // end of main

} // end of class

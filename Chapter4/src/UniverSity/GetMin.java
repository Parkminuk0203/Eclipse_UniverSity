package UniverSity;

public class GetMin {

	public static void main(String[] args) {
//		최소값 알고리즘
		int[] arr = {12,3,19,6,18,8,12,4,1,19};
		int min = 99999;
		
		// 최소값 구하기
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최소값 : " + min);
		
	} // end of main

} // end of class

package UniverSity;

public class GetMin {

	public static void main(String[] args) {
//		�ּҰ� �˰���
		int[] arr = {12,3,19,6,18,8,12,4,1,19};
		int min = 99999;
		
		// �ּҰ� ���ϱ�
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("�ּҰ� : " + min);
		
	} // end of main

} // end of class

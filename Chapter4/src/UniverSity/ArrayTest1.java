package UniverSity;

public class ArrayTest1 {

	public static void main(String[] args) {
//		ũ�Ⱑ 10�� ������ �迭�� �����ϰ� ���⿡ 0���� 9������ ������ �迭�� ä��� ���α׷��� ���캸��
		int[] arr = new int[10];
		
		// �� ä���
		for(int i=0; i<arr.length; i++) {
			arr[i] += i;
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	} // end of main

} // end of class

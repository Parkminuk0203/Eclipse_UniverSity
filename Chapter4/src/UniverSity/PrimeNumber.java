package UniverSity;

public class PrimeNumber {

	public static void main(String[] args) {
//		소수 출력
		int[] prime = new int[100];
		int num=0, i=0, count = 0;
		System.out.println("****** 소수 출력 ******");

		for (num = 2; num <= 1000; num++) {
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					break;
				}
			}
		}
		if (i == num) {
			prime[count] = num;
			count++;
		}
		for (int j = 0; j < count; j++) {
			System.out.printf("5%d", prime[j]);
			if ((j + 1) % 5 == 0) {
				System.out.println();
			}
		}

	} // end of main

} // end of class

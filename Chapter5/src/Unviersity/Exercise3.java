package Unviersity;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
//	문자열 변환 시스템
		Scanner sc = new Scanner(System.in);
		String str, result;
		byte[] arr;
		byte temp;
		System.out.print("문자열 입력 : ");
		str = sc.next();
		result = str.toLowerCase();
		arr = result.getBytes();
		Arrays.sort(arr); // 오름차순
		for(int i=0, j =arr.length-1; i<arr.length; i++,j--) {
			if(i<j) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		result = new String(arr);
		
		System.out.println("변환된 문자열 : " + result);
	} // end of main

} // end of class

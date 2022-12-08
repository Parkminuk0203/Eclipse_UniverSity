package Unviersity;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("문자열 입력 : "); 
			String my_str = in.next();     // my_str = 12345    
			System.out.print("자를 문자개수 : ");    
			int split_num = in.nextInt();  //   split_number = 2
			System.out.print("분리된 문자열 : [");
			String[] str = split(my_str, split_num);   // 12345,   
			for (int i = 0; i < str.length; i++) {
				System.out.print("\"" + str[i] + "\"");
				if (i != str.length - 1)
					System.out.print(", ");
			}
			System.out.println("]\n---------------------------");
		}
	} // end of main

	public static String[] split(String my_str, int split_num) {    
		int size = my_str.length() / split_num; 
		if (my_str.length() % split_num > 0)    
			size += 1;                    
		String[] temp = new String[size]; 						    
		int i = 0;																	
		for (; i < temp.length - 1; i++) { 		
			temp[i] = my_str.substring(i * split_num, (i + 1) * split_num); 
		}														   
		temp[i] = my_str.substring(i * split_num, my_str.length());         
		return temp;
	}
} // end of class

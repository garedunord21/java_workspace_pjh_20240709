package test;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
	
	public int solution() {
		
		test2 instance = new test2();
		return -1;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[0];
		int[][] queries = new int[0][0];
		
		while (true) {
			System.out.print("정수 리스트: ");
			int number = scanner.nextInt();
			
			if ((array.length + 1) >= 1 && (array.length + 1) <= 1000 && (queries.length + 1) >= 1 && (queries.length + 1) <= 1000) break;
			
			int[] newNumber = new int[array.length + 1];
			int[][] newNumber1 = new int[queries.length + 1][queries.length + 1];
			
			for (int index = 0; index < array.length; index++) {
				newNumber[index] = array[index];
			}
			
			for (int index = 0; index < queries.length; index++) {
				newNumber1[index] = queries[index];
			}
			
			array[array.length - 1] = number;
			array= newNumber;
		}
		
		System.out.println(Arrays.toString(array));
		scanner.close();
	}

}

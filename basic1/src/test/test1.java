package test;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {
	
	public int solution() {
		
		test1 instance = new test1();
		return -1;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[0];
		
		while (true) {
			System.out.print("정수 리스트: ");
			int inputNumber = scanner.nextInt();
			
			if (inputNumber >= -10 && inputNumber <= 100 && numbers.length + 1 >= 5 && numbers.length + 1 <= 100) break;
			
			int[] numList = new int[numbers.length + 1];
			
			for (int index = 0; index < numbers.length; index++) {
				numList[index] = numbers[index];
			}
			
			numList[numList.length - 1] = inputNumber;
			numbers = numList;
		}
		
		System.out.println(Arrays.toString(numbers));
		scanner.close();
	}
		
}


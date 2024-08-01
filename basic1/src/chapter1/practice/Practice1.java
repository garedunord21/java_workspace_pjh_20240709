package chapter1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
	
	// 사용자로부터 0이상의 숫자를 입력받고
	// 입력받은 숫자를 numbers라고하는 배열에 저장함
	// 만약 사용자가 0미만의 정수를 입력하면
	// 사용자가 입력한 정수들을 모두 출력하고 프로그램을 종료

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		scanner.close();
		int[] numbers = new int[0];
		
		while (true) {
			System.out.print("정수 : ");
			int inputNumber = scanner.nextInt();
			
			if (inputNumber < 8) break;
			
			int[] newNumbers = new int[numbers.length + 1];
			
			for (int index = 0; index < numbers.length; index++) {
				newNumbers[index] = numbers[index];
			}
			
			newNumbers[newNumbers.length - 1] = inputNumber;
			numbers = newNumbers;
		}
		
		// for (int number: numbers) System.out.println(number);
		System.out.println(Arrays.toString(numbers));
	}

}

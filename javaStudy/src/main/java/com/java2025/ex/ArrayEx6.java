package com.java2025.ex;

import java.util.Scanner;

public class ArrayEx6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 받을 숫자의 개수를 입력: ");
		int n = scanner.nextInt();
		
		int[] numbers = new int[n];
		int minNumber, maxNumber;
		
		System.out.println(n + "개의 정수 입력: ");
		for(int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장
		}
		
		// 배열의 첫 번째 값을 넣어둠 
		minNumber = maxNumber = numbers[0];
		
		for(int i = 1; i < n; i++) { // 배열의 두 번째와 첫 번째를 비교
			if(numbers[i] < minNumber) { // 첫 번째 숫자보다 두 번째 숫자가 작으면
				minNumber = numbers[i]; // 두 번째를 첫 번째에 저장 
			} // for문을 돌며 작은 숫자를 minNum에 저장하며 비교
			if(numbers[i] > maxNumber) {
				maxNumber = numbers[i];
			}
			
		}
		
		System.out.println("가장 작은 정수: " + minNumber);
		System.out.println("가장 큰 정수: " + maxNumber);
		
	}
}

package com.java2025.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		int input = 0;
		
		System.out.println("숫자 입력(-1 입력 시 종료): ");
		
		while(true) {
			input = scanner.nextInt();
			
			if(input == -1) {
				break;
			}
			sum += input;
			count++;
		}
		
		double average = (double)sum / count;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + average);
	}

}

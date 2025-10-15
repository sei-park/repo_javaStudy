package com.java2025.ex;

import java.util.Scanner;

public class ArrayEx5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 받을 숫자의 개수를 입력: ");
		int count = scanner.nextInt();
		
		int[] nums = new int[count];
		int sum = 0;
		double average;
		
		System.out.println(count + "개의 정수 입력: ");
		for(int i = 0; i < count; i++) {
			nums[i] = scanner.nextInt();
			sum += nums[i]; 
		}
		average  = (double) sum / count;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + average);
		
	}

}

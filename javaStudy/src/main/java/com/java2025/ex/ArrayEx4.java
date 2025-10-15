package com.java2025.ex;

import java.util.Scanner;

public class ArrayEx4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		int sum = 0;
		double average;
		
		System.out.println("5개의 정수 입력: ");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
			sum += nums[i]; 
		}
		average  = (double) sum / 5;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + average);
		
	}

}

package com.java2025.ex;

public class ForEx3 {
	
	// max 까지 누적 합 계산
	public static void main(String[] args) {
		
		int max = 100;
		int sum = 0;
		
		for(int i = 1; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}

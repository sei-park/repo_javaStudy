package com.java2025.ex;

public class WhileEx3 {
	
	// max 값 까지 누적 합 계산
	public static void main(String[] args) {
		
		int max = 3; // max 값
		int sum = 0; // 누적 합 : 1 + 2 + 3 = 6
		int i = 1;
		
		while (i <= max) {
			sum += i;
			i++;
		}
		
		System.out.println(sum); 
	}

}

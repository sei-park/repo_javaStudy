package com.java2025.ex;

public class WhileEx2 {
	
	// 처음 10개의 짝수를 출력
	public static void main(String[] args) {
		
		int num = 2;
		int count = 1;
		
		while (count <= 10) {
			System.out.println(num);
			num += 2;
			count++;
		}
	}

}
 
package com.java2025.array;

public class EnhancedFor1 {
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		// 일반 for문 
		for(int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			System.out.println(number);
		} 
		
		System.out.println();
		
		// 향상된 for문(배열의 index값이 필요한 경우에는 사용 불가)
		for(int number : numbers) {
			System.out.println(number);
		}
		
		
	
	}

}

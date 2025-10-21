package com.java2025.method;

public class MethodValue2 {
	
	// java는 항상 변수의 값을 복사해서 대입 함(중요)
	public static void main(String[] args) {
		int number = 5; // number = 5 
		System.out.println("1. changeNumber 호출 전, number: " + number);  // number = 5 
		changeNumber(number); 
		System.out.println("4. changeNumber 호출 후, number: " + number); // number = 5 
	}
	
//	public static void changeNumber(int number) { // number = 5 
//		System.out.println("2. changeNumber 변경 전, number: " + number); // number = 5
//		number = number * 2; // number = 10
//		System.out.println("3. changeNumber 변경 후, number: " + number); // number = 10
//	}
	
	public static void changeNumber(int number) { // number = 5 
		System.out.println("2. changeNumber 변경 전, number: " + number); // number = 5
		number = number * 2; // number = 10
		System.out.println("3. changeNumber 변경 후, number: " + number); // number = 10
	}

}

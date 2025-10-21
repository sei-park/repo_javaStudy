package com.java2025.method;

public class MethodCasting1 {
	
	public static void main(String[] args) {
		double number = 1.5;
		printNumber((int) number); // 형변환 
	}
	
	public static void printNumber(int n) {
		System.out.println("숫자: " + n);
	}

}

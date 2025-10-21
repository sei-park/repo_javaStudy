package com.java2025.method;

public class MethodCasting2 {
	
	// 매서드를 호출할 때에는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 함 
	// 타입이 달라도 자동 형변환이 가능한 경우에는 호출할 수 있음
	public static void main(String[] args) {
		int number = 100;
		printNumber(number); // double이 더 큰 타입이기 때문에 자동 형변환이 됨
	}
	
	public static void printNumber(double n) {
		System.out.println("숫자: " + n);
	}

}

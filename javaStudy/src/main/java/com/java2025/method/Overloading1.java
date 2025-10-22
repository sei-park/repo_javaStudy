package com.java2025.method;

public class Overloading1 {
	
	//	오버로딩 
	//	- 이름이 같고 매개변수가 다른 매서드를 여러 개 정의 하는 것
	//	- 매서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩 할 수 있음
	//	- 반환 타입은 인정하지 않음
	
	//매서드 시그니처 
	//- 매서드를 구분할 수 있는 고유한 식별자나 서명
	//- 매서드 이름이 같아도 매서드 시그니처가 다르면 다른 매서드로 간주
	
	public static void main(String[] args) {
		System.out.println("1: " + add(1, 2));
		System.out.println("2: " + add(1, 2, 3));
		
	}
	
	public static int add(int a, int b) {
		System.out.println("1번 호출");
		return a + b;
	}
	
	
	public static int add(int a, int b, int c) {
		System.out.println("2번 호출");
		return a + b + c;
	}
	

}


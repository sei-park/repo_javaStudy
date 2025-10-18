package com.java2025.method;

public class Method2 {
	
	public static void main(String[] args) {
		printHeader();
		System.out.println("프로그램이 동작합니다.");
		printFooter();
	}
	
	// void를 사용하는 이유 : 매서드가 작업을 수행하긴 하지만 그 결과를 호출자에게 반환하지 않을 때
	public static void printHeader() { // void : 리턴값이 없음
		System.out.println("= 프로그램을 시작합니다 =");
		return; // return을 만나면 매서드 종료. void의 경우 생략 가능 
	}
	
	public static void printFooter() {
		System.out.println(" = 프로그램을 종료합니다 = ");
		return;
	}
}

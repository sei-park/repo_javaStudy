package com.java2025.method;

public class MethodReturn2 {
	
	public static void main(String[] args) {
		checkAge(20);
	}
	
	public static void checkAge(int age) {
		if(age < 18) {
			System.out.println(age + "살, 미성년자 출입 불가");
			return; // return을 만나면 매서드를 빠져나감
		}
		System.out.println(age + "살, 입장 가능");
	}

}

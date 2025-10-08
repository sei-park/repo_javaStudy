package com.java2025.ex;

import java.util.Scanner;

public class ScannerEx2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = scanner.nextInt();
		
		if(num % 2 == 00) {
			System.out.println("입력한 숫자 " + num + "는(은) 짝수입니다.");
		} else {
			System.out.println("입력한 숫자 " + num + "는(은) 홀수입니다.");
		}
	}

}

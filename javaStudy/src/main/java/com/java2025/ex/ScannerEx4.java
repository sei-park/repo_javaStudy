package com.java2025.ex;

import java.util.Scanner;

public class ScannerEx4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구구단의 단 수 입력: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(n + "*" + i + " = " + n * i);
		}
	}

}

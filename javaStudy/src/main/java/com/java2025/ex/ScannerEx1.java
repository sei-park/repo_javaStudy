package com.java2025.ex;

import java.util.Scanner;

public class ScannerEx1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scanner.nextLine();
		
		System.out.print("나이 입력: ");
		int age = scanner.nextInt();
		
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "살 입니다."  );
	}

}

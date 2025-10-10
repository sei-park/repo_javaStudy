package com.java2025.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("가격 입력(-1 입력 시 종료): ");
			int price = scanner.nextInt();
			
			if(price == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.print("수량 입력: ");
			int quantity = scanner.nextInt();
			
			int totalPrice = price * quantity;
			System.out.println("총 비용: " + totalPrice);
		}
		
		
		
	}

}

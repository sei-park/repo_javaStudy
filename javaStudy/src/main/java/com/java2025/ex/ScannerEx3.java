package com.java2025.ex;

import java.util.Scanner;

public class ScannerEx3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("음식 입력: ");
		String foodName = scanner.nextLine();
		
		System.out.print("가격 입력: ");
		int foodPrice = scanner.nextInt();
		
		System.out.print("수량 입력: ");
		int foodQuantity = scanner.nextInt(); 
		
		int totalPrice = foodPrice * foodQuantity; // 음식의 총 가격 
		
		System.out.println(foodName + " " + foodQuantity + "개를 주문했습니다. 총 가격은 " + totalPrice + " 입니다.");
		
	}

}

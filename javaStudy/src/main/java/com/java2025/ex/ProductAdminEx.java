package com.java2025.ex;

import java.util.Scanner;

public class ProductAdminEx {
	
	public static void main(String[] args) {
		
		int maxProducts = 10; // 최대 상품 10개
		String[] productNames = new String[maxProducts]; // 상품 이름
		int[] productPrices = new int[maxProducts]; // 상품 가격 
		int productCount = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴 선택: ");
			int menu = scanner.nextInt();  
			scanner.nextLine();
			
			if(menu == 1) {
				System.out.print("상품 이름 입력: ");
				productNames[productCount] = scanner.nextLine();
				
				System.out.print("상품 가격 입력: "); 
				productPrices[productCount] = scanner.nextInt();
				
				productCount++; // 상품 이름과 가겨을 입력 받은 후 카운트를 증가시킴
			}
		}
		
		
		
	}

}

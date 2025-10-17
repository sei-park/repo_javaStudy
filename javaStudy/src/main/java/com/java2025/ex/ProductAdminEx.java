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
				if(productCount >= maxProducts) {
					System.out.println("더 이상 상품을 등록할 수 없습니다.");
					continue; // 다시 while문의 처음으로 돌아감
				}
				
				System.out.print("상품 이름 입력: ");
				productNames[productCount] = scanner.nextLine();
				
				System.out.print("상품 가격 입력: "); 
				productPrices[productCount] = scanner.nextInt();
				
				productCount++; // 상품 이름과 가겨을 입력 받은 후 카운트를 증가시킴
			} else if(menu == 2) {
				if(productCount == 0) {
					System.out.println("등록된 상품이 없습니다.");
					continue;
				} 
				for(int i = 0; i < productCount; i++) {
					System.out.println(productNames[i] + ": " + productPrices[i] + "원");
				}
			} else if(menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}
		
		
		
	}

}

package com.java2025.ex;

import java.util.Scanner;

public class MethodEx4 { 
	
	public static void main(String[] args) {
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1.입금 | 2.출금 | 3. 잔액 확인 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택: ");
			
			int choice = scanner.nextInt();
			int amount;
			
			switch (choice) {
				case 1 :
					System.out.print("입금액 입력: ");
					amount = scanner.nextInt();
					balance = deposit(balance, amount);
					break;
				case 2 :
					System.out.print("출금액 입력: ");
					amount = scanner.nextInt();
					balance = withdraw(balance, amount);
				case 3 :
					System.out.println("현재 잔액: " + balance + "원");
					break; 
				case 4 :
					System.out.println("시스템 종료");
					return; // main 매서드가 종료되며 프로그램이 끝남
				default :
					System.out.println("다시 선택해주세요.");
			}
			
		}
		
	}
	
	public static int deposit(int balance, int amount) {
		 balance += amount;
		 System.out.println(amount + "원을 입금했습니다. 현재 잔액: " + balance + "원");
		 return balance;
	}
	
	public static int withdraw(int balance, int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + balance + "원");
		} else {
			System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
		}
		
		return balance;
	}

}

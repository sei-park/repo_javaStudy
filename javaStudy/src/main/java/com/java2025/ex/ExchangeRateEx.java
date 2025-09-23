package com.java2025.ex;

public class ExchangeRateEx {
	
	public static void main(String[] args) {
		
		int doller = 2;
		
		if(doller < 0) {
			System.out.println("잘못된 금액입니다.");
		} else if (doller == 0) {
			System.out.println("환전할 금액이 없습니다.");
		} else {
			System.out.println("환전 금액은 " + doller * 1300 + "원 입니다.");
		}
		
		
	}

}

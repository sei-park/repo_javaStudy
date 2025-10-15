package com.java2025.ex;

public class ArrayEx1Ref {
	
	public static void main(String[] args) {
		
		int[] students = {90, 80, 70, 60, 50};  
		
		int total = 0;
		for(int i = 0; i < students.length; i++) {
			total += students[i];
		}
		
		// 향상된 for문
//		for(int student : students) {
//			total += student;
//		}
		
		double average = (double) total / 5;
		
		System.out.println("총합: " + total);
		System.out.println("평균: " + average);
 		
	}

}

package com.java2025.ex;

import java.util.Scanner;

public class ArrayEx8 {
	
	public static void main(String[] args) {
		
		// 학생 4명의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균 계산
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생 수 입력: ");
		int studentCount = scanner.nextInt();
		
		int[][] scores = new int[studentCount][3];
		String[] subjects = {"국어", "영어", "수힉"};
		
		// 학생 한 명당 각각의 점수
		for(int i = 0; i < studentCount; i++) { // 학생 4명
			System.out.println((i + 1) + "번 학생의 성적 입력: ");
			for(int j = 0; j < 3; j++) { // 과목 3개
				System.out.print(subjects[j] + " 점수: ");
				scores[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < studentCount; i++) {
			int total = 0;
			for(int j = 0; j < 3; j++) {
				total += scores[i][j];
			}
			double average = total / 3.0;
			System.out.println((i + 1) + "번 학생의 총점: " + total + ",평균: " + average);
		}
		
		
		
		
		
		
	}

}

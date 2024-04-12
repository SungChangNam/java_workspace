package day0404;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int sum =0;
		float avg =0.0f;
		
		
//		int[] score = {,100,88,90,70};
		int[] score = new int[7];
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i+1+" 번째 정수를 입력하세요 ");
			 score[i] = scanner.nextInt();
			 
		}


	}

}

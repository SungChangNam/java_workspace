package day0404;

import java.util.Scanner;

/*
 * Q]
 * 
 * 배열의  저장된 값을 활용하여 총점고 평균을 구하는 프로그램
 * 
 * */
public class ArrayEx04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int sum =0;
		float avg =0.0f;
		
		
//		int[] score = {100,88,90,70};
		int[] score = new int[4];
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i+1+" 번째 정수를 입력하세요 ");
			 score[i] = scanner.nextInt();
			 
		}
		

		for (int i = 0; i < score.length; i++) {
			
			sum += score[i];
			
			
		}
		// 총점을 이용하여 평균을 구한다.
		// 계산 결과를 float 으로 형변환하여 구하다.
		avg =sum/(float)score.length;
		System.out.println("총점은 : " +sum + " avg : " +avg);
		System.out.printf("총점은 :%d  평균은: %s" ,sum,avg);
	}

}

package day0405;

import java.util.Scanner;

/*
 * 
 * 학생수를 입력받아 합계와 평균 표준편차 를 구하는 프로그램을 구현
 * 
 * 단, 배열을 활용
 * 표준 편차 : 점수 - 평균
 * 편차를 출력하되 각 학생별로 출력
 * 
 * 
 *  74.0 
 *  
 *  편차
 *  90 : -16.0 
 *  78 : -4
 *  64 : 10.0
 *  36:  38.
 *  98 : -24
 *  
 * */
public class ArrayEx05 {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int n ;
	double avg=0, a=0;
	int sum =0;
	System.out.print("학생수 입력: ");
	n =scanner.nextInt();
	int[] score = new int[n];
	
	for (int i = 0; i < score.length; i++) {
		System.out.print(i+1+"학생의 점수 입력  : ");
		score[i] =scanner.nextInt();
		sum += score[i];
	}
	System.out.println("점수 총합 :" + sum);
//	avg = sum/score.length;
//	System.out.println("평균" +avg);
//	//편차 출력 학생별로
//	System.out.println("편차");

//	 90 82 64 36 98
	
	for (int i : score) {
		System.out.println(i+": " +(i-avg));
	}
	}
  
}

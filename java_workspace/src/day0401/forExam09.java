package day0401;
/*
 *  문] 
 *  입력된 정수의 평균을 구하는 프로그램을 구현하시오.
 *  먼저 사용자로부터 입력할 정수 개수를 입력받음
 *  그다음 입력 받은 수만큼  평균 값을 구함
 * 입력 값은 정수이고, 평균 값은 실수이다.
 * 
 * 출력
 * 정수의 개수 : 4
 * 정수 입력 :2
 * 정수 입력 :7
 * 정수 입력 :4
 * 정수 입력 :2
 * 정수의 평균 : 3.75
 * */

import java.util.Scanner;

public class forExam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avg =0 ;
		int sum =0;
		int input=0;
		System.out.print("정수의 개수 :");
		int n = sc.nextInt();
		
		
		for (int i = 1;  i <= n ; i++) {
			System.out.print("정수 입력: ");
			input = sc.nextInt();
			sum += input;
			

		}
		avg=(double)sum/n;
		System.out.printf("정수의 평균은 :  %.2f \n" , avg);

	}

}

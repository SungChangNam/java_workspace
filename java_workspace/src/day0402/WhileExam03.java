package day0402;
/*
 * 문]
 * 	임의의 정부를 입력 받아 0이되면 종료
 *  while 문 사용
 * */

import java.util.Scanner;

public class WhileExam03 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int i  =1;
		int num =1;
		int sum = 0;

		
		
		while (num !=0) {
			System.out.print("정수를 입력하세요 :");
			num =  scanner.nextInt();
			sum += num;
			
		}
		System.out.println("지금까지 입력된 정수의 합계 :"+ sum);
		

	}

}

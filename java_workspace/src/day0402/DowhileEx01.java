package day0402;

import java.util.Scanner;

import day0329.ifEx01;

/*
 * do ~ while 문은 while 문의 변형된 구조
 * 조건문과 블럭{}의 순서를 바꾸어 놓은 것인다.
 * 
 * 최소한 1번은 무조건 수행 한다.
 * 
 * 구조
 * 
 * do {
 * 	참일때 수행하는  수행문;
 * 	}
 * 	while(조건);
 * 
 * 
 * */
public class DowhileEx01 {

	public static void main(String[] args) {
	//1 과 100 사아의 정임의의 정수를 저장하고 이 값을 맞추는 프로그램
		int input= 0, answer=0;
		
		Scanner scanner = new Scanner(System.in);
		answer = (int) (Math.random()* 100 +1);
		//  1 ~ 100 사이의 임의의 정수를 저장
		
		
		do {
			System.out.println("1과 100 사이의 정수 입력 :");
			input = scanner.nextInt();

			if(input >answer) {
				System.out.println("더 작은 수를 입력하세요");
			}else if (input< answer) {
				System.out.println("더 큰수 를 입입력하세요");
			}
		} while (input != answer);
		System.out.println("정답입니다.");
		
	}

}

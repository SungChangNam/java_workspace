package day0401;

import java.util.Iterator;
import java.util.Scanner;

import day0329.ifEx01;

/*
 * 
 * 	팩토리얼을 계산하는 프로그램을 구현하시오.
 * 
 * 	7!= 1*2*3*4*5*6*7 = 5040
 * 
 * 	출력
 * 	정수 입력  : 7
 * 	7	의 팩토리얼은  5040 입니다.
 * 
 * */
public class forExam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 :");
		int num = sc.nextInt();
		
		int f =1;
		for(int i = num; i>0; i -- ) {
			f = f*i;
			
		}
		System.out.printf("%d 의 팩토리얼은  %d " , num ,f);
		
		

	}

}

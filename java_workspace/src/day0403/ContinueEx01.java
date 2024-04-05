package day0403;

import java.util.Scanner;
import java.util.function.BiConsumer;

/*
 * 문] 
 * 임의 정수 5개를 입력받고 입력받은 정수 중 앙의 정수들만 합계를 구하는
 * 프로그램을 작성하시오
 * 단,입력이 0이거나  음수 이면 제외 시킨다.
 * 
 *	 정수 입력: 5
 *	 정수 입력: -2
 *	 정수 입력: 6
 *	 정수 입력: 10
 *	 정수 입력: -4
 *  영수들의 합계 :21
 * */
public class ContinueEx01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =0 ,sum=0;
//		System.out.print("정수 입력 :");
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print("정수 입력 :");
			n= scanner.nextInt();
			if (n <=0 ) 
				continue;
			else 
				sum +=i;
			
		}
		System.out.print("양수의 합계 :" +sum);
	}

}

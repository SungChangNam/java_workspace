package day0401;

import java.util.Scanner;

/*
 *  0에서 부터 입력한 정수까지 합계를 구하는 프로그램을 구현하시오.
 *  
 *  정수 입력 : 20 
 *  0 부터 2까지 합계 : 210
 * 
 * 
 * 
 */
public class forExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum,num,i ;
		System.out.print("정수 입력 :");
		 num = sc.nextInt();
		sum= 0;
		
		for ( i = 0; i <= num; i++) {
			sum +=i;
		}
		System.out.println(" 0 부터 " +num+ "까지의 합계:" + sum);
		System.out.printf("0 부터  %d 까지의 합은 : %d %n", num,sum);
	}

}

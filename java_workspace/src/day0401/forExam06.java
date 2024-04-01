package day0401;

import java.util.Scanner;

/*
 *  문]
 *  사용자로 부터 임의 정수를 입력받아
 *  
 *  1부터 입력받은 수 까지의 전체 합계,짝수의, 홀수의 합을
 *  출력하되, 10단위로 출력하시오.
 *  
 *  50 
 *  전체의합:
 *  짝수의 합:
 *  홀수의 합:
 *  
 *  1~ 10 까지의  합:
 *  1~10  짝수의 합:
 *  1~ 10 홀수의 합:
 *  
 *  20~ 30 까지의  합:
 *  20~ 30  짝수의 합:
 *  20~ 30 홀수의 합:
 *  
 *  
 *  30~ 40 까지의  합:
 *  30~ 40  짝수의 합:
 *  30~ 40 홀수의 합:
 *  
 *  40~ 50 까지의  합:
 *  40~ 50  짝수의 합:
 *  40~ 50 홀수의 합:
 *  
 *   1~ 10 까지의  합:
 *  1~10  짝수의 합:
 *  1~ 10 홀수의 합:
 *  
 *  1~ 59 까지의  합:
 *  1~ 59  짝수의 합:
 *  1~ 59홀수의 합:
 *  
 *  
 *  
 * 
 * 
 * 
 * */
public class forExam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int sum =0;
		 int odd = 0;
		 int even =0;
		
		int n  = sc.nextInt();
		
		for (int i = 1 ; i<=n;  i++) {
			
			
			if (i  % 2 ==0) {
				even =+ i;
			}else {
			  odd +=i;
			}
			sum += i;
			if (n  == n) {
				System.out.println("1~ " +i + "까지의 전체의 합 :" +sum );
				System.out.println("1~ " +i + "까지의 짝수 :" +even );
				System.out.println("1~ " +i + "까지의 홀수 :" +odd );
				
			}else if (i % 10 == 0) {
				System.out.println("1~ " +i + "까지의 전체의 합 :" +sum );
				System.out.println("1~ " +i + "까지의 전체의 합 :" +even );
				System.out.println("1~ " +i + "까지의 전체의 합 :" +odd );
				System.out.println();
				
			}
				
		}
	


	}

}

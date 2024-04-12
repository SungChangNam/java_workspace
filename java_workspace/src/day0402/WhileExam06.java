package day0402;
/*
 * 문]
 *  -1 ^ 2+ 2^2 -3^2  ~~~~~~~+ 100^ 2 까지 합을 구하는
 *  프로그램을 작성하시오
 *  
 *  홀수는  : -
 *  짝수는 : +
 * 
 * 
 * */

import java.util.Scanner;

public class WhileExam06 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("숫자 입력:");
        int sum = 0;
        int i =1;
        int plus =1;
		int num = scanner.nextInt();
		
		        while (i <= num) {
		        	
		        	plus = - plus;
		        	System.out.println(" plus " + plus + "입니다.");
		        	
		        	sum +=plus*(i*i);
		        	System.out.println("  : " + sum + "입니다.");
//		            if (i % 2 == 0) {
//		                sum += i * i;
//		            } else {
//		                sum -= i * i;
//		            }
		            i++;
		        }

		        System.out.println(" 총합은 : " + sum + "입니다.");
		    }
		
}

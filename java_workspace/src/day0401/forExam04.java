package day0401;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 문]
 * 	두 개의 정수를 입력받아서 그 사이에 존재하는 정수들의
 * 	합계를 구하는 프로그램 구현하시오.
 * 
 * 	ex) 5    2   => 
 * 	2+3+4+5 =  14
 * 
 * 
 * 
 * 
 * */


public class forExam04 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
       int num1,num2,i ,sum =0;

        // 두 정수 입력
        System.out.print("첫 번째 정수를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        num2 = sc.nextInt();
        if(num1 > num2) {
        	int teap = num1;
        	num1 =num2;
        	num2 =teap;
        }
        
        for (i = num1; i < num2; i++) {

        	sum +=i;
        	   System.out.printf("%d와 %d 사이의 모든 정수들의 합은 %d입니다.\n", num1, num2, sum);
	}
//     
	}
}

package day0405;

import java.util.Scanner;

import day0329.ifEx01;

/*
 * 임의의 숫자가 들어있는 배열의 숫자 데이터를 중
 * 짝수인 데이터를 골라 출력하고,
 * 3의 배수인 데이터도 같이 출력하는 프로그램을 작성하시오.
 * 배열에 저장될  임의의 숫자는 ==> 4  7 9 1 3 2 5 6 8
 * 
 * 전체 출력
 * 4  7 9 1 3 2 5 6 8
 * 짝 수
 * 4 2 68
 * 3의 배수
 * 
 * 3 6 9
 * 
 * 
 * */
public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {4,7,9,1,3,2,5,6,8};
		int []ev = new int[3];
		int[] od = new int [4];
		
		System.out.println();
		 System.out.println("출력");
		 for (int i = 0; i < num.length; i++) {
			 System.out.printf("%d\t",num[i]);
		 }	
		
		 System.out.println();
		 System.out.println("2의 배수출력");
		 for (int i = 0; i < num.length; i++) {
			 if(num[i]%2 ==0)
			 System.out.printf("%d\t",num[i]);
		}
		 
		 System.out.println();
		 System.out.println("3의 배수 출력");
		 for (int i = 0; i < num.length; i++) {
			 if(num[i]%3 ==0)
			 System.out.printf("%d\t",num[i]);
		}
		
	}

}

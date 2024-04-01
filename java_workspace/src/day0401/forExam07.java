package day0401;

import java.util.Scanner;

import day0329.ifEx01;

/*
 *  문]
 *  
 *  사용자로 부터 원하는 단을 입력받아 
 *  해당하는 단을 출력하는 프로그램을 작성하세요.
 *  단, 구구단은 1 ~ 9 단 가지의 수를 입력받는다.
 *  범위를 벗어나면 프로그램을 종료한다.
 * 
 * 
 * 
 * */
public class forExam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 을 입력해주세요 : " );
		int dan =sc.nextInt();
		int sum;
		
		for(int i =1;  i <=9; i++) {

			sum = dan *i ;
			if(dan >=10) {
			 System.out.println("1~ 9 까지의 정수만 입력 가능합니다. ");
			break;
			}
			System.out.println(dan +" * " + i + "="+sum);
	
		}
	
	
		
	}

}

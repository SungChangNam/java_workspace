package day0401;

import java.util.Scanner;
import java.util.function.BiConsumer;

/*
 *  문]
 *  	양의 실수만 입려받아 입력받은 합의 평균을 구하는 프로그램을  구현하시오.
 *  	단 , 음의 실수가 입력되면 ,종류 하시오.
 *  	거기까지의 합계를 구함
 *  
 * 
 * 
 */
public class forExam03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		
		float sum=0.0f , input = 0.0f ;
		int cnt = 0;
		for(   ;   input >= 0.0 ;  ){
			
			sum += input;
			System.out.print("실수를 입력하세요(양수 입력시 프로그램 종료) : ");
			input = sc.nextFloat();
			cnt ++;
			
			}
		
		System.out.printf("지금까지의 평균:  % .2f",sum/(cnt-1));
		}
		
		

}

package day0401;

import java.util.Scanner;
import java.util.function.BiConsumer;

/*
 *  문]
 *  	 *  문]
 *  	무한대로 두수의 정수를 입력받아 합을 구하는 프로그램을 작성하시오.
 *  	단 프로그램을 종료 :0을 입력하면종료
 *  	
 *  	
 *  
 * 
 * 
 */
public class forExam02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n1 ,n2;
		for(; ;) {
			System.out.print("첫번째 정수를 입력하세요 :");
			n1 =sc.nextInt();
			if (n1==0) {
				System.out.println("프로그램 종료");
				break;
				
			}
			
			System.out.print("두번쨰 정수를 입력하세요 : ");
			n2 =sc.nextInt();
			
			System.out.printf("%d + %d = %d%n", n1 ,n2,(n1+n2));
		}
	
	}
		
		

}

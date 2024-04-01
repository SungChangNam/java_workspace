package day0328;

import java.util.Scanner;

/*

	
	
 */
public class CondiEx05 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 를 입력하세요 :");
		String result= "";
		int a  =sc.nextInt();
		

		result = (a %2 == 0) ?"짝수":" 홀수";
		
		System.out.print("입력받은 수는"+result +"입니다.");

		
		

		
		
	
	
		
		
		
	}	
		
}

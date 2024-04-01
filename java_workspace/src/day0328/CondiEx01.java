package day0328;

import java.util.Scanner;

/*
 	임의의 정수를 입력받아 입력받은 수가 양수 인지, 음수인지 
 	판정하는  프로그램을 구현하시오.
 	단 , 삼항연산자 활용
 	
 */
public class CondiEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 :");
		int num =sc.nextInt();
		
		String result= (num  > 0 )? "양수": (num <0)?  "음수" :"0";
		System.out.println("입력받는 숫자는 :" +num +"는"+result+"입니다.");
		
		String str1= "";
		
		if (num <= -1) {
			str1= "음수 ";
			
		}else if (num <=0) {
			str1 = "0";
		}
		else{
			str1 = "양수 ";
		}
		
		System.out.println("입력받은수 "+ num +" 는  " + str1 +"입니다,");
		
	}

}

package day0328;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.print.attribute.standard.Chromaticity;

/*
	문]
	임의의 년도를 입역받아 입력받은 년도가 윤년인지,평년인지 판정하는
	프로그램을 구현하시오.
	
	윤년의 조건
	1.4 나누어 떨어지면 윤년
	2. 100으로 나누어 떨어지면 윤년이 아니다.
	2. 400으로 나누어 떨어지면 윤년이다.
	3. 이외의 년도는 평년
	
 */
public class CondiEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫를 입력하세요 :");
		int year = sc.nextInt();
		String result  ;
		if (year % 4 ==0  || year %400 ==0 && year % 100 !=0) {
			System.out.println("윤년입니다");
		}else  {
			System.out.println("평년입니다");
		}
	
		 result =  (year %  4== 0  && year %100 !=0)  || year % 400==0 ?  "윤년" :"평년" ;
		 System.out.println(result);
	}
	
		
}

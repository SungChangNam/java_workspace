package day0329;

import java.util.Scanner;

/*
 *  문]
 *  임의의 정수 3개를 입력 받고 3개의 숫자 중 중간크기의 숫자를 출력하는 프로그램을
 *  작성하시오.
 *  출력
 *  정수 세개 입력: 20 100 33
 *  중각 크기 :33
 * */
public class ifEx01 {

	public static void main(String[] args) {
		int a,b,c ,mid;
		Scanner sc =new Scanner(System.in);
		int[]  num  = new int[3];
		System.out.print("정수세개 입력 :");
		
		a =sc.nextInt();
		b =sc.nextInt();
		c =sc.nextInt();
		
		if((a>=b && a <=c) || (a>= c && a<=b))
			mid=a;
		else if ((b>=a && b<+c )|| (b>=a  &&  b<=a)) {
			mid=b;
		}else {
			mid=c;
		}
		System.out.println("중간크기" + mid);
//		
//		
//		if( int i= 0;  i< num.length; i++;) {
//			
//		}
//		
//		
//
//		
//		
	}

}

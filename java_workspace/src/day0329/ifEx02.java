package day0329;

import java.util.Scanner;

/*
 *  문]
 *  	삼각형의 변의 길이를 나타내는 세계의 정수를 입력받고,
 *  	이 세개의 정수로 삼각형을 만들수 있는지를 판별하는
 *  	프로그램을 작성하시오.
 * 	
 * 
 * 	삼각형 조건
 * 	두변의 합이 다른 한 변의 합보다 커야함
 * 
 * 	정수 세개 입력 : 4 ,3, 5
 *		삼각형이 됩니다. 
 * 
 * 
 * */

public class ifEx02 {

	public static void main(String[] args) {
		int a,b,c ;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("정수세개 입력 :");
		
		a =sc.nextInt();
		b =sc.nextInt();
		c =sc.nextInt();
		//두변의 합이 다른 한 변의 합보다 커야함
		if((a+b) <c  || (a+c) < b || (b+c) <a) {
			System.out.println("삼각형이 될수 없습니다.");
		}else {
			System.out.println("삼각형이 됨니다.");
		}
//		if(a <=b && b >= c  && b<=a && c <= a ) {
//			System.out.println("삼각형이 될수 없습니다.");
//		}else {
//			System.out.println("삼각형이 됨니다.");
//		}

	}

}

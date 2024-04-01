package day0328;

/*
 * 문]
 * 두자의 정수 (10 ~ 99)를 입력받고,십의 자리와 일의 자리가
 * 같은 지를 판별하는 프로그램을 구현하시오.
 *	2자리의 정수 입력 :77
 *Yes! 10자리와 1의 자리가 같다.
 *
 *
 * 
 * */

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num =sc.nextInt();
		
	 if (num >10 || num <100 ) {
			if (num /1 ==11) {
				System.out.println("Yes! 10자리와 1의 자리가 같다.");
			}else {
				System.out.println("아님");
			}
	}else {
		System.out.print("범위 초과함 ");
	}
	 
	}

}

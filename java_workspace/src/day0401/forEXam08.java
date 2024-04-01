package day0401;

import java.util.Scanner;

/*
 *  사용자로 부터 하나의 숫자를 입력받아 그 수만큼 3의 배수를 출력하는 프로그램을
 *  작성하시오.
 *  
 *  5가 입력되면   3 6 9 12 15를 출력하면 됨
 * 
 * 
 * */

public class forEXam08 {

	public static void main(String[] args) {
		
		int sum  = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		
		for(int i =1;  i <= n;  i++) {
			System.out.println(i *3+"\t");
			
		}
	}

}

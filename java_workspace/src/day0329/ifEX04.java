package day0329;

import java.util.Scanner;

/*
 * 문 ]
 * 369 게임을 작성한다.
 * 1~99 까지의 정수를 입력받고 정수중에 3,6,9 중 하나가 있는 경우는
 * "박수짝 " 을 출력 하고, 두대가 있는ㄴ 경우는 "박수짝짝"을 출력 하는 프로그램을
 * 구현하시오
 * 
 * 입력된 수가 13인경우 "박수짝"
 * 입력된 수가 36인경우 "박수짝짝"출력
 * 
 * 출력 1~ 99 사이의 정수 입력 :36
 * 박수 짝짝
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class ifEX04 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.print("출력 1 ~99 사이의 정수 입력 :");
	        int num;
	        num = sc.nextInt();

	        if (num >= 1 && num <= 99) {
	            int a, b;
	            // 10자리
	            a = num / 10;
	            // 1의 자리
	            b = num % 10;

	            int cnt = 0;

	            if (a != 0 && a % 3 == 0) {
	                cnt++;
	            }

	            if (b != 0 && b % 3 == 0) {
	                cnt++;
	            }

	            if (cnt == 0) {
	                System.out.println("박수 없음");
	            } else if (cnt == 1) {
	                System.out.println("박수 짝");
	            } else {
	                System.out.println("박수 짝짝");
	            }
	        } else {
	            System.out.println("범위가 벗어남");
	        }
	
	}

}

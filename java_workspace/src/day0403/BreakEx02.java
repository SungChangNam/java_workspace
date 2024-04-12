package day0403;

import java.util.Scanner;

/*
 * 문]
 *  "exit" 입력되면 while 문을 종룡하는 프로그램을 구현하시오.
 *  
 *   문자열 입력 : ee
 *   문자열 입력 : e
 *   문자열 입력 : ed
 *   문자열 입력 : exit
 *   종료합니다.
 *   
 *  
 * 
 * 
 * */

public class BreakEx02 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);

		while (true) {
			System.out.print("문자열 입력 :");
			String st = scanner.nextLine();
			if (st. equals("exit") ) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}

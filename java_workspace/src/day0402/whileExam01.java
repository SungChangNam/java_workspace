package day0402;

import java.util.Scanner;

/*
 * 문]
 * 
 *  사용자로부터 정수 하나를 입력받아서, 그 수만큼 "I Love U!!"를
 *  출력하는  프로그램을 구현하시오.
 *  
 *  
 * 
 * 
 * 
 * */
public class whileExam01 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int num ,i  =1;
		System.out.print("정수를 입력하세요 : ");
		int n = scanner.nextInt();
		
		while (i <=n) {
			System.out.println("I Love U!!!");
			i ++;
		}
		
	}

}

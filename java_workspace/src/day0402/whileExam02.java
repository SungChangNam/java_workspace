package day0402;
/*
 * 문 ]
 * 사용자로 부터 임의의 정수를 입력받아 그 수만큼 3배수를 출력한느 프로그램을 구현하시오.
 * 단, while 문 사용
 * 
 * 
 * 
 * */

import java.util.Scanner;

public class whileExam02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i =1,num =1;
		System.out.print("정수를 입력하세요 : ");
		num = scanner.nextInt();
		
		while (i <= num) {
			System.out.print((i*3 )+ "\t");
			i++;
		}
	}

}

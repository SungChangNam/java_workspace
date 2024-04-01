package day0401;

import java.util.Scanner;

/*
 * 
 * 3의 승수를 입력하여 값을 구하여 출력한느 프로그램을 구현하시오.
 * 승수 입력 :5
 * 3 의 5승은  243 입니다.
 * 오늘 수없은 끝입니다.
 * 
 * 
 * */

public class forExam10 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int multi =1;
		System.out.print("승수 입력 :");
		int num = scanner.nextInt();
	
		for(int i =1;  i <= num;  i++) {
			multi *= 5;
			
		}
		System.out.println("3의 "+num+ "승은"+ multi + " 입니다");
		

	}
		
}

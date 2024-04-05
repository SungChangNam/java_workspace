package day0402;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * 점심 메뉴를 선택하는 프로그램을 작성하시오.
 * 1. 라멘,	2.백반 ,3.제육덮밥,4.국밥,돈까지 , 0 :종료
 * 
 *
 *  
 * */
public class WhileExam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		String[] menu = {"종료","라멘","우동","국밥"};
	Scanner scanner =new Scanner(System.in);
// 		System.out.println("menu 입력");
 		int num = scanner.nextInt();
 		
 		while(num==0) {
 	 		System.out.println("menu 입력");
 	 		num = scanner.nextInt();
			if (num ==0 ) {
				System.out.println(menu[num]+"합니다." );
				return;
			}else if (num !=0) {
				System.out.println(menu[num]+"입니다." );
				
			}
			
		
 		}

	}

}

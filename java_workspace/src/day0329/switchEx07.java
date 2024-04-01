package day0329;

import java.util.Random;
import java.util.Scanner;

/*
 *  두 사람이 가위 ,바위 , 보 중 하나의 문자열을 받고 입력받은 문자열을 비교하여
 *  누가 이겼는지를 판별하는 프로그램을 구현하시오.
 *  
 *  문자열
 *  if(s== "가위")
 *  if(s equals()"가위")
 *  문자열 비교 : equals
 * 
 * 
 */

public class switchEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
//		System.out.println("가위,바위 ,보  중 아무거나 입력해주세요.");
//		
//	
//		System.out.print("철수: ");
//		String a= sc.nextLine();
//		
//		
//		System.out.print("영희 : ");
//		String b= sc.nextLine();
//		
		
	
//		if (a.equals("가위")) {
//			if (b.equals("바위")) {
//				System.out.println("영희가 이겼습니다.");
//			}else if (b.equals("가위")) {
//				System.out.println("철수가이겼습니다.");	
//			}
//
//		}
		System.out.print("가위(1),바위(2),보(3) 입력 :");
		int user = sc.nextInt();
		int com =(int)(Math.random()*3)+1; //1,2,3
		System.out.println("사용자는" + user + "이고, 컴퓨터는 " + com + "입니다");
		/*
		 * Math.random() 를 사용한느 겨우
		 * 값의 범위 : 0.0 ~ 1.0 사이에 속하는 실수
		 * 그런데, 0.0 은 포함되나, 1.0은 포함되지 않는다.
		 *  0.0 <= Math.random() *3 <1.0
		 *  1 ~ 3 : -->1.각변에 3을 곱함
		 *  				  2.각 변을 형변환 
		 *  				  3.각 변에 1을 더함
		 */
//		System.out.println("사용자는" + user + "이고, 컴퓨터는 " + com + "입니다");
//		if (user ==1) {
//			if (com ==1) {
//				System.out.println("서로 비겼습니다.");
//			}else if (com ==2) {
//				System.out.println("컴퓨터가 이겼습니다.");
//			}else {
//				System.out.println("컴퓨터가 졌습니다.");
//			}
//		}	else if (user==2) {
//			
//			if (com ==1) {
//				System.out.println("사용자가 이겼습니다.");
//			}else if (com==2) {
//				System.out.println("서로 비겼습니다.");
//			}else {
//				System.out.println("켬퓨터가 이겼습니다.");
//			}
//
//		}else if (user ==3) {
//			if (com == 1) {
//				System.out.println("컴퓨터가 이겼습니다.");
//			}else if (com ==2) {
//				System.out.println("사용자가 이겼습니다.");
//			}else {
//				System.out.println("서로 비겼습니다.");
//			}
//		}
		
		switch (user-com) {
		case -1: case 2:
			System.out.println("컴퓨터가 이겼습니다.");
			break;
		case 1: case -2:
			System.out.println(" 사용자가이겼습니다.");
			break;
		case 0:
			System.out.println(" 무승부 입니다..");
			break;
		default:
			System.out.println("에러입니다.");
			break;
		}
		
	}
}

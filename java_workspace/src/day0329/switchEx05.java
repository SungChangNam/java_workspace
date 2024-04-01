package day0329;

import java.util.Scanner;

/*
 * 임의이 월을 입력받아 무슨 계절인지 알아보는 프로그램 작성
 * 1.if 문 활요
 * 2.switch ~case 문활용
 * 
 * 
 */
 

public class switchEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 월 입력: ");
		int month = sc.nextInt();
		
//		if (month == 3 || month ==4  || month == 5   ) {
//			System.out.print("지금은 봄입니다 . ");
//		}else if (month == 6 || month ==7  || month ==8 || month ==9 ) {
//			System.out.print("지금은 여름입니다 . ");
//		}else if (month == 6 || month ==7  || month ==8 || month ==9 ) {
//			System.out.print("지금은 가을름입니다 . ");
//		}else if (month == 1 || month ==2  || month ==11 || month ==12) {
//			System.out.print("지금은 겨울입니다 . ");
//		}else {
//			System.out.println(" 형식에 맞게 입력해주세요");
//		}
		
		switch (month) {
		case 1:case 2:case 12:
			System.out.print("지금은 겨울입니다 . ");
		case 3:case 4:case 5:
			System.out.print("지금은 봄입니다 . ");
			break;
		case 6:case 7:case 8:case 9:
			System.out.print("지금은 여름입니다 . ");
			break;
		case 10:case 11:
			System.out.print("지금은 가을입니다 . ");
		default:
			System.out.println("정확한 월을 입력하세요");
			break;
		}
		
	}

}

package day0403;

import java.util.Scanner;

/*
 * 문]
 * 
 * 메뉴는 선택하는데 잘못 선택한 경우 continue 문으로 다시 메뉴를 보여주고,
 * 종료를 선택하면 break 문을 실행하여 프로그램을 종료하는 프로그램을 구현하시오.
 * 
 * 
 * */
public class BrConEx {

	public static void main(String[] args) {
		int menu =0;
		int num =0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1: 볶음밥");
			System.out.println("2: 라멘");
			System.out.println("3: 국밥");
			System.out.print("위의 메뉴중 원하는 메뉴선택.  종료(0): ");
			String tmp =scanner.nextLine();//화면에 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);// 입력받은 문자열을 숫자로 변환
			
			if (menu ==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else if (!(1<= menu && menu <=3 )) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
			System.out.println("오늘의 점심메뉴는 " + menu+"번  입니다");
		}

	}

}

package day0329;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



/* 커피 메뉴의 가격을 알려주는 프로그램을 구현하시오.
 * 에스프레소 ,카푸치노,카페라떼는 3500,
 * 아메리카노는 4500
 * 1 get ordered coffee.
 * 2.The price is not 0 won;
 * have to use switch ~case,   when the price of coffee is bigger than 0won output 
 */

public class switchEX03 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
	 System.out.print("What do u want to order?");
	 String order = sc.nextLine();
	 int price = 0;
	 
	 switch (order) {
	case "es":
	case "cafu":
	case "latte":
		price =3500;
	case"ame":
		price =4500;
		
		break;

	default:
		System.out.println("없음");
		break;
	}
	 		if (price !=0) {
	 			System.out.println(order + " is "+ price +"  won" );
			}
	 		

	}

}

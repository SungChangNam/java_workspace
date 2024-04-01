package day0329;

import java.util.Scanner;

import javax.swing.text.DefaultTextUI;

public class switchEx08 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("주민번호 입력  :");
		String personID= sc.nextLine();
		
		char gender = personID.charAt(7);
		
//		String [] num = personID.split("-");
//		int idValue =(int)num;
//		System.out.println(num[1]);
//		System.out.println("주민번호"  + personID);
		
		switch (gender) {
		case '1': case '3':
//			System.out.println("당신은 남성입니다.");
			switch (gender) {
			case '1'  : 
				System.out.println("당신은 2000년 이전에 출생한 남성입니다.");
				break;
				case'3'  :
					System.out.println("당신은 2000년 이후에 출생한 남성입니다.");	
					break;
				default:
					System.out.println("외계인 입니다.");
					break;
			}
	
			
		case '2': case '4':
//			System.out.println("당신은 여성 입니다.");
			switch (gender) {
			case '2'  : 
				System.out.println("당신은 2000년 이전에 출생한 여성입니다.");
				break;
			case'4'  :
				System.out.println("당신은 2000년 이후에 출생한 여성입니다.");
				break;
			default:
				System.out.println("외계인 입니다.");
				break;
			} 
			
		default:
			break;
		}
		
	}

}

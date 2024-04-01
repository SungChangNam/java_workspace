package day0328;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.print.attribute.standard.Chromaticity;

/*
 	입의의 문자를 입력받아 입력받은 문자가 대문자라면  소문자로
 	소문자가 입력되었다면 대문자로 변환하는 프로그램을 구현하시오.
 	단, 문자는 알파벳이며, 알파베 이외의 문자 입력되면
 	알파벳이 아닙니다 를 출력
 */
public class CondiEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 :");
		char result = ' ';
		char ch =sc.next().charAt(0);
		char up= Character.toUpperCase(ch); //"A"
		char low= Character.toLowerCase(ch); //"a"
//		System.out.println((ch ==low)? up:low ); 
		
//		if (ch == up) {
//			System.out.println(low);
//		}else if (ch == low) {
//			System.out.println(up);
//		}else if (ch != ch) {
//			System.out.println("알파벳 을 입력해주세요");
//		}
	
	
		
		System.out.println((ch >= 97 && ch< 122)? up  : (ch >= 65 && ch <= 90) ? low   : "알파벳을 입력해주세요.");//3항연산자
		
		if(ch >= 97 && ch< 122) {//소문자
			System.out.println(ch+"=>"+up);
		}
			else if (ch >= 65 && ch <= 90) {
				System.out.println(ch+"=>"+low);
			}else {
				System.out.println("알파벳을 입력해주세요");
			}
		
		
		if(ch >= 97 && ch< 122) {//소문자
			result = (char)(ch -32);
			System.out.println(ch+"=>"+result);
		}
			else if (ch >= 65 && ch <= 90) {
				result = (char)(ch +32);
				System.out.println(ch+"=>"+result);
			}else {
				System.out.println("알파벳을 입력해주세요");
			}
		
	
	
	}
	
		
}

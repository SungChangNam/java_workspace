package day0328;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.print.attribute.standard.Chromaticity;

/*
	문] 다음 문제를 if문으로 구현하시오.
	사용자로부터 임의의 알파벳 한 문자를 입력받아,
	이르 판별하여 입역받은 알파벳이 모음일 경우만
	결과를 출력할 수 있는 프로그램을 작성한다.
	단, 대소문자 모두 적응할수 있도록 구현한다.
	또한, 알파벳 이외의 문자가 입력되었을 경우
	입력오류 처리할수 있도록 한다.
	
	(a,i,u,e,o)
	
	
 */
public class CondiEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 :");
		char result = ' ';
		char ch =sc.next().charAt(0);
		
		
		if ((ch >='a'  && ch <= 'z') || (ch >='A'  && ch <= 'Z')) {
			
			if (ch =='a' || ch =='e' ||ch =='o' ||ch =='i' ||ch =='u' ) {
				System.out.println("모음");
			}else if (ch =='A' || ch =='E' ||ch =='O' ||ch =='I' ||ch =='U'    ) {
				System.out.println("모음");
			}else {
				System.out.println("입력오류");
			}
		}else {
			System.out.println("알파벳이 아님");
		}

	
		
		
		
	}	
		
}

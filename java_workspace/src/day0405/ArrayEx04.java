package day0405;

import java.util.Scanner;

/*문]
 * 학생수를 입력받고, 인원수만큼 이름과 전화번호를 입력받아 저장하고 
 * 전체 내용을 출력하는 프로그램을 구현하시오. 
 * 3 을 입력받아
 * 이름 전화번호
 * 이름 전화번호
 * 이름 전화번호
 * 
 * 입력
 * ----------------------------------
 * 학생 수 : 3
 * 이름 전화번호 입력(1)[공백]: 가길동 010-11111-1111
 * 이름 전화번호 입력(2)[공백]: 가길동 010-2222-2222
 * 이름 전화번호 입력(3)[공백]: 가길동 010-3333-3333
 * 
 * ------------------------------------------------
 * 전첵 학생수 : 3
 * -----------------------------------------------
 * 이름  전화번호 
 * 
 * ---------------------------------------------
 * */
public class ArrayEx04 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수 입력 :");
		n  =  scanner.nextInt(); //학생수
		String[] name= new String[n];
		String[] ph= new String[n];
		// 이름과  전번 저장
		for (int i = 0; i < n; i++) {
			System.out.print(" 이름  전화번호 입력:("+(i+1)+")[공간] : ");
			name[i] = scanner.next();
			ph[i] = scanner.next();
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("전체 학생수 : " +n +"명");
		System.out.println("------------------------------------");
		System.out.println("이름           전화번호              ");
		
		// 배열에 저장된 데이터 출력
		for (int i = 0; i < n; i++) {
		System.out.println(name[i]+ "                "+ph[i]);
			
		}
		System.out.println("------------------------------------");
	}

}

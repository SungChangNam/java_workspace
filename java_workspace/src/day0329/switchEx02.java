package day0329;
/*
 * switch ~ case
 * 
 * 다중 선택문이라고 하며
 * switch문 다음 수식 값에 따라 실행 순서를
 * 여러 분기로 사용하는 문장
 * 
 * 
 *형식 및 구조 
 *switch(수식){
 *	case 상수 : 실행문장1; break;
 *	case 상수 : 실행문장2; break;
 *	case 상수 : 실행문장3; break;
 *	case 상수 : 실행문장4; break;
 *	default :  실행문장: break;
 *}
 *
 *		수식과 case 의 상수는
 *		byte, short , int, long, 이어야함
 *		case 문 뒤에는 breakl 문이 있어야한다.
 *		만약 없으면 계속해서 다음 문장을 수행한다.
 *		
 * 
 * 
 */
// 세과목을 점수를 입력받아 총점과 평균을 구한뒤  평균을
// 이용하여 학점을 처리하는 프로그램 구현

import java.awt.GradientPaint;
import java.io.*;


public class switchEx02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	
		int  kor ,eng,mat, sum =0;
		char grade =' ';
		System.out.print("국어 :");
		kor =Integer.parseInt(br.readLine());
		System.out.print("영어 :");
		eng =Integer.parseInt(br.readLine());
		System.out.print("수학 :");
		mat =Integer.parseInt(br.readLine());
		
		sum = kor+ eng +mat;
		
		float avg = sum/3f;
		
		switch ((int)avg/10) {
		case  10:
			grade = 'A';
			break;
		case  9:
			grade = 'A';
			break;
		case  8:
			grade = 'B';
			break;
		case  7:
			grade = 'C';
			break;
		case  6:
			grade = 'D';
			break;
		default:
				grade = 'F';
			break;
		}
		System.out.printf("당신의 총점은 %d, 평균은 %.2f 이며 ,학점은 %c 입니다. %n", sum,avg , grade);
		
//		
//		if (avg > 90) {
//			grade = 'A';
//		}else if (avg > 80) {
//			grade = 'B';
//		}else if (avg > 70) {
//			grade = 'C';
//		}else if (avg > 60) {
//			grade = 'D';
//		}else if (avg > 50) {
//			grade = 'E';
//		}else {
//			grade='F';
//		}
//		System.out.printf("당신의 총점은 %d, 평균은 %.2f 이며 ,학점은 %c 입니다. %n", sum,avg , grade);
	}
	

}

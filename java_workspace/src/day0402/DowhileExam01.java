package day0402;

import java.util.Scanner;

/*
 *  문]
 *	국,영,수 점수를 입력받아 총점과 평균과 학점을 구현하는 프로그램을
 * 구현하시오
 * 
 *   단 정수의 범위는 0 ~ 100 넘지 않는다.
 *   do~ while 문 활용
 *
 *  90이상 a 80이상 b ~ 60점 이하는 f로 처리
 * 
 * 
 * */

public class DowhileExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		char hak =0;
		float avg =0.0f;
		int num =0,sum = 0 ,kor=0,eng=0,mat=0;
//		System.out.print("국어점수 :");
//		kor =scanner.nextInt();
//		
//		System.out.print("영어점수 :");
//		eng =scanner.nextInt();
//		
//		System.out.print("수학점수 :");
//		mat =scanner.nextInt();
		
		do {
			System.out.print("국어점수 :");
			kor =scanner.nextInt();
			
		} while (kor < 0 || kor > 100);
		
		do {
			
			System.out.print("영어점수 :");
			eng =scanner.nextInt();
		} while ((eng < 0 || eng > 100));
		
		
		do {
			System.out.print("수학점수 :");
			mat =scanner.nextInt();
		} while ( mat < 0 || mat > 100);
		
		
		sum = eng + kor + mat;
		avg = sum/3.0f;
		
	System.out.println("총점은" +sum);
	System.out.println("평균은" +avg);
//		do {
//			sum = eng + kor + mat;
//			if (eng < 0 || eng > 100 || mat < 0 || mat > 100 ||kor < 0 || kor > 100 ) {
//				System.out.println("점수 범위가 초가 하였습니다.");
//				break;
//			} else if (sum /3 >= 90) {
//				System.out.println("학점은 A 입니다."  );
//				
//			}else if (sum /3 >= 80) {
//				System.out.println("학점은 B 입니다."  );
//				
//			}else if (sum /3>= 70) {
//				System.out.println("학점은 c 입니다."  );
//				
//			}else if (sum /3 <= 60) {
//				System.out.println("학점은 F 입니다."  );
//				
//			}
//				
//			
//			System.out.println("총점은" +sum);
//			System.out.println("총점은" +sum/3);
//		} while (eng < 0 || eng > 100);
			
	}

}

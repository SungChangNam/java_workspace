package day0329;

import java.util.Scanner;

/*
 *  문 ] 
 *  
 *  점수와 학년을 입력 받아 60 이상이면 합격, 미만이면 불합격을 출력함
 *  단 4학년인 경우 70점 이상이여야만 합격임
 *  
 *  출력
 *   점수입력 : 65
 *   학년 입력: 4
 *   불합격
 * 
 * 
 * 
 * 
 */
public class ifEx03 {

	public static void main(String[] args) {
		int scoure, year ;
		Scanner sc =new Scanner(System.in);
		System.out.print("점수 입력 :");
		scoure =sc.nextInt();
		System.out.print("학년 입력:");
		year=sc.nextInt();
	
	if(scoure >=60   ) {
			if(year !=4) {
				System.out.println("합격");
			}else if(scoure >=70) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
	
	}else {
		System.out.println("불합격");
	}
	

	}

}

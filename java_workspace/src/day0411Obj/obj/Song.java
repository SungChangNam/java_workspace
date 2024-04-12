package day0411Obj.obj;

import java.util.Scanner;

import javax.security.auth.Subject;

import day0401.forEx01;

/*
*     2.Sung  클래스 -> 인원수를 입력받아, 입력받은 인원수 만큼 
*     								이름 국어,영어, 수학 ,점수를 입력받고 
*     								총점,평균 석차를 구하는 클래스
*     
*     					속성 : 인원수 Record 클래스 배열
*     					기능:  인원수 입력, 상세 데이터 입력 ,계산기능
*     							   총점,평균,석차 계산기능,결과 출력
*/

public class Song {
	Scanner scanner= new Scanner(System.in);
	
	int people; // 인원수
	// Record 클래스 배열
	// 객체 배열 선언
	Record[] rec;
	// 기능 (메소드, 함수)
	// 1. 인원 수 입력받은 기능
	public void set() {
		do {
			System.out.print("인원수 입력(1~100): ");
			people =scanner.nextInt();
	
		} while (people <1  || people >100);
		
		// Record Class 배열을 인원수 만큼 생성
		// 객체 배열을 생성한 것이지 객체를 생성한 것은 아니다.
		rec = new Record[people];
	}
	
	//2.이름 , 점수를 입력받아 총점과 평균을 계산 하는기능.(상세 데이터 입력기능)
	public void intput() {
		
		String[] subject = {"국어 점수 : ","영어 점수 : ","수학 점수 : "};
		
		for (int i = 0; i < people; i++) {
			// 가장 중요 (*****) : 인스턴스 생성
			rec[i] = new Record();
			
			// 이름 입력 받음
			System.out.print(i+1+"번 쨰 이름 입력 :");
			rec[i].name = scanner.next();
			
			// 과목명 출력
			for (int j = 0; j < subject.length; j++) {
				System.out.print(subject[j]);
				//입력받은 점수를 score 배열에 저장한다.
				rec[i].score[j]= scanner.nextInt();
				// 점수를 반복적으로 입력받는 동안 점수를 누적시켜서 총 합계를 구함
				rec[i].tot +=rec[i].score[j];
			}// 과목별 점수를 입력받고 총점을 구함
			
			// 평균 계산
			rec[i].avg =rec[i].tot  /3.0;
			
		}//end for	
	}//end intput()
	
	
	//3. 석차 계산 기능
	 public void ranking() {
			int i,j;
			
			for (i = 0;   i< people; i++) {
				rec[i].rank =1;
				
			}
			
			for ( i = 0; i < people-1; i++) {
				for ( j = i+1 ; j < people; j++) {
					if(rec[i].avg > rec[j].avg) {
						rec[j].rank   ++;
					}else 	if(rec[i].avg < rec[j].avg) {
						rec[i].rank   ++;
					}
					
				}
			}
				
	 }
	
	//4. 결과 출력기능
	public void print() {
		ranking();
		System.out.println();
		
		
		// 학생 한명당 반복적으로 출력
		
		for (int i = 0; i <people; i++) {
			System.out.println("       이 름    국 어  영 어 수 학  총 점  평 균  석 차   ");
			// 이름
			System.out.printf("%8s ",rec[i].name);
			
			//과목별 점수 출력
			for (int j = 0; j < 3; j++) {
				System.out.printf("%5d  ",rec[i].score[j]);
			}
			
			// 총점
			System.out.printf("%7d ",rec[i].tot);
			//평균
			System.out.printf("%10.2f ",rec[i].avg);
			//석차
			System.out.printf("%5d ",rec[i].rank);
			
			System.out.println();
		}
	}
	
	
}


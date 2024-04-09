package day0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import day0401.forEx01;

public class ArrayExam02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		//인원수 입력
		
//		int human =Integer.parseInt(br.readLine());
		int human =Integer.parseInt(args[0]);
//		System.out.println(human);
		String[] name  =new String[human];
		String []sub= new String[args.length-1];
		// 과목명 초기화
		
		// 점수와 총점처리를 위한 배열을 선언
		
		int [][] score= new int[human][args.length+1];
		float[]  avg = new float[human];
		char[] grade = new char[human];
		int [] rank = new  int[human];
		
		
		//과목명 옮겨오기
		for (int i = 0; i < args.length-1; i++) {
//			System.out.print(args[i+1]+"\t");
			sub[i]= args[i+1];
//			System.out.print(sub[i]+"\t");
		}
		
		// 사람 수만큼 반복작업
		// 사람 수만큼 점수도 입력받는다.
		
		for (int i = 0; i < human; i++) {
			System.out.print(i+1+"번째 학생의 이름 : " );
			name[i]= br.readLine();
			System.out.println(name[i]+"학생 점수를 입력하세요 ");
			for (int j = 0; j < sub.length; j++) {
				System.out.print(sub[j]+"점수: ") ;
				score[i][j]= Integer.parseInt(br.readLine());
				score[i][sub.length] +=score[i][j];
				// 총점 구하기
				
			}

			
		}	// 사람수만큼 이름 입력받고, 과목별 점수 입력받고, 총점 구하고
		// 평균 구하기.
		for(int i =0; i<human ; i++) {
			avg[i]= score[i][sub.length-1]/(float)sub.length;
			// 소수점 세째 자리 에 반올림해서 소수점 둘째짜리
			 avg[i]= (int)((avg[i]+0.005)*100)/100.f;
		}
		
		for (int i = 0; i < human; i++) {
			
			
			switch ((int)(avg[i]/10)) {
			case 10: grade[i] ='A'; break;
			case 9: grade [i]='B'; break;
			case 8: grade [i]='C'; break;
			case 7: grade [i]='D'; break;
			default:grade[i]='F'; break;
			
				
			}
			
			//석차 계산
	
		}
		for (int i = 0; i < human; i++) {
			rank[i] ++;
			for (int j = 0; j < human; j++) {
				if (avg[i] < avg[j]) {
					rank[i] ++;
				}
			}
		}
		
		
		System.out.println();
		System.out.println("==============성적표 =============");
		System.out.print("이 름\t");	
		for(int i =0; i <sub.length;  i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println("총점\t 평균\t학점\t석차");
		for (int i = 0; i < human; i++) {
			System.out.print(name[i]+"\t ");
			for(int j =0; j <sub.length; j++) {
				System.out.print(score[i][j]+"\t");	
			}
			System.out.println(score[i][sub.length]+"\t"+avg[i]+"\t"+grade[i]+"\t"+rank[i]);
		}
		
		System.out.println("==============================");
		
	}

}

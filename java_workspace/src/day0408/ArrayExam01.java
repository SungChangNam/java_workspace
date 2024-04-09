package day0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0401.forEx01;

/*
 * 문]
 * 배열을 이용하여 한명의 학생에 대해 성적처리 프로그램 구형
 *
 * 
 * 
 * 
 * */
public class ArrayExam01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		if (args.length ==0) {
			System.out.println("Java ArrayExaxm01 subject1, subjet2");
			System.exit(0);
		}
		
		System.out.print("당신의 이름은 ?");
		String name =br.readLine();
		String[] sub= new String[args.length];
		
		
		for (int i = 0; i < args.length; i++) {
			sub[i]=args[i]; //과목명을 subject 배열에 저장함
			
		}
		
		int[] score = new int[sub.length+1];
		// 국,영,수 총점
		
		for (int i = 0; i < score.length-1; i++) {
			System.out.print(sub[i]+" 점수 :");
			score[i] =Integer.parseInt(br.readLine());
			score[score.length-1] +=score[i]; //sum
					
		}
//		System.out.println("total : "+score[score.length-1]);
		float avg =score[score.length-1] / (float)sub.length;
		
		avg= (int)((avg+0.005)*100)/100.f; //소수점 3째 자리에서 반올림
		System.out.println("total : "+score[score.length-1]);
		System.out.println("avg: "+avg);
		
		//학점 
		char grade = 0;
		
		switch ((int)(avg/10)) {
		case 10: grade ='A'; break;
		case 9: grade ='B'; break;
		case 8: grade ='C'; break;
		case 7: grade ='D'; break;
		case 6: grade ='F'; break;
			
		}

		System.out.println();
		System.out.println("===========성적표 ===========");
		System.out.print("이 름\t");
	
		for(int i =0; i <sub.length;  i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println("총점\t 평균\t학점");
		System.out.print(name+"\t");
		for(int i =0; i <sub.length+1; i++) {
			System.out.print(score[i]+"\t");
		}
		System.out.println(avg+"\t"+grade);
		System.out.println("==========================");
	}
	
}

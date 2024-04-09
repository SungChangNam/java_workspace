package day0409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문]
 *   반 2개
 *   학생수 3명
 *   과목수 3(국,영,수)
 *   
 *   전교 석차,반석차,총첨,평균
 *   
 *   
 * 
 * 
 * */

public class ArrayExam05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"국어","영어","수학"};
		int[][][]  sub =new int[2][3][subname.length+3];
		// 0: 국어 ,1:영어,2:수학 3:총점, 4: 석차 5:전교 석차
		float[][] avg= new float[2][3];
		
		for (int h = 0; h < sub.length; h++) {//반
			for (int k = 0; k < sub[h].length; k++) {//학생수
				for (int i = 0; i  < sub[h][k].length-3 ; i++) {//과목점수
					do {
						    System.out.print(subname[i]+ "점수: "); 
						    sub[h][k][i] = Integer.parseInt(br.readLine());
	
					} while (sub[h][k][i] < 0 || sub[h][k][i] >100);
					sub[h][k][sub[h][k].length-3] += sub[h][k][i];// 총 합
					
				}
				//평균
				avg[h][k] = sub[h][k][sub[h][k].length-3] /(float) (sub[h][k].length-3);
				
				sub[h][k][sub[h][k].length-2] =1 ; //반 석차
				sub[h][k][sub[h][k].length-1] =1;// 전교석차
			
			} 
			System.out.println();
		}
		
		// 반 석차
		for (int h = 0; h < sub.length; h++) {
			for (int k = 0; k < sub[h].length; k++) {
				for (int i = 0; i < sub[h].length; i++) {
					if (sub[h][k][sub[h][k].length-3]  < sub[h][i][sub[h][i].length-3] ) {
						sub[h][k][sub[h][k].length-2] ++;				
					}
				}
			}
		}
		
		
		// 전교석차
		for (int h = 0; h < sub.length; h++) {
			for (int k = 0; k < sub[h].length; k++) {
				for (int i = 0; i < sub.length; i++) {
					for (int j = 0; j < sub[i].length; j++) {
						if (sub[h][k][sub[h][k].length-3]  < sub[i][j][sub[i][j].length-3] ) {
							sub[h][k][sub[h][k].length-1]++;
							
					}	
					}
				}
			}
		}
		
	
		
		for (int h = 0; h < sub.length; h++) {
			for (int k = 0; k < sub[h].length; k++) {
				System.out.println();
				
				
				System.out.println("총첨 : "+sub[h][k][sub[h][k].length-3] );
				System.out.println("평균 : "+avg[h][k]);
				System.out.println("반석차 :" +sub[h][k][sub[h][k].length-2]+"등 ");
				System.out.println("전교 석차 : "+ sub[h][k][sub[h][k].length-1]+" 등");
			}
		}
	
	}

}

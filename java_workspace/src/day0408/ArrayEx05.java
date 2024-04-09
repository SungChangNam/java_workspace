package day0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String[] subName = {"국어","영어","수학"};
		int[][] sub= new int[3][subName.length+1];//국어 ,영어 ,수학,총첨
		//0:첫번째 사람~~~ 2:3번째 사람.
		float[] avg= new float[3];
		
		
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub[i].length-1; j++) {
				do {
					System.out.print(subName[j]+" : ");
					sub[i][j] =Integer.parseInt(br.readLine());
					
				}while(sub[i][j] < 0 || sub[i][j] < 100);
				         sub[i][sub[i].length-1]+= sub [i][j];//총
			
			}
			System.out.println();
			avg[i]= sub[i][sub[i].length-1]/(float)(sub[i].length-1);


			
		}// 모든 정수입력
		for (int i = 0; i < sub.length; i++) {
			System.out.println();
			System.out.print("총 점:"+sub[i][sub[i].length-1] );
			System.out.println();
			System.out.print("avg" +avg[i]);
		}
		
		
		
		
		
		
		
	}

}

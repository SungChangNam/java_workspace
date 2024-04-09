package day0409;


import java.io.*;
public class ArrayExam03 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("인원수:");
		int human = Integer.parseInt(br.readLine());
		//인원 수
		//System.out.println(human);
		//이름
		String[] name = new String[human];
		//과목(레기드배열,가변배열,비정형배열)
		String[][] subject = new String[human][];
		//과목에 대한 점수
		int[][]jumsu = new int[human][];
		
		//평균
		float[]avg = new float[human];
		//학점
		char[] grade = new char[human];
		//석차
		int[]rank = new int[human];
		
		
		for(int i =0; i < human;i++) {
			// 이름 입력
			System.out.print("이름 입력:");
			name[i] = br.readLine();
			System.out.print("과목 수:");
			int subnum = Integer.parseInt(br.readLine());
			subject[i] = new String[subnum];
			//과목수 만큼 공간을 할당
			for(int j=0; j < subject[i].length;j++) {
				System.out.print((j+1)+"번째 과목 :");
				//과목명 입력
				subject[i][j] =br.readLine();
			}//end for 2	
			
			jumsu[i] = new int[subnum+1];
			for(int j=0; j < subject[i].length;j++) {
				System.out.print(subject[i][j]+"과목 점수 :");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				//누적,합계
				jumsu[i][jumsu[i].length-1] +=jumsu[i][j];
			}//end for3 (점수 입력 및 합계 계산 종료)
		}//end for1
		
		
		for(int i =0; i<human;i++) {
			avg[i] =jumsu[i][jumsu[i].length-1]/(float)subject[i].length;
			//소수점 세째 자리에 반올림해서 소수점 두번째 자리까지 표기
			avg[i] =(int)((avg[i]+0.005)*100)/100.f;
		}
		
		for(int i =0; i < human; i++) {
			switch((int)(avg[i]/10)) {
			case 10:
			case 9: grade[i]='A'; break;
			case 8: grade[i]='B'; break;
			case 7: grade[i]='C'; break;
			case 6: grade[i]='D'; break;
			default : grade[i]='F'; break;
			}
		
		}
		//석차 계산
		
		for(int i =0; i < human; i++) {
			rank[i]++;
			for(int j =0; j < human; j++) {
				if(avg[i] < avg[j] ) {
					rank[i]++;
				}
			}
		}
		
		
		
		
        System.out.println();
		
        
        for(int i =0; i < human;i++) {
		System.out.println("************"+name[i]+"님 성 적 표***********");
		System.out.print("이 름\t");      
		for(int j =0; j < subject[i].length;j++) {
			System.out.print(subject[i][j]+"\t");
		}
			System.out.println("총점\t평균\t\t학점\t석차");
			System.out.print(name[i]+"\t");//이름 출력
			
			for(int j=0; j <jumsu[i].length;j++) {//과목점수와 총점을 출력
				System.out.print(jumsu[i][j]+"\t");
		}
			System.out.println(avg[i]+"\t\t"+grade[i]+"\t"+rank[i]);
			System.out.println("***********************************");
			System.out.println();
        }
        
      		
	}//end main				
}//end class
	



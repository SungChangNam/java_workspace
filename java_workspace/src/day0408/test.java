package day0408;
import java.io.*;
public class test {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int human=Integer.parseInt(args[0]);
		//System.out.println(human);
		String[] name=new String[human];
		String[] subject=new String[args.length-1];
		// 과목명 초기화
		
		// 점수와 총점처리를 위한 배열을 선언
		int jumsu[][]=new int[human][subject.length+1];
		float[] avg=new float[human];
		char[] grade=new char[human];
		int[] rank=new int[human];
		
		//과목명 옮겨오기
		for(int i=0;i<args.length-1;i++) {
			subject[i]=args[i+1];
			//System.out.print(args[i+1]+"\t");
		}
		
		//사람수 만큼 반복
		for(int i=0;i<human;i++) {
			System.out.print(i+1+"번째 사람 이름:");
			name[i]=br.readLine();
			System.out.println(name[i]+"학생 점수 입력:");
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+"점수 입력:");
				jumsu[i][j]=Integer.parseInt(br.readLine());
				jumsu[i][subject.length]+=jumsu[i][j];
			}
			//System.out.println("총점 : "+jumsu[i][subject.length-1]);
		}
		
		//평균 구하기
		for(int i=0;i<human;i++) {
			avg[i]=jumsu[i][subject.length]/(float)(subject.length);
			avg[i]=(int)((avg[i]+0.005)*100)/100.f; 
			//System.out.println(name[i]+"학생의 평균 : "+avg[i]);
		}
		
		//학점 구하기
		for(int i=0;i<human;i++) {
			switch((int)avg[i]/10) {
				case 10: case 9: grade[i]='A';break;
				case 8: grade[i]='B';break;
				case 7: grade[i]='C';break;
				case 6: grade[i]='D';break;
				default:grade[i]='F';break;
			}
			//System.out.println(name[i]+"학생의 학점 : "+grade[i]);
		}
		
		//석차 계산
		for(int i=0;i<human;i++) {
			for(int j=0;j<human;j++) {
				if(avg[i]<avg[j])
					rank[i]++;
			}
		}
		
		
		//결과 출력
		System.out.println("***************성적표*****************");
		System.out.print("이름\t");
		for(int i=0;i<subject.length;i++)
			System.out.print(subject[i]+"\t");
		System.out.println("총점\t평균\t학점\t석차");
		for(int i=0;i<human;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<subject.length;j++)
				System.out.print(jumsu[i][j]+"\t");
			System.out.println(jumsu[i][subject.length]+"\t"+avg[i]+"\t"+grade[i]+"\t"+(int)(rank[i]+1)); // rank[i]+1 -> or 석차계산 for문에 rank[i]++;
		}
		System.out.println("************************************");

	}

}

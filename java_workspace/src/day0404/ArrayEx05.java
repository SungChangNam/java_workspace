package day0404;

import java.util.Scanner;

import day0329.ifEx01;

// 배열에 저장된 값 중에서 제일 작은 값과 제일 큰값을 구하는 프로그램
public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int max =0;
		int min =0;
		
//		int [] score = new  int [7];
//		
//		
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(i+1+" 번째 정수를 입력하세요 ");
//			 score[i] = scanner.nextInt();
//
//			 
//		}
  
		
		int [] score = {30,40,70,80,60,70,40,80};
		
		max = score[0];     // 배열에 첫번째 값의 최대값으로 초기화
		min= score[0];      // 배열에 첫번째 값의 최소값으로 초기화
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] >max ) {
				max = score[i];
			}else if(score[i] < min)
				min =score[i];
		
			
		}
		System.out.println("최대 값 : "+max);
		System.out.println("최소 값 : "+min);
		
		
		
		
		// 저장된 값 출력
//		for (int i = 0; i < score.length; i++) {
//			
//			 System.out.print(score[i]+ "\t");
//			 
//		}
		
	}

}

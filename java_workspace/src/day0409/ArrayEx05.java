package day0409;

import day0329.ifEx01;

/*
 *  2차원 배열으 이용하요 다음과 같이 출력하시오.
 *  1  5  9  13  17 
 *  2 6 10 14  18   
 *  3  7 11  15  18
 *  4  8 12 16  20
 * 
 * 
 * */



public class ArrayEx05 {

	public static void main(String[] args) {
		
		int cnt_i =4;
		int cnt_j =5;
		int[][] arr =new int[cnt_i][cnt_j];
		int num =20;
		
		for (int i = 0; i < arr.length; i++) {//행
			//행의 시작은 행인데스 +1 로 시작
			// 열의 시작은 행의크기 * 열의 인덱스
				for (int j = 0; j < arr[i].length; j++) {
                   arr[i][j] = (i+1) +(cnt_i*j); 
					
				}
		}

		
		
		
		
		for (int i = 0; i < arr.length; i++) {//행
		
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.printf("%3d\t",arr[i][j]);
			}
			System.out.println();
		}
	

	}

}

package day0409;

/*
 * 문 ]
 * 
 * 2차원 배열을 이용하여 다음과 같이 출력하시오.
 * 
 *  
 *  20 16 12  8  4
 *  19  15 11   7  3
 *  18  14 10  6  2
 *  17  13  9   5   1
 * 
 * 
 * */
		


public class ArrayEx04 {

	public static void main(String[] args) {
		int cnt_i =4;
		int cnt_j =5;
		int[][] arr =new int[cnt_i][cnt_j];
		int num =1;
		
		for (int i = 0; i < arr.length; i++) {//행
			int k=0;
			
				for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = ((cnt_i * cnt_j)-i) -(cnt_i*j);          
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

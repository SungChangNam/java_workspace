package day0409;
/*
 *  2차원 배열으 이용하요 다음과 같이 출력하시오.
 *  1   2  3  4   5 
 *  10 9 8  7   6
 *  11 12 13 14 15
 * 20 19 18 17 16
 * 
 * 
 * */
public class ArrayEx03 {

	public static void main(String[] args) {
		int cnt_i =4;
		int cnt_j =5;
		int[][] arr =new int[cnt_i][cnt_j];
		int num =1;
		
		for (int i = 0; i < arr.length; i++) {//행
		
			if (i%2==0 ) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j]= num++;
					
				}
			}else {
				for(int j =arr[i].length-1; j >=0; j--)
					arr[i][j]= num++;
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

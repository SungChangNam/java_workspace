package day0409;
/*
* 문]
* 2차원 배열을 이용하요 다음과 같이 출력하시오,
* 단 레기드 배열을 이용하시오.
* 
* 1,2,3,4
* 5,6,7
* 
*7,8,9,10
* 
* 
* 
* 
* */

public class ArrayEx02 {

	public static void main(String[] args) {
		int cnt =5;
		int[][] arr =new int[5][5];
		int num =1;
		
		for (int i = 0; i < arr.length; i++) {//행
			arr[i]=new int[i];
			for (int j = 0; j < arr[i].length; j++) {
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

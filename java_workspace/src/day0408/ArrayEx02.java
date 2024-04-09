package day0408;

/*
 * 2차원 배열
 * - 행과열을 이용하여 메오리를 할당.
 * -1차원 배열과 같으나, 괄호[] 가 하나더 들어감
 * 	int [][]  aa = new  int[4][3];
 * => 배열의 크기: 행 *열 (4행 3열)-> 12개의 메모리 공간할당
 * 
 * 2차원 배열의 index[첨자]
 *	- 행과 열로 구성 되어 있음
 *행의 범위 : 배열의 길이-1;
 *열의 길이: 0 ~ 열의 길이-1; 
 *각각 인덱에 접근하는 방법:  배열이름 [행의인덱스][열의인덱스];
 *
 *2차원 배열의 초기화
 *
 *1.int[] [] aa =new int [2][2];
 *aa[0][0]= 1:
 *aa[0][1]= 1:
 *aa[1][0]= 1:
 *aa[1][1]= 1:
 *
 *2.
 *int [][] arr2={
 *						{1,2},
 *						{3,4}						
 *}
 *
 *
 *3. int[][] arr3 = new int[2][2];
 *	  int n=1l
 *for (int i=0; i< 2; i++) {// 행  arr3.length
 *		for(int j =0 j<2; j++){// 열 arr3[i].length
 *				arr3[i][j] =n;
 *				n ++;
 *   }
 *   
 *   
 *   	System.out.println();
 *   
 *}
 *
 *
 * */

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val =1 ;
		// 2차원 배열의 선언과 초기화
		int [][]  aa = new  int[4][5];
		
//		aa[0][0]=1;
//		aa[0][1]=1;
//		aa[0][0]=1;
//		aa[1][1]=1;
		
		
//		int[][]aa= {{1,2},{3,4}};
//		
		
		
		
		for (int i  = 0; i < aa.length; i++) {
			for (int j = 0;  j<aa[i].length; j++) {
				aa[i][j] =val;
				val ++;
				
			}
	
		}
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				System.out.printf("%d\t", aa[i][j]);
			}
			System.out.println();
		}
	}

}

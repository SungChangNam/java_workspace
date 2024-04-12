package day0409;
/*
 * 3 차원 배열
 * 
 * 배열의 선언과 초기화
 * 
 * int [][][]arr =new int [면][행][열];
 * 										     2     3     3    = 18
 * 
 * int[][][] arr = {
 * 		{
 *     {1, 2,3},
 *     {1, 2,3},
 *     {1, 2,3}
 * }
 * }면
  * 
  * 
  *   		{
 *     {1, 2,3},
 *     {1, 2,3},
 *     {1, 2,3}
 * }면
 * 
 * 
 * */
public class ArrayExam04 {

	public static void main(String[] args) {
		int[][][]  arr = new int [2] [3] [4];


		//입력
		int val=1;
		
		for (int i = 0; i < arr.length; i++) {//면
			for (int j = 0; j < arr[i].length; j++) {//행
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k]=val;
					val++;
				}
				
			}
		
		}
		
		
		//출력
		for (int i = 0; i < arr.length; i++) {//면
			for (int j = 0; j < arr[i].length; j++) {//행
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("%3d", arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}

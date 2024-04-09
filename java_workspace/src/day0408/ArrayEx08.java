package day0408;

/*
 * 문]
 * 
 * 레기드 배열을 만들어 값을 초기화하여 출력하시오.
 * 10 11 12
 * 20 21 
 * 30,31,32
 * 40 41
 * 
 * 
 * */

public class ArrayEx08 {

	public static void main(String[] args) {
		int [][] arr= new int[4][];
		
		  arr[0]= new int[3];  // 첫번쨰 행에 1열개
		  arr[1]= new int[2];  // 둘번쨰 행에 2열개
		  arr[2]= new int[3];  // 셋번쨰 행에 3열개
		  arr[3]= new int[2];  // 네번쨰 행에 4열개
		
//		int [][]arr = {
//				{10,11,12},
//				{20,21},
//				{30,31,32},
//				{40,41}};
		int v=1;
		
		  for (int i = 0; i < arr.length; i++) {
//			  arr[i] = new int [i+1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]+=(i+1) *10+j;
			}
			
		}
		  for (int i = 0; i < arr.length; i++) {
			 
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}

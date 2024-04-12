package day0408;
/*
 * 비정형배열, 레기드 배열,가변배열
 * 	-행마다 열의 개수가 서로 다른 배열을 의미함.
 * int arr[][] = new int[4][];
 * arr[0]= new int[1];
 * arr[1]= new int[2];
 * arr[2]= new int[3];
 * arr[3]= new int[4];
 * 
 * 
 * */
public class ArrayEx07 {

	public static void main(String[] args) {
		
//		  int arr[][] = new int[4][];
//		  arr[0]= new int[1];  // 첫번쨰 행에 1열개
//		  arr[1]= new int[2];  // 둘번쨰 행에 2열개
//		  arr[2]= new int[3];  // 셋번쨰 행에 3열개
//		  arr[3]= new int[4];  // 네번쨰 행에 4열개
		  
		  int v=1;
		  
		  int arr[][] = {
				  {1,},
				  {2,3},
				  {3,4,5},
				  {6,7,8,9}
		  };
		  
		  
		  
		  for (int i = 0; i < arr.length; i++) {
			  arr[i] = new int [i+1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]+=v++;
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

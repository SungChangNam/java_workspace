package day0409;
/*
 * 문]
 * 2차원 배열을 이용하요 다음과 같이 출력하시오,
 * 단 레기드 배열을 이용하시오.
 * 
 * 1,2,3,4
 * 5,6,7
 * 8,9
 * 10
 * 
 * 
 * 
 * 
 * */
public class ArrayEx01 {

	public static void main(String[] args) {
		
		int cnt =4;
		int[][] arr =new int[cnt][];
		int num =1;
		
		for (int i = 0; i < arr.length; i++) {//행
			//레기드 배열 2차  : 행이 늘어날떄 열의 크기는 다시 초기화
			//행의 크키가 늘어날떄마다 열의크기는 하나씪 감소한다.
			arr[i]=new int[cnt-i];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]= num++;
			}
		}

		for (int i = 0; i < arr.length; i++) {//행
		
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println();
			}
		}

	}

}

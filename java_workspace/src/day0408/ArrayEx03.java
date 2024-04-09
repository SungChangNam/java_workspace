package day0408;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int score = scanner.nextInt();
//		int [][] arr= new int[3][4];
	
		int[][] arr = {{100,90,100},
								{20,25,30},
								{30,30,30},
								{40,40,40},
								{50,50,50}
								};
		
		int sum=0;
//		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] =%d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	for (int[] is : arr) {// arr 의 1차원 배열을 인덱스를temp 저장
		for (int is2 : is) {// temp 는 1차원 배열의 가르키는 참조 변수
			sum +=is2;
		}
		
	}
	System.out.println("합"+sum);

		
//		
//		
//		for (int i = 0; i < arr.length; i++) { //학생수
//			System.out.print("학생 번호 :");
//			arr[i][j] =scanner.nextInt();
//			for (int j = 0; j < arr[i].length; j++) { // 과목수
//				System.out.print("입력 :");
//				arr[i][j] =scanner.nextInt();
//			}
//			System.out.println();
//		}

	}

}

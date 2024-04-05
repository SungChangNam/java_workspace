package day0405;

import java.util.Scanner;

public class ArrayEX06_1 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
//      char hak =0;
		float avg =0.0f;
	
		String[] subname= {"국어","영어","수학",};
		int[] sub = new int[subname.length+1];
		
		System.out.println(sub.length);
		//sub.length  국 영 수 합
		for (int i = 0; i < sub.length-1; i++) {
			
			do{
			
			System.out.print(subname[i] +  "점수:" );
			sub[i] = scanner.nextInt();
			}while(sub[i]<0 || sub[i] >100);
			
			sub[sub.length-1] +=sub[i];
		
		}
		System.out.println("총점 : " +sub[sub.length-1]);

	}

}

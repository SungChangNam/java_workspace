package day0405;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		
		int[] don = {50000,10000,1000,500,100,50,10,1};
		
		Scanner scanner =new Scanner(System.in);
	
		int money ,cnt;
		System.out.print("금액 입력 :");
		money =scanner.nextInt();
		
		for (int i = 0; i < don.length; i++) {
			cnt =money/ don[i]; //돈의 개수

			if(cnt >0) {// 해당 금액의 개수가 존재하는 경우
				System.out.println(don[i] + "원 짜리 : " +cnt+ "개");
				money = money %don[i];
			}
		
		}
	}

}

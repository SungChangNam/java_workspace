package day0405;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("5 개의 정수를 입력하세요:");
        for (int i = 0; i < num.length; i++) {
			
			num[i] = scanner.nextInt();
			
		}
        System.out.println(" 출력");
        for (int i = 4; i >=0; i--) {
        	
			System.out.print(num[i]);
			if (i >0){
				System.out.print( ", ");
			}
		
		}
		
	
			
		
	
	}

}

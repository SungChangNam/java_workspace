package day0402;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;

public class WhileExam05 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		double multi =1;
		int i = 1;
		System.out.print("승수 입력 :");
		int num = scanner.nextInt();
	

		while (i <=num) {
			multi *=2;
			i++;
		}
		System.out.println("2의 "+num+ "승은"+ multi + " 입니다");
	}
	
	

}

package day0328;

import java.lang.StackWalker.Option;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class CondiEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char grade = ' ',opt = ' ';
		System.out.print("점수를를 입력하세요 :");
		int score =sc.nextInt();
		String  rusult= "학점입니다.";
		
		if (score >=0  && score <=100) {
			
			if (score >=90 ) {
				grade ='A';
				if (score>=96) {
					opt='+';
//					System.out.println("A+");
				}else {
//					System.out.println("A");
					opt ='-';
					
					
				}
				
			}	else if (score>=80) {
				System.out.println("B");
			}else if (score>=70) {
				System.out.println("C");
			}else if (score>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
			System.out.printf("당신의 학점은 %c %c입니다.%n",grade,opt);
		}
		else {
			System.out.println("점수 범위가 초과됨");
		}
	
	}

}





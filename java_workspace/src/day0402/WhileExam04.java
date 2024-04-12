package day0402;

import java.util.Scanner;
import java.util.function.BiConsumer;

/*
 * 문]
 * 입력된 정수의 평균을 구하는 프로그램을 작성하시오.
 * 먼저 정수의 개수를 입력 받고
 * 입력받능 개수만큼 정수를 입력받아
 * 평균을 구하면됨
 * 입력받는 값의 정수, 평균 은 실수로 처리
 * 
 * 
 * */
public class WhileExam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i =1,num1 =0, cnt=0 ,sum=0;
		double avg=0;
		System.out.print("정수 개수 를입력하세요 : ");
		cnt = scanner.nextInt();
		
		while (i<cnt) {
			System.out.print("정수 를입력하세요 : ");
			num1 = scanner.nextInt();
			
			sum +=num1;
			i++;
			
		}
		avg= (double) sum/cnt ;
		System.out.println("입력 값 평균:" +avg);

	}

}

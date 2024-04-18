package testday;
/*
 * 문]


 * 두 개의 정수를 입력받아서 그 사이에 존재하는 정수들의
 * 합계를 구하는 프로그램을 구현하시오
 * 
 *  ex)5, 2  ->2+3+4+5 
 */
import java.io.IOException;
import java.util.Scanner;

public class Q1between {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,i,sum=0;
		
		System.out.print("정수 입력:");
		a = sc.nextInt();
		 			
		System.out.print("정수 입력:");
		b = sc.nextInt();
		
        if(a >b) {
        	int temp =a;
        	a =b;
        	b=temp;
        }
		
		for( i=a;i<=b ;i++) {
			sum +=i;
			  
		}
			
		System.out.printf("%d 에서 %d 까지의 사이 수 합 : %d%n",a,b,sum);
			
		
	 }

	}

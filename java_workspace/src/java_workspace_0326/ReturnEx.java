package java_workspace_0326;

import java.util.Scanner;

public class ReturnEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int  n, sum;
		System.out.print("정수 입력 :");
		n= scanner.nextInt();
		
		 if (n < 1) {
			System.out.println("0 보다 큰 정수를 입력하셔야합니다.");
				return; // 메인 메서드  종료(빠져나감)
		}
		 sum =0;
		 for (int i = 1; i <= n; i++) {
			 
			sum += i;
			
		}
		 System.out.println("합계 :"+sum);
	}

}

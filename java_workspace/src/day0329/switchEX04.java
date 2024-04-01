package day0329;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class switchEX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int  num1, num2 ,sum ,min,div,mul,mok;
	

		System.out.print("첫번째 정수: ");
		num1 = sc.nextInt();
//		num1 =  Integer.parseInt(br.readLine());
		
		System.out.print("연산자: ");
		char op =sc.next().charAt(0);
//		char op =  (char)System.in.read();
//		System.in.skip(2);
		
		
		System.out.print("두번째 정수: ");
		num2 = sc.nextInt();
//		num2 =  Integer.parseInt(br.readLine());
		
		if (num1 <=0 || num2<=0) {
			System.out.println("계산할 수 없습네다!");
			return ;
		}
		
		
		int result =0;
	
		
		switch (op) {
		case '+' :
			result=(num1 +num2);
		break;
		
		case '-':
			result=(num1 -num2);
		break;
		
		case '*':
			result=(num1 *num2);
		break;
		
		case '/':
			result=(num1 /num2);
		break;
		
		case '%':
			result=(num1 %num2);
		break;

			default:System.out.printf("올바른 형식을 입력해주세요");
			break;
		}
		System.out.println("result = " +result);
	}

}

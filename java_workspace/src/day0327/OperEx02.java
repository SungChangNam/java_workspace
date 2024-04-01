package day0327;

import java.io.*;
import java.util.Scanner;

/*
 	문
 	사용자로 부터 임의의 두 정수를 입력받아 사칙연산과
 	나머지를 구하는 프로그램을 구현하시오.
 	단 BufferedReader 사용
 	
 	결과
 	
 	첫번째 정수 10;
 	연산자 입력 :
 	두번째 정수 2
 	
 	
 	10 + 2 =12
 	10 - 2 =8
 	10 *2 =20
 	10 / 2 =5
 	10% /2 =0
 	
 	출력은 printf() 함수를 사용
 */
public class OperEx02 {

	public static void main(String[] args) throws IOException {

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

		
//		if (op == '+') {
//			System.out.printf("%d + %d =  %d \n",num1,num2,(num1+num2));
//			System.out.printf("%d  %c %d = %d\n",num1,op,num2,(num1+num2));
//		}else if (op=='-') {
//			System.out.printf("%d - %d =  %d \n",num1,num2,(num1-num2));
//			System.out.printf("%d  %c %d = %d\n",num1,op,num2,(num1-num2));
//		}else if (op=='*') {
//			System.out.printf("%d * %d =  %d \n",num1,num2,(num1*num2));
//			System.out.printf("%d  %c %d = %d\n",num1,op,num2,(num1*num2));
//		}else if (op=='/') {
//			System.out.printf("%d /%d =  %d \n",num1,num2,(num1/num2));
//			System.out.printf("%d  %c %d = %d\n",num1,op,num2,(num1/num2));
//		}else if (op=='&') {
//			System.out.printf("%d - & =  %d \n",num1,num2,(num1&num2));
//			System.out.printf("%d  %c %d = %d\n",num1,op,num2,(num1&num2));
//		}
		
		switch (op) {
		case '+' :System.out.printf("%d + %d =  %d \n",num1,num2,(num1+num2));
		break;
		
		case '-':System.out.printf("%d - %d =  %d \n",num1,num2,(num1-num2));
		break;
		
		case '*':System.out.printf("%d * %d =  %d \n",num1,num2,(num1*num2));
		break;
		
		case '/':System.out.printf("%d / %d =  %d \n",num1,num2,(num1/num2));
		break;
		
		case '&':System.out.printf("%d %% =  %d \n",num1,num2,(num1%num2));	
		break;

			default:System.out.printf("올바른 형식을 입력해주세요");
			break;
		}
		
//		sum = num1 + num2;
//		min = num1 - num2;
//		mul = num1 * num2;
//		div = num1  /num2;
//		mok = num1  %num2;
//		

//     println 를 사용한 출력법
//		System.out.println(num1 +" + "+  num2+ " = "+ sum+"\n");
//		System.out.println(num1 +" - "+  num2+ " = "+ min+"\n");
//		System.out.println(num1 +" * "+  num2+ " = "+ mul+"\n");
//		System.out.println(num1 +" / "+  num2+ " = "+ div+"\n");
//		System.out.println(num1 +"&"+  num2+ " = "+ mok+"\n");

		
// printf 를 사용한 출력법
//		System.out.printf("%d + %d =  %d \n",num1,num2,(num1+num2));
//		System.out.printf("%d -  %d =   %d \n",num1,num2,min);
//		System.out.printf("%d * %d =  %d \n",num1,num2,mul);
//		System.out.printf("%d /  %d =  %d \n",num1,num2,div);
//		System.out.printf("%d %% %d = %d ",num1,num2,mok);

	}

}

package day0411Obj.methodex;
/*
 *  문]
 *   계산기 프로그램  ,+ ,- ,*,/ ,% 등의 연산을 메소드를 이용하여
 *  처리하는 프로그램 구현
 *   더하기 , 뺴기 곱하기 나누기 나머지 출력기능
 * 
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;import java.util.spi.AbstractResourceBundleProvider;






public class MethodEx3 {
	
	Scanner sc =new Scanner(System.in);
	static BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
	

	

	
	 public static  int add(int x, int y) {
		 
		 return x + y;
	 }
	 public static  int min(int x, int y) {
		 return x - y;
	 }
	 public static  int multi(int x, int y) {
		 return x * y;
	 }
	 public static  int div(int x, int y) {
		 return x / y;
	 }
	
	 public static  int namu(int x, int y) {
		 return x % y;
	 }
	
		
	public static void disp(int a, char b, int c, int d) {
		System.out.println();
		System.out.println(a+"" +b + "" +c+ "="+d);
		
	}
	public static void main(String[] args) throws IOException  {
		int sum=0;
		// TODO Auto-generated method stub
		char yon = 0;
		
		System.out.print("첫번쪠 정수 :");
		int a = Integer.parseInt(br.readLine());
	
		do {
			System.out.println("yon (+,-,*,/,%) :");
			yon  =(char)System.in.read();
			System.in.read();
			System.in.read();
		} while (yon != '+'&&  yon !='-'&&  yon !='*'&&  yon !='/'&&  yon !='%');
		
		System.out.print("두번쪠 정수 :");
		int b = Integer.parseInt(br.readLine());
		
		switch (yon) {
		case '+' :
			sum = add(a, b);
			break;
		case '-' :
			sum = min(a, b);
			break;
		case '*' :
			sum = multi(a, b);
			break;
		case '/' :
			sum = div(a, b);
			break;
		case '%' :
			sum = namu(a, b);
			break;
		default:
			break;
		}
		
	disp(a,yon,b,sum);

		
		
		System.out.println("");
		
		System.out.printf(" %d + %d = %d\n", a,b,add(a, b));
		System.out.println("두수의 뺄셈 은  : " +min(a, b));
		System.out.println("두수의  곱은는 : " +multi(a, b));
		System.out.println("두수의 나기는  : " +div(a, b));
		System.out.println("두수의 몫은  : " +namu(a, b));
		
		
		

	}

}

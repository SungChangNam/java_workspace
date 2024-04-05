package day0402;

import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

/*
 * 문]
 *  계산기 프로그램을 구현하시오.
 *  한번 계산후 다시 계산할 것인지를 물어보고 수행을 계속할것인지를
 *  결정하는 프로그램 구현
 *  
 *  결과 
 *  
 *  첫번쨰 수 : 100 
 *  연산자 : + 
 *  두번째 수: 200
 *  
 *  100 + 200  = 300;
 *  
 *  계속 진행 하시겠습니까(y / n) : y
 *  
 *   첫번쨰 수 : 100 
 *  연산자 : + 
 *  두번째 수: 200
 *  
 * 
 * */

import java.io.*;
public class DowhileExam02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = 
				new BufferedReader( new InputStreamReader(System.in));
		
		int n1= 0,n2=0 ,sum=0;
		char op = 0;
		
		while (true) {
			System.out.print("첫번째 수 :");
			n1 = Integer.parseInt(br.readLine());
			do {
				System.out.print("연산사 :" );
				op = (char)System.in.read();
						br.readLine();
	
				
			} while (op =='+'  && op!= '-' && op!= '*' && op!= '/' && op!= '%' );
			 while (true) {
					System.out.print("두번쨰 수:");
					n2 = Integer.parseInt(br.readLine());
				
				if ((op == '/' || op  == '%') && n2 == 0) {
					System.out.println("정수 연산에서 0으로 나누거나 0으로 나눈 나머지를 구할수 없습니다.");
					continue;
				}
				break;
			}
			 switch (op) {
			case '+': sum = n1 + n2; break; 
			
			case '-': sum = n1 - n2; break; 
			
			case '*': sum = n1 * n2; break; 
			
			case '/': sum = n1 / n2; break; 
			
			case '%': sum = n1 %n2; break; 
					
			}
			 
			 
			 System.out.println(n1 +" "+op+" "+ n2 +"="+sum);
			
			do {
			
				
				System.out.print("계속 하시겠습니까? (y/n)");
				op =(char)System.in.read();
//					System.in.skip(2);
//					System.in.read();
//					System.in.read();
				br.readLine();
			} while (!(op =='y' ||  op =='Y' || op=='n' ||op =='N'));
			if (op =='N' || op =='n') 
				break;
				
			System.out.println("계산기 프로그램을 종료합니다.");
		}

	}

}

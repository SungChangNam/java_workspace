package day0327;

import java.io.*;
public class OperEx01 {

	public static void main(String[] args) throws IOException {
		System.out.print("문자입력 :");
//		
//		int  i =  System.in.read();
//		System.out.println("Value :" +(char) i);
		char ch =  (char)System.in.read();
		System.out.println("Value : " + ch) ;
		

		
		/*
	 	System : 시스템 관련된 클래스
		 in : InputStream  과  연결괸 객체로 키보드로 부터 입력 처리
		 out : PrintStream 과 연결된 객체로 console 로 출력을 처리한다.
		 err :  PrintStream 과 열결된 객체로  console 로 출력을 처리하고,
						일반적으로 에러 메시지를 표시할떄 많이 사용됨.
		*/
//		
//		int  num =  System.in.read()-48;
//		int  num =  System.in.read()-'0';
		
		System.out.print("첫번째 숫자입력 : " );
		int  num1 =  System.in.read()-48;
		/*
		System.in.read(); // 엔터키를 '\r' 받아서 처리하는 부분
		System.in.read();//  엔터키의 '\n' 받아서 처리하는 부분
		*/
		System.in.skip(2); //윗 부분과 같은 기능 
		
		System.out.print("두번째 숫자입력 : " );
		int  num2 =  System.in.read()-'0';
//		System.out.println(num);

	}
	
		
}

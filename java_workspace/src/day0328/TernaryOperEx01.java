package day0328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.Inflater;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class TernaryOperEx01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int num =sc.nextInt();
		String str1= "";
//		String str = (num % 2 ==0 )? "짝" :"홀";
//		System.out.println( "입력받은 수는 :"  +(num % 2 == 0 ?  "짝수" : "홀수"));
//		System.out.println( "입력받은 수는 :"  +str);
	 
		if (num %2 == 0) {
			str1 ="짝";
		}else {
			str1= "홀";
		}
		
		System.out.println( "입력받은 수는 :"  +str1);
	}

}

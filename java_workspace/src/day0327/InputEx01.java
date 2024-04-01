package day0327;

import java.io.*;
public class InputEx01 {

	public static void main(String[] args) throws IOException {
		/*
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		*/
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.print("이름 입력:");
		String  name =br.readLine()	;
		System.out.println(name);
		
		
	}

}

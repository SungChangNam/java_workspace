package day0409;

import java.util.Stack;

public class test1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
		
		sb.trimToSize();
	
		System.out.println(sb);
		sb.append("hello");
		System.out.println(sb);
		sb.append(" ");
		sb.append("jump to java");
		String result = sb.toString();
		System.out.println(result);

		int a =10;
		int b = 10;
		
		int c=0;
		

	}

}

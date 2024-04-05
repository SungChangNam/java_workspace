package day0405;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
	
		String str="";
		double sum = 0.0;
		for (int i = 0; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);
			
			
		}
		System.out.println(sum);
	
	}

}

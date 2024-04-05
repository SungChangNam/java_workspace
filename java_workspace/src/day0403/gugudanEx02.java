package day0403;

import java.util.*;
public class gugudanEx02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i= 0 ,j=0,k=0 ,num=0;
		System.out.print("출력할 단 입력 :");
		num =scanner.nextInt();
		
		for (i =1; i <9; i+=num) {
			for(j =1 ; j<=9; j++) {
				for(k=1; k<=num; k++) {
					if (i+k <=9) 
						System.out.print((i+k)+" *  " +j+" = "+(i+k)*j+"\t\t");
					
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}

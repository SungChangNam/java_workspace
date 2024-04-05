package day0403;

import java.util.Iterator;

/*
 * 문] for, while, do ~while
 * 
 *    ******
 *    *****
 *    ***
 *    **
 *  	*
 *    
 * 
 * 
 * 
 * 
 * */
public class LoopEx01 {

	public static void main(String[] args) {
		
//		int i,j;
		
		int i =0;
		while (i <=5) {
			int j=1;
			while(j <=5-i) {
				System.out.print(" *");
				j++;
			}
			System.out.println();
			i++;
		}
		
//		for (i = 1; i <= 5;  i++) {
//			for (j = i;  j <=5-i; j ++ ) {
//				System.out.print(" *");
//			
//			}
//
//			System.out.println();
//		}

	}

}

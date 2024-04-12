package day0403;

import java.util.Iterator;

import day0401.forEx01;

public class gugudanEx01 {

	public static void main(String[] args) {
	int i =0;
	int j=0;
	
	for (i= 1; i<=9; i++) {
		for(j=1; j<=3; j++) {
				int x = j + 1 + (i - 1) / 3 * 3;
				int y = i % 3 ==0? 3: i%3;
				
				if (x>9) 
					break;
	
			System.out.printf(" %d * %d = %d",x,y,(x*y));
			System.out.print("\t");
		}
		System.out.println();
		if (i %3 ==0)
			System.out.println();
			
		
	}

	}

}

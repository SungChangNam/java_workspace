package day0403;

/*
 *                      *
 *                    ***
 *                   ****
 *                  *****
 *                 ******
 *                ********
 *               *********
 *              ***********
 * 
 * 
 * 
 * */

public class LoopEx03 {

	public static void main(String[] args) {
	
		
		for(int i = 0; i<10; i++) {
			for(int j=10-(i+1); j>=0; j--) {
				System.out.print(" ");
			}
			
			for(int j=0; j < (i+1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
			
	}

}

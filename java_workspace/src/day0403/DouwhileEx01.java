package day0403;

public class DouwhileEx01 {

	public static void main(String[] args) {
		
		
		int i =1;
		
		while (i <=5) {
			int j =1;
			while (j <=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}


	}

}

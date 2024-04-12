package day0408;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val =1 ;
		int [][]  aa = new  int[3][4];

		for (int i  = 0; i < 3; i++) {
			for (int j = 0;  j<4; j++) {
				aa[i][j] =val;
				val ++;
			}
			System.out.println();
		}
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				System.out.printf("%d\t", aa[i][j]);
			}
			System.out.println();
		}
	}

}

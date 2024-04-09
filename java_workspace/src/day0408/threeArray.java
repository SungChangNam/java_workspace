package day0408;

public class threeArray {

	public static void main(String[] args) {
		int val =0 ;
		int[][][] aaa = new int [2][10][4];
		
	
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					aaa [i][j][j2] =val;
					val++;
				}
			}
		}
		System.out.println();
		
		for (int i = 0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[i].length; j++) {
				for (int j2 = 0; j2 < aaa[i][j].length; j2++) {
					System.out.printf("%d\t", aaa[i][j][j2]);
				}
				System.out.println();
			}
			System.out.println();
			}
	
	}
	

}

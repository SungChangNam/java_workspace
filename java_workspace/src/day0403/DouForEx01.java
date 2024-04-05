package day0403;

public class DouForEx01 {

	public static void main(String[] args) {
		// 5행 10열   별(*)
//		System.out.println(" * * * * * * * * * * ");
//		System.out.println(" * * * * * * * * * * ");
//		System.out.println(" * * * * * * * * * * ");
//		System.out.println(" * * * * * * * * * * ");
//		System.out.println(" * * * * * * * * * * ");
	
		
//		for (int i = 1; i < 5; i++) {
//			System.out.println("  * * * * * * * * * * ");
//		}
		for (int i = 1; i <=5; i++) {

//			System.out.print("  *  ");
			
			for (int j =1; j <=i; j++) {
			System.out.print("  *  ");
	
		}
			System.out.println();
		}
	}

}

package java_workspace_0326;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		int n =1;
		Scanner scanner =new Scanner(System.in);
		String str ="";


 		while (n !=0){
 			System.out.print("점심 메뉴(0종료,1라멘,2 우동 ,3국밥)");
 			n =scanner.nextInt();
 		if(n ==0) {
 			System.out.print("종료");
 			System.exit(0);
 		}

 			switch (n) {
			case 1:
				str ="라멘";
				break;
			case 2:
				str ="우동";
				break;
			case 3:
				str ="국밥";
				break;
			case 4:
				str ="짜장";
				break;

			default:
				break;
			}
 			System.out.println("Today Lunch is " + str+"");
 		}
 		
		
 		
	}
}

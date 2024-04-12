package day0411Obj.methodex;
/*
 *  1 번 을 누르면 두개의 정수를 입력받아 그중 큰수를 출력하는 기능
 *  2 번 을 누루면 두개의 정수를 입력받아 그 사이에 합계를 구하는 기능
 *  3 번 세개의 정수를 입력받아 큰 순서대로 나열하는 프로그램 구현
 * 
 * 
 * */








import java.io.*;

import day0329.ifEx01;
public class MethodEx2 {
	static BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
	
	public static int  aaa() throws IOException {

		System.out.print("첫번쪠 정수 :");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번쪠 정수 :");
		int b = Integer.parseInt(br.readLine());
		
		if (a>b) {
			return a;
		}
		return b;
	}
	
	public static void  bbb() throws IOException {

		System.out.print("첫번쪠 정수 :");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번쪠 정수 :");
		int b = Integer.parseInt(br.readLine());
		
		int sum =0;
		
		if (a> b) {
			a  = a^ b;
			b  =b^ a;
			a  = a^ b;
					
		}
		
		for (int i = a; i < b; i++) {
			sum +=i;
		}
		System.out.println(a+" ~ "+ b + "사이의 합계 :"+sum );
		return ;
		
	}



	
	public static    String ccc (int x,int y,int z) {
		if (y>= x && y >=z) {
			int imsi =x;
			x= y;
			y= imsi;
			
		}else if (z >= x && z >=y) {
			int imsi =x;
			x =2;
			z= imsi;
			
		}
		if (z >=y) {
			int imsi =y;
			y=z;
			z =imsi;
			
		}
		 return x + "," + y + "," + z;
		
	}
	
	public static void main(String[] args)  throws IOException{
	
		int x  =0; 
		
		
		while (true) {
			System.out.print("1: 최대값 2: 사이합 3: 수나열 4: 종료 = >");
			
		
			
			x  = Integer.parseInt(br.readLine());
			if (x ==1 ) {
				int k = aaa();
				System.out.println("둘중 최대수는 " +k+"입니다.");
			}else if (x ==2) {
				bbb();
				System.out.println("두수의 합은 " +"입니다.");
			}else if (x ==3) {
				System.out.println("첫번째 수:  ");
				int firstnum=  Integer.parseInt(br.readLine());
				System.out.println("두번째 수:  ");
				int secondnum=  Integer.parseInt(br.readLine());
				System.out.println("세번째 수:  ");
				int thirdnum=  Integer.parseInt(br.readLine());
				String str = ccc(firstnum, secondnum, thirdnum);
				System.out.println("큰순으로 나열 => " +str);
	
				
			}else if (x ==4) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.println();
			
		}
		
		System.out.println("수고가 많으십니다.");

	}

}

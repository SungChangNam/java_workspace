package day0328;

import java.util.Scanner;
/*
 	사용자로 부터 임의의 정수 세개를 입력받아
 	작은 수에서부터 큰수 순서대로 출력하는 프로그램을 구현하세요.
 	
 	첫번째 16
 	두번째 8
 	세번째 21
 	
 	8 16 21
 	
  */

public class CondiEx07 {

	public static void main(String[] args) {
		// 첫번째 정수가 두번째 정수 보다 큰경우
		// 첫번째 정수가 세번째 정수 보다 큰경우 
		// 두번째 정수가 세번째 정수 보다 큰경우 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x1,y2, z3 ,temp;
        
		System.out.print("첫 번째 정수를 입력하세요: ");
		 x1 = sc.nextInt();
      
        System.out.print("두 번째 정수를 입력하세요: ");
         y2 = sc.nextInt();
         
         System.out.print("세 번째 정수를 입력하세요: ");
         z3 = sc.nextInt();
    
         if(x1 >y2) {
        	 temp =x1;
        	 x1=y2;
        	 y2=temp;
         }
         
         if(x1 >z3) {
        	 temp =x1;
        	 y2=z3;
        	 z3=temp;
         }
         
         if(y2 >z3) {
           	 temp =y2;
           	 y2=z3;
           	 z3=temp;
            }

		
		
		
//        x1 = x1 ^ y2;
//        y2 = y2 ^ x1;
//        x1 = x1 ^ y2;
//        z3 = z3 ^ y2;
//        z3 = z3 ^ x1;
		System.out.println("x  =  " +x1+ " y = "+ y2+  "z= " +z3 );
		
	
	}

}





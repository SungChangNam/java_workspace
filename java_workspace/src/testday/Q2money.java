package testday;

import java.util.Scanner;

public class Q2money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]don = {50000,10000,1000,500,100,50,10,1};
		
		Scanner sc = new Scanner(System.in);
		int money,cnt;
		
       System.out.println("가격 입력:");
       money = sc.nextInt();
       
       for(int i=0; i < don.length;i++) {
    	   cnt = money/don[i];
    	   
    	   if(cnt > 0) {//해당 금약의 개수가 존재하는 경우
    		   System.out.println(don[i]+"원 짜리 :"+cnt+"개");
    		   money = money %don[i];
    	    }
    	}
		
	}

}

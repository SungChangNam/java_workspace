package day0402;
/*
 * 
 *  while 문은 조건이 참인동안 문장을 수행하고, 거짓이 될때까지 블럭내의
 *  문장을 수행
 * 
 *  형식
 *  
 *  초기값;
 *  
 *  while(조건){
 *  				조건이 참일 경주 반복되는 문장.
 *  }
 * 
 * */

import day0329.ifEx01;

public class whileEx01 {

	public static void main(String[] args) {
	/*
		int i =5;
				
		
	 while (i  !=0) {
		
		System.out.println(i+"- > I can do  it");
		i --;
		
	}
	*/
	System.out.println();
	 System.out.println("지금 부터 카운터 다운을 시작합니다");
	 
	 int  i = 11;
	 while (i --!=0) {
		System.out.println(i);
		
		for (int j = 0; j < 2_000_000_000; j++) {
			
		}
	
	}	
	 System.out.println("Game is Over~~~");
	}

}

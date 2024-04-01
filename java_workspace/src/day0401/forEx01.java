package day0401;

/* 반복문  -> 어떤 작업이 반복적으로 수행되도록 할때 사용하는 문장이다.
 * 반복문의 종류 :  for 문 while문이고 ,  while 문의 변형인 do~ while 문이있다.
 * 
 *  for 문은 반복 횟수를 알고 있을때 적합한 반복문이다.
 *  
 *    		for 문 형식
 *    			
 *   			for(초기값  ; 조건문 ;  증감식){
 *   						반복수행할 실행문 ;
 *   				} 
 * 
 * 		 	반복수행할 문장이 하나일 경우는  {}로 생략 가능
 * 
 *
 */

// 1부터 5까지 세로 한번씩 가로로 한번출력하는 프로그램 구현
import java.util.Iterator;

public class forEx01 {
	
	public static void main(String[] args) {
	
	    for (int i = 1; i <= 5; i++) {
		      System.out.println(i);
		    }

		    System.out.println(); // 줄 바꿈

		    // 1부터 5까지 가로로 한 번씩 출력
		    for (int i = 1; i <= 5; i++) {
		      System.out.print(i + " ");
		    }
		  }
		
	
	

}

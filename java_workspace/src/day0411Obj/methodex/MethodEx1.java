package day0411Obj.methodex;



/*
 * 메소드란?
 * - 객체가 할 수 있는 동작을 정의하는것 
 * 
 * 메소드 종류
 * 	instance 메소드
 * 		- 인스턴스 변수와 관련된 작업만 수행, 인스턴스 변수를 필요로하는 메소드
 * 		- 인스턴스를 생성해야만 접근이 가능한 메소드
* 				클래스명 객체 = new 생성자();
* 				MethodEx add = new MethodEx();
* 			- 인스턴스 변수는 객체를 생성해야지만 만들어지고
* 		       인스턴스 메소드 역시 객체를 생성해야만 호추링 가능함
* 					   
 *    
 * static 메소드 
 *    - 인스턴스와  관계없는(인스턴스 변수나 인스턴스 변수를 사용하지 않는)메소드를
 *    	클래스 메소드(static 메소드) 라고 함
 *    -인스턴스를 생성하지않고도 접근이 가능하다.
 *    -인스턴스 변수를 사용할 수 없음.
 *   -
 *   
 *   메소드 구성
 *     [접근 제한자]  [반환형]  [메소드명] )(자료형 argument){
 *     		수행문 1;
 *     		수행문 2;
 *    
 *     
 *     }
 *      접근제한자
 *      - 객체나 멤버들에 대한 접근을 제한하는 방법을 의미함
 *      	public, protected, default ,private
 *      
 *      
 *      반환형 
 *      	- 메소드에서 해야할 수행문을 다 수행하고 마지막으로
 *      		자신을 불러준 곳으로 반환 값을 자료형을 의미함
 *      		만약 ,반환값이 없다면 void 라는 예약으로 대처한다.
 *      		즉, void는 값이 없다 -> 반환형자리는 생략 불가능
 *      		
 *      메소드명
 *      	- 사용자 정의 이름이며 예약어는 사용불가
 *      	
 *      인자
 *      	- 매개변수라고하면 메소드를 호출할때 필여에 따라
 *      	  특정값을 제공하기 위해 미리선언하는 것
 *     	 메소드 호출시에는 반드시  인자의 자료형과 수가 일치해야한다.
 *     
 *      수행문 
 *     	 - 식을 수행 및 제어문 또는 실행문을 의미함.
 *     			
 *      
 *        
 *    
 * */

class MethodEx {
	public int sum ( int i , int j) {//인스턴스 메소드s
		
			return i +j ; // 10 +10
		
	}
	
	public static int  sub(int i , int j) {// static 메소드
		return i - j ; // 20 -10
	}
	
	public static int multi ( int i, int j) {
		return i *j;
	}
	
	public static int div ( int i, int j) {
		return i /j;
	}
}

public class MethodEx1 {
	

	public static void main(String[] args) {
		MethodEx me = new MethodEx();
		int i  = 10, j =10;
		
		
		System.out.println("더한 값" + me.sum(i,j));
		
		System.out.println("뺀 값" + me.sub(i,j));
		
		System.out.println("곱한 값" + me.multi(i,j));
		
		System.out.println("나눈한 값" +  me.div(i,j));
		
		
		
		
		me.sum(10, 21);
		
	 System.out.println(MethodEx.sub(20, 10));
		
		
		
		
	}

}

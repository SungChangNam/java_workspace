package day0412Obj.book;

/*
 * 
 * 클래스 헤더 
 * 	
 * 
 * 	[접근 제한자(public, default)]  [클래스 종류(final, abstract)] class 클래스명
 * 
 * 	1. 접근제한자 : 현재 클래스를 생성하고 사용하는데 있어 제한을 둔다는 의미임
 * 							  public, default (아무것도 쓰지 않는 방법)
 * 
 * 	2. 클래스의 종류 : final, abstract (추상)등 어떤 클래스인지를 알리는 예약어
 * 	
 * 	멤버 필드
 *       1. 변수, 상수
 *       2. 객체가 만들어질떄 특징적인 속성을 저장하는것
 *       3.static 변수 , 상수 와 instance 변수와 상수로 나누어짐
 *       
 *       멤버 메소드 
 *      	 1. 특정한 일을 수행하는 단위, 또는 동작을 의미함
 *      	 2.static 메소드와 instance 메소드로 나눠짐
 *      	 
 *      
 *      	클래스와 객체의 정의와 용도
 *      
 *      
 *       클래스의 정의 : 객체를 정의해 놓은 것(클래스는 일종의 객체의 설계도)
 * 	  클래스의 용도 : 객체를 생성하는데 사용된다.
 * 
 *		  객체의 정의 : 실제로 존재하는 것을 의미함(사물이나 개념)
 *		  객체의 용도 : 객체가 가지고 있는 기능과 속성에 따라 다르다.
 * 
 * 
 * 
 * */

 class AA{// default  클래스 : default예약어 생략 가능
	static int aa;
	int a;
	
	public static void ccc() {
		
	}
	public void dddd() {
		
	}
}


//클래스 정의
public class book {//클래스명 (클래스 해더)
	//속성 -> 변수, 상수 : 멤버 필드
	String neam;
	String writer;
	
	int price;
	int nowpage;
	String isbn;
	
	public class Book {// 생성자는 반환형을 갖지 않는다.
		
	}
	
	public void nextPage() {
		AA.aa=20;
		AA  aaa =new AA();
		aaa.a=10;
		aaa.dddd();
		
		nowpage ++;
	}
	public void previousPage() {
		nowpage--;
		
		AA.ccc();
	}
	
}

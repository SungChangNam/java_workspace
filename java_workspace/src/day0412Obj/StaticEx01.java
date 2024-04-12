package day0412Obj;

/*
 *  static
 *  1. 메소드나 멤버변수에 정의할 수 있으며 지역변수나 클래스에는 정의불가
 *  2. static 키워드 사용하면 statice 변수 (클래스변수), static 메소드 (클래스 메소드)라고 칭함
 *  3. 멤버변수나 멤버 메소드는 해당 객체가 생성될때 heap영역에 존재함
 *  4.static 으로 선언된 필드나 메소드 static 영역에 유일하게 만들어지면서
 *  	 모든 객체들이 사용할 수 있는 공유  개념을 가진다.
 *  5. 객체를 생성하지 않더라도 사용가능합니다.
 *  		클래스명, 변수명 또는 클래스명, 메소드명으로 접근이 가능하다.
 *  
 *  		static 메소드 선언
 *  		[접근제한자] static 반환형 메소드명(자료형 인자1...){}
 *  		
 *  		static 필드 선언
 *  		[접근제한자] static 자료형, 변수형;
 * 
 * 
 * 
 * */



class StaticEX {
	int x;
	static int y;
}

public class StaticEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(StaticEX.x); //  why -> x 라는 변수는 인스턴스 변수이므로 접근 불가
		// 따라서 x라는 변수에 접근하려면 객체를 생성해서 접근해야한다.
		System.out.println(StaticEX.y);//0
		StaticEX.y=100;
		System.out.println(StaticEX.y);// 100
		
		StaticEX se = new StaticEX();
		
		System.out.println(se.x);// 0
		System.out.println(se.y);// 100
	}

}

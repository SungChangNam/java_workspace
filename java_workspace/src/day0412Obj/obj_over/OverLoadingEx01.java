package day0412Obj.obj_over;

/*
 * 
 *  메소드 오버로딩
 *  
 * 		1. 하나의 클래서(동일 클래스)에서 같은 이름을 가진 메소드가 여러개 정의 되는 것을 의미함
 * 		2.같은 이름의 메소드에 인자값이 다른 경우
 * 			ㅁㅁ(0) 
 * 			ㅁㅁ(ㅁㅁ) 
 * 			ㅁㅁ(ㅁ,ㅁ,ㅁ,) 
 * 		3. 인자값이 다르다는 것을 개수가 다르거나, 자료형이 다르거나, 인수의 순서가 다른경우를 의미함
 * 		4. 같은 목적으로 비슷한 동작을 수행하는 메소드를 모아 이름을 같게 만들어 일관성을 유지하기 위함
 * 		
 * 		형식
 * 		
 * 		접근 제한자 반환형 메소드명(자로형 인자, 자료형 인자,...)
 * 		
 * 		접근 제한자 반환형은 상관이 없음
 * 		
 * 		반드시 동일
 *  			메소드명은 항상 같아야 한다.
 *  			
 *  		반드시 다르게
 *  			자료형형과 매게변수 개수는 달라야한다.
 *				 
 * */

public class OverLoadingEx01 {

	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println("입력한 값의 길이 : "+s.length());
	}
	public void floatLength(float f) {
		String s = String.valueOf(f);
		System.out.println("입력한 값의 길이 : "+s.length());
	}
	
	public void stringLength(String str) {
		
		System.out.println("입력한 값의 길이 : "+str.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			OverLoadingEx01 oe=new OverLoadingEx01();
			oe.intLength(100);
			oe.floatLength(3.14f);
	}

}

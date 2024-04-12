

/*
 * 
 * 클래스 헤더 
 * 	
 * 
 * 	[접근 제한자(public, default)]  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
//클래스 정의
public class book {//클래스명 (클래스 해더)
	//속성 -> 변수, 상수 : 멤버 필드
	String neam;
	String writer;
	
	int price;
	int nowpage;
	String isbn;
	
	public Book() {// 생성잔느 반환형을 갖지 않는다.
		
	}
	
	public void nextPage() {
		nowpage ++;
	}
	public void previousPage() {
		nowpage--;
	}
	
}

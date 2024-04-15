package day0415.Classpre;

/*
 * 다음 멤버를 가지고 직사각형 을 표현하는 Rectangle 클래스를 구현하시오
 * int 타입 x,y ,width, height 필드
 * 
 * */

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x,int y, int width,int height) {
		this.x =x;
		this.y =y;
		this.width =width;
		this.height = height;
		
	}

	 public int square() {
		return width*height;
	}

	 public  Boolean contains(Rectangle r) {
		 if (x <r.x && y <r.y  && x +width >r.x+r.width && y+height > r.y+height) {
			return true;
		}else {
			return false;
		}
	 }
	 public void show() {
		 
		 System.out.print("("+x+","+y+")에서");
		
		 System.out.println("크기가 " +width +"x " +height+"인사각형");
		 
			
	 }
}

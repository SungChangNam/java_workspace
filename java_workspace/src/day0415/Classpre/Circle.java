package day0415.Classpre;

public class Circle {
	private double x,y;
	private int radius;
	
	public Circle(double x ,double y ,int radius) {
		this.x =x;
		this.y=y;
		this.radius = radius;
	}

	

	  public void show() {
	        System.out.printf("(%f,%f)%d\n", x, y, radius);
	    }
}

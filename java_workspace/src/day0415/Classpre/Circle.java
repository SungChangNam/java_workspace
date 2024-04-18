package day0415.Classpre;

public class Circle {
	private double x,y;
	private int radius;
	
	public Circle(double x ,double y ,int radius) {
		this.x =x;
		this.y=y;
		this.radius = radius;
	}

	

	  public double getX() {
		return x;
	}



	public void setX(double x) {
		this.x = x;
	}



	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}



	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}



	public void show() {
	        System.out.printf("(%f,%f)%d\n", x, y, radius);
	    }
	  
	public double getArea() {
		return Math.PI *radius;
		
	}
	
}

package day0412Obj.obj_over;

public class OverLoadingEx03 {
	
	public int area (int w, int h) {
		return w *h;
	}
	
	public double arear(int r) {
		return r *r *3.141592;
	}
	
	public void write(int result) {
		System.out.println("사각형의 넓이 : " +result);
	}
	
public void write(double result) {
	System.out.println("원의 넓이 : " +result);
	}
	public static void main(String[] args) {
		
		OverLoadingEx03 oe3 = new OverLoadingEx03();
		int re = oe3.area(10,5);
		double db = oe3.arear(10);
		oe3.write(re);
		oe3.write(db);
	}

}

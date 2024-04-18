package testday;
class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}
public class Q4Tv extends TV{
	private int color;
	public Q4Tv(int size, int color){
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + color + "컬러");
	}
	public static void main(String[] args) {
		Q4Tv myTV = new Q4Tv(32, 1024);
		myTV.printProperty();
	}
}
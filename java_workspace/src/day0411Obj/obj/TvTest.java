package day0411Obj.obj;

public class TvTest {

	public static void main(String[] args) {
		Tv tv= new Tv();
		
		tv.channel = 7 ;
		tv.channelDown();
		System.out.println("현재 채널은" + tv.channel+" 입니다.");
		tv.color ="black";
		tv.power =true;
		
		System.out.println(tv.color);
		System.out.println(tv.power);
	}

}

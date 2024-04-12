package day0411Obj.obj;

public class TvTest2 {

	public static void main(String[] args) {
		
		Tv tv1 =new Tv();
		Tv tv2 =new Tv();
	
		
		
//		Tv[] tvArr= new Tv[3];
		/*
		//객체 배열
		
		tvArr[0] =new Tv();
		tvArr[1] =new Tv();
		tvArr[2] =new Tv();
		*/
//		Tv  tvArr = {new Tv(),new Tv(),new Tv()};
		Tv[] tvArr= new Tv[100];
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] =new Tv();
		}
		System.out.println("tv 1의 CHANNEL 은" +tv1.channel+ "입니다");
		System.out.println("tv 2의 CHANNEL 은" +tv2.channel+ "입니다");
		tv2= tv1;
		tv1.channel =7;
		System.out.println("tv 1의 CHANNEL 은" +tv1.channel+ "로 변경" );
		
		System.out.println("tv 1의 CHANNEL 은" +tv1.channel+ "입니다");
		System.out.println("tv 2의 CHANNEL 은" +tv2.channel+ "입니다");
		
		System.out.println(tv1.channel);
	

	}

}

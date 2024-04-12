package day0411Obj.obj;

public class TvTest3 {

	public static void main(String[] args) {
		Tv[] tvArr= new Tv[3];
		//길이가 3인 객체 배열 생성
		
		//생성된 객체 배열에 값을 저장

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel= i +10;
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			// 채널이 1증가
			tvArr[i].channelUp();// [0] 11,
			
			System.out.printf("tvArr[%d].channel =%d%n",i,tvArr[i].channel);
		}
	

	}

}

package day0411Obj.obj;



/*
 *  클래스의 구성 요소 : 속성과 기능
 *  		속성 : 멤버변수 , 특성, 필드, 상태
 *  		기능: 메소드, 함수,행위
 *  		
 *  tv => 속성 : 크기 ,길이 높이,색상,볼륨, 채널
 *  			기능: 켜기 , 끄기, 볼륨 높이기,볼륨 낮추기, 채널 변경
 * 
 * 			속성은 --> 맴버 변수
 * 			기능은 --> 메소드()
 * 
 * 
 * */

public class Tv {
	
	String color; //색상
	boolean power; //전원 상태
	int channel; //채널
	

	
	void power() {
		power = !power; // power true 이면 false or false면 true
	}
	void channelUp() {
		channel ++;
	}
	void channelDown() {
		channel --;
	}
	
}

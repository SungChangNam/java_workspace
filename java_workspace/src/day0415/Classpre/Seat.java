package day0415.Classpre;


import java.util.Scanner;
public class Seat {

	private String seat[];
	
	public Seat() { // 좌석 생성자
		seat = new String[10]; //10개의 좌석
		for(int i=0; i<seat.length; i++) {
			seat[i] = "---";
		}
	}
	
	public void Show() { // 좌석 상태 출력
		for(int i=0; i<seat.length; i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println();
	}
	
	public void Set(String name, int num) { // 예매된 좌석 정보 처리
		seat[num-1] = name;
	}
	
	public boolean reSet(String name) { // 좌석 취소 정보 확인 후, 처리
		for(int i=0; i<seat.length; i++) {
			if(name.equals(seat[i])) {
				seat[i] = "---";
				return true;
			}
		}
		return false;
	}
	
}

 class Consert{
	
	Scanner sc = new Scanner(System.in);
	private Seat s[]; // 세개의 등급 당 좌석 생성
	private String seatGrade[] = {"S", "A", "B"}; // 좌석 등급별 이름
	
	public   Consert() {
		s  = new Seat[3];
		for(int i=0; i<s.length; i++) {
			s[i] = new Seat();
		}
	}
} 

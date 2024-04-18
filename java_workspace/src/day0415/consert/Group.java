package day0415.consert;

import java.util.Scanner;

import day0401.forEx01;


public class Group {
	private char type;
	private Seat[] seats;
	private Scanner scanner = new Scanner(System.in);
	
	
	public Group(char type, int num) {
		this.type =type;
		seats =new Seat[num];
		for (int i = 0; i < seats.length; i++) 
			seats[i]= new Seat();
			
	}
	
	public boolean reserve() {// 현재 등급의 좌석 예약
		int no;
		String name;
		show(); //좌석에 현재 상태를 보여줌
		
		
		System.out.print("이름 >> ");
		name =scanner.next();
		System.out.print("번호 >> ");
		no =scanner.nextInt();
		
		if (no < 1 || no >= seats.length) {
			System.out.println("잘못된 좌석 입니다.");
			return false;
		}
		//자석이 이미 예약 되어있다면
		if (seats[no-1].isOccupied() ) {
			System.out.println("이미예약된 좌석입니다.");
			return false;
		}
		seats[no-1].reserve(name);
		return true;
	}
	
	public boolean  cancel() {// 현재 예약된 등급 취소
		show();
		System.out.print("이름 >>"); // 취소할 사람의 이름
		String name =scanner.next();
		
		if (name != null) {// 예약된 사람이 존재하면
			for(int i =0; i <seats.length; i++) {
				if (seats[i].match(name)) {
					seats[i].cancel();
					return true;
				}
			}
			System.out.println("예약자의 이름을 찾을 수 없습니다.");
			
		}
		return false;
	}
	
	public void show() {//현재 등급의 좌석 출력
		System.out.println(type +">>");
		for (int i = 0; i < seats.length; i++) {
			// 예약이 되었다면
			if (seats[i].isOccupied()) 
				System.out.println(seats[i].getName());
			else// 자리가 비어있다면
				System.out.print("---");
			System.out.print(" ");	
		}
		System.out.println();
	}
	
	
	
	
}

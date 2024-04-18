package day0415.consert;

import java.util.Scanner;

public class Concert {
	private String  hallName;
	private Group[]  group= new Group[3];
	private Scanner scanner = new Scanner(System.in);
	
	
	public Concert(String  hallName) { // 생성자로 이름과 좌석 그룹을 초기화함
		this.hallName =hallName;
		group[0]= new Group('S',10); //S석
		group[1]= new Group('A',10); // A석
		group[2]= new Group('B',10);// B석
	}
	
	public void reserve() {//예약
		
		System.out.print("좌석 구분 S(1), A(2), B(3) >> : ");
		int type = scanner.nextInt();
		if (type <1 || type >3) {
			System.out.println("잘못된 좌석 타입 입니다.");
			return;
		}
		group[type-1].reserve();
	}
	
	public void search() { //예약 검색
		for (int i = 0; i < group.length; i++) {
			group[i].show();
			
		}
		System.out.println("조회를 맞쳤습니다..");
			
	}
	
	public void cancel() {// 에약 취소
		System.out.print("좌석 구분 S(1), A(2), B(3) >> : ");
		int type = scanner.nextInt();
		if (type <1 || type >3) {
			System.out.println("잘못된 좌석 타입 입니다.");
			return;
		}
		group[type-1].cancel();

		
	}
	
	public void run() {// 프로그램 실행(예약 ,취소 ,검색)
		System.out.println(hallName + " 예약  프로그램 입니다.");
		int choice = 0;
		
		while (choice != 4) {
			System.out.print("예약:1, 조회 :2 , 취소:3 , 종료 :4 ");
			choice =scanner.nextInt();
			switch (choice) {
			case 1:
				reserve();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				System.out.println("글로벌인 콘서트 예약 프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
			
		}
 		
			
	}
	

	
}

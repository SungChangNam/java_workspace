package day0409;

import java.util.Scanner;

import day0329.ifEx01;

/*
 *  컴퓨터와 사용자가 가위,바위,보 게임을 진행합니다.
 *  사용자거 먼저 시작합니다.
 *  사용자가 가위 ,바위,보 중 하나를 입력합니다.
 *  컴퓨터는  랜덤으로 가위,바위,보 중 하나를 선택하여 냅니다.
 *  
 *  사용자와 컴퓨터가 입력한 값을 비교하여 누가 이겼는지를 판정하는 프로그램을 구현하시오.
 *  가위,바위,보 아니면 "그만!" 단어가 입력되면 프로그램을 종료합니다.
 *  
 *  가위,바위,보 문자열 배열을 생성
 *  	String [] str ={"가위","바위","보",};
 *  
 *  	랜덤
 *  	int n = (int)(Math.random()*3);
 *  
 * 	컴퓨터가 낸것이 바위인지를 비교
 * 	if(str[n].equals("바위"))
 * 
 * 
 * 
 * 
 * */
public class ArrayExam07 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("가위,바위,보 중 하나를 입력하세요 :");
		String a = scanner.nextLine();
		  
		   	String [] com ={"가위","바위","보",};
		 
		   	int n = (int)(Math.random()*3);
		   	String b=scanner.nextLine();
		 
		 
		   
		  
		   	
//		  	if(a.equals("그만")) {
//		  		break;
//		  	}

//		   	int n = (int)(Math.random()*3);
//		   	String[] b=com[n];
		  	
	}

}

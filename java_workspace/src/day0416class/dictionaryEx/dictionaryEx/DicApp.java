package day0416class.dictionaryEx;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("한영 단어 검색 프로그램입니다.");
	      while (true) {
			System.out.print("한글 단어? : ");
			String serach= sc.next();
			if (serach.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
				}
			String eng= Dictionary.kor2Eng(serach);
			if (eng.equals("false")) 
				System.out.println(serach+"는 사전에 업습니다.");
			else 
				System.out.println(eng);
		}
	      sc.close();
	}

}

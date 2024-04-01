package day0327;
import java.util.*;

public class InputEx03 {

	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 문자열 일력
		System.out.print("이름 입력 :");
		 String name = sc.nextLine();
		 //int num = Integer.parseInt(name);
		 System.out.print("나이 입력 :");
		 int age = sc.nextInt(); 
		 System.out.println(name);
		 System.out.println(age);
		 

	}

}

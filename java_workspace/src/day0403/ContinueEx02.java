package day0403;

import java.util.Scanner;

/*
 * continue -> 반복문 내에서만 사용가능하며
 * 						반복이 진행하는 도중에 continue 문 을 만나면
 * 						반복문을 끝으로 이동하여 다음 반복문으로 넘어간다.
 * 문]
 *  1~10 사이의 정수를 출력하되,
 *  3의 배수는 제외시키시오.
 * 
 * 
 * */
public class ContinueEx02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			if(i %3 == 0)
				continue;
			System.out.println(i);
			
			
		}
		
	}

}

package day0402;

import day0329.ifEx01;

/*
 * 
 *  문]
 *  -50 에서 1까지의 수를 출력하는 프로그램을 작성하시오.
 *  단, 한줄에  5의 수만 출력하고, 수들 사의 간격을  탭 만큼  띄우시오.
 *  
 * */

public class WhileExam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -50;
		
		
		while (i <= 1) {
			System.out.printf("%d\t",i);
			i ++;
			if(i  % 5 == 0) {
				System.out.println();
			}
		}
		
	}

}

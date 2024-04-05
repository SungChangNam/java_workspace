package day0402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/*
 * 문]
 * 
 * 년도와 월을 입력받아 달력을 출력하는 프로그램을 구현하시오.
 * 
 * 1년 1월 1일 월요일 기준으로 계산하면 쉽지만,
 * 현재 년도를 기준으로 계산
 * */
public class DowhileExam03 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = 
				new BufferedReader( new InputStreamReader(System.in));
		int year =0, month =0, start =0,end = 0;
		boolean bool = false; // 윤년판정여부 --> true : 윤년
		int base =2024; //2024년 1월 1일 기준
		
		int pos= 0;
		//년도 입력 -> 년도에 범위가 넘어가면 다시입력
		do {
			System.out.print("1. 년도 입력 (2024)  :");
			year = Integer.parseInt(br.readLine());	
		} while (year < 0 || year > 9999);
		
		//월 입력 -> 월에 범위가 넘어가면 다시입력
		do {
			System.out.print("2. 월 입력 (4)  :");
			month = Integer.parseInt(br.readLine());	
		} while (month < 1 || month > 12);
		
		// 입력 받은 년도가 평년인지 윤년인지 판정
		if (year %4 ==0  && year % 100  != 0 || year % base %400 ==0) 
			bool =true; // 윤년
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: end=31;break;
		case 4: case 6: case 9: case 11: end= 30; break;
		case 2: if (bool)  end =29;  else end= 28;
		}
		if(base >year) {
			start = base - year;
			
			for (int i = year; i < base; i++) 
				if(i %4 ==0 && i % 100 != 0 || i % 400 ==0)
					start ++;
			start = 7  -start %7;
			if (start ==7) start =0;
			

		}
		else {
			start = year -base;
			for(int i = base; i<year; i++)
				if (i % 4 ==0  && i %100 !=0 || i% 400 ==0) {
					start++;
				}
			start %= 7;
		}
		
		for (int i = 1; i < month; ++i) {
			switch (i) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: start +=30;  break;
			case 4:	 case 6: case 9: case 11: start +=30; break;
			case 2: if (bool) {
				start +=29;
				
			}else {
				start+=28;
			}
			
		
			}
			start %=7;
			System.out.println();
			System.out.print("=================<");
			if (year <10) System.out.print("000");
			else if (year <100) System.out.println("00");
			else if (year <1000) System.out.println("0");
			System.out.print(year +"  year");
			if (month <10) System.out.print(" 0");
		
			System.out.println(month +" month > ============");
			System.out.println("Sun\t Mon \t Tue \t Wed \t Thu \t Fri \t Sat\t");
			for(i = 0; i <start; ++i ,++pos ) {
				System.out.println("\t");
			}
			for ( i= 1; i < end; i++) 
				if (i <10) System.out.println(" ");
				System.out.println(i);
			++pos;
			if (pos % 7 ==0)  System.out.println();
			else System.out.println("\t");

		}
		if(pos % 7  !=0)System.out.println();
		System.out.println("=================");
	}

}

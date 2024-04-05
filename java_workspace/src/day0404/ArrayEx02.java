package day0404;

import java.sql.Array;
import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		int [] aa= new int [5];
		aa[0]=1;
		aa[1]=2;
		aa[2]=3;
		aa[3]=5;
		aa[4]=1;
		String [] src= {"java","DataBase","jsp","HTML"};
//		String  []src2= {"css","Javascript","Spring"};
		String[] des	=new String[7];
		des[0] ="Css";
		des[1] ="hsp";
		des[2] ="ppp";
		

		System.arraycopy(src, 0, des, 3, 4);
		// 큰 배열에 기존 배열게 값을 복사하여 저장한다.

		
		/*
		 * arraycopy(
		 * 1. object src: 원본배열
		 * 2.int srcPos: 원본 배역을 복사 위치시작)
		 * 3.int destdes
		 * 4.int destPos : 복사가 될 시작위치
		 * 5.int length : 복사가 되는 원본 배열 배열의 길이
		 * 
		 * */

		for (String string : des) {
			System.out.println("des values :"+string);
		}
		
		char[]  bb= new char[5];
		bb[0] = 'a';
		bb[1] = 'B';
		bb[2] = 'c';
		bb[3] = 'D';
		bb[4] = ' ';
		
		
			

	}

}

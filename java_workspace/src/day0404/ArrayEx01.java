package day0404;
/*
 * 같은 타입(자료형)의 여러 변수를 하나의 묶음으로 만들어 놓은것
 * 같은 타입(자료형)의 여러 변수를 하나의 묶음으로 다루는 것
 * 
 *   배열은 인덱스(index:첨자)와 인덱스 대응하는 데이터들로
 *   이루어진 역속적인 자료구조로서, 같은 종료의 데이터들이
 *   순차적으로 저장됨
 *   
 *   자바에서 하나의 배열은 하나의 객체로 인식함
 *   
 *   같은 자료형이 여러개 반복될때 이를 하나의 변수명으로 관리하며,
 *   각각의 구분은 순차적인 첨자를 사용함
 * 
 *   참조(reference)자료형 -> 크기  :4byte
 * 
 * 1차원 배열
 * [행][열][]
 * 
 * 선언 :int[] 배열명 ;
 * 		  int    배열명 [];
 * 선언과 초가화 
 * int[] a = new int[개수];
 * int[] a ={값1,값2,값3,}
 * 
 * new : 메모리 공간이 할당되면  자동으로 초기화 된다.
 * */
import day0401.forEx01;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =1;
		int [] score =new int[5];
		int  i= 0;
	
		//배열에 데이터를 할당함
		score[0] =50;
		score[1] =60;
		score[k+1] =70;
		score[3] =80;
		score[4] =90;
		
		int sum =0;
	
	for (i = 0; i < score.length; i++) {
		sum += score[i];
		
	}
	System.out.println(  "sum =" + sum);
	}

}

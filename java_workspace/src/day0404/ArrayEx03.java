package day0404;

import java.util.Arrays;

/*
 *반복문을 이용해서 배열을 복사하는 방법
 *
 *  
 * 
 * 
 * */

public class ArrayEx03 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		// 배열에 1~5 까지 정수를 저장한다.
	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
//			System.out.print(arr[i]);
		}
		System.out.println("[변경전]");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("arr["+i+"] : "+ arr[i]);
		}
		System.out.println("변경전"+arr.length);
		int temp[] =new int[arr.length*2];
	// arr 에저장됨 배열 temp 저장
		for (int i = 0; i < arr.length; i++) {
			temp[i] =arr[i];
			
		}
		
		
	
		System.out.println("변경후 "+temp.length);
		
		for (int i = 0; i < temp.length; i++) {
//			temp[i] = i+1;
			System.out.println("temp["+i+"] : "+ temp[i]);
		}
	// 템프에 저장됨 값을 arr 저장
		arr = temp;
		
		System.out.println("변경후"+arr.length);
		
	// arr 에저장됨 배열 temp 저장
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("arr["+i+"] : "+ arr[i]);
		}
		
		for (int arry : temp) {
			 System.out.println(arry);
		}
		
	}

}

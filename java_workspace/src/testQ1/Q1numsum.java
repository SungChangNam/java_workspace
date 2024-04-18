package testQ1;

import java.util.Scanner;

public class Q1numsum {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);  
        int sum =0,max =0,min =0;  
        System.out.print("첫 번째 정수: ");  
        int num1 = sc.nextInt ();  
        System.out.print("두 번째 정수: ");  
        int num2 = sc.nextInt ();  
        if (num1> num2) {  
            max =num1 ;  
            min =num2 ;  
        }else {  
            max =num2;  
            min =num1;  
        }  
        for ( int i=min ; i<=max; i++){
            sum +=i;  
        }  
        System.out.println(min+"에서 "+ max+ "까지의 정수들의 합: "+ sum );  
    }  

	}



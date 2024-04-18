package testQ1;

import java.util.Scanner;

public class Q1between {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();
        
        int sum = 0;
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            sum += i;
        }
        
        System.out.println(num1 + "에서 " + num2 + "사이의 합계 " + sum + "입니다.");
    }
	
	
}
	```    


```
	
	
	
	
	
	
}

package day0403;import java.util.function.BiConsumer;

import day0329.ifEx01;

/*
 *  문]
 *  
 *  숫자를 1부터 계속 더해 나가서  몇까지 더하면 합계가 100을 넘는지를 
 *  알아내는 프로그램을 구현하시오
 * 
 * 
 * 
 * */
public class BreakEx {
	public static void main(String[] args) {
		int sum =0;
		int i = 0; 
		
		for(;;) {
			if (sum >100 ) 
				break;
				i ++;
				sum +=i;
		
			System.out.println("i ="  + i + "이고, sum" +sum);
		}
		System.out.println();
		while (true) {
			sum =0;
			i = 0; 
			if (sum >100 ) 
				break;
				i ++;
				sum +=i;
			
			
			System.out.println("i ="  + i + "이고, sum" +sum);
			sum =0;
			i =0;
			do {
				if(sum >100)
					break;
				i++;
				sum +=i;;
			} while (true);
			
		}
		
	}

}

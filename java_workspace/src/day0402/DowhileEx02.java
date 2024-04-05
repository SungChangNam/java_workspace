package day0402;
/*
 * 1에서 100까지 
 * 숫자중 3의 배수가 포함되어 있으면, 포함된 개수만큼 박수를 치는  3 6 9 게임을 구현
 * 10 으로 나누고, 10으로 나눈 나머지 연산을 하면됨
 * 
 * */
public class DowhileEx02 {

	public static void main(String[] args) {
		int i =0 ,temp;
		for ( i = 1; i <100; i++) {
			System.out.printf("i = %d",i);
			System.out.println();
			temp = i;
			
			do {
				if(temp %10  %3 == 0 && temp %10 !=0)
					System.out.print("짝");
			} while ((temp  /=10) != 0);
			System.out.println();
		}
	}

}

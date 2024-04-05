package day0405;

public class ArrayEx07 {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		// 45 개의 정수형 데이터를 저장할 공간 할당.
		
		for (int i = 0; i < lotto.length; i++) {
			//각 인덱스에 1~45까지의 정수를 저장
//			lotto[i] = i+1;
//			System.out.print(lotto[i] +"\t");
//			if (lotto[i]  % 5 ==0) 
//				System.out.println();
			
		}
		int temp =0; // 두 값을 바꾸는데 사용할 변수
		int j = 0; // 임의의 정수 을 저장할 변수
		
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random()  *45); // 0 ~ 44 임의의 값을 저장한다.
			
			temp= lotto[i];
			lotto[i] =j;
			lotto[j]= temp;
			
		}
	
		// 배열 lotto 저장된 값을 출력
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d \t",lotto[i] );
		}
		System.out.println();
		
	}

}

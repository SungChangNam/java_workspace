package day0403;


public class DouWhileEx02 {

	public static void main(String[] args) {
		
		//2를입력하면 2단씩 3을 출력 하면 3단 씩 출력
		int  sum =3;
		int i =2;
		
		while (i<=9) {
			int j = 1;
			while(j <=9) {
					System.out.printf("%d * %d  = %d\n",i ,j ,(i*j ));	
					j++;
			}
			
			System.out.println();
			i++;
		}
		
//		while (i <= 9) {
//		    int j = 1;
//		    while (j <= 9) {
//		        System.out.printf("%d * %d = %d\t", i, j, (i * j));
//		        j++;
//		    }
//		    System.out.println(); // 3단 출력 후 줄 바꿈
//		  
//
//		    if (i % sum == 0) {
//		        System.out.println(); // 3단씩 출력 후 빈 줄 추가
//		    }
//
//		    i++;
//		}

	}

}

package day0327;
/*
	XOR 연산자를 이용하여 두 변수의 값을 바꿈
	x =20 , y =20
	
	XOR
	
	x = 23, y=20
	
	swap - > 바꾼다.
	
	int temp ;
	
*/

public class BitOperEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 23,y = 20;
		int temp ;
		

//		temp = x;
//		x=y;
//		y=temp;
		
		x = x ^ y;
		
		y = y^ x;
		
		x = x ^y;
		
		System.out.println("x  =  " +x+ " y ="+ y );
		
		
		

		
		
		

	}

}

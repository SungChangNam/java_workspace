package day0405;

/*
 * 문]
 * 
 *  char 자료형을 배열에  알파벳 대문자를 저장 하고,
 *  저장된 배열의 전체 데이터를 출력하는프로그램.
 *  단, 반복문을 이용하여 구현
 *  
 *  A ~~Z
 * 
 * 
 * */
public class ArrayEx03 {

	public static void main(String[] args) {
	
		char[] ch =new char[26];

		
		
		
		for (int i = 0 ,  a =65; i < ch.length; i++ ,a++) {
			ch[i] = (char)a;
			System.out.print("["+ch[i]+"] ");
		
		}
		System.out.println();
		for (int i = 0; i < ch.length; i++) {
			ch[i]= (char)('A'+i+32);
			System.out.print("["+ch[i]+"] ");
		}
		
		char [] arp =new char[26];
		for (int i = 0; i < arp.length; i++) {
			arp[i]=(char)('A'+i);
			
		}
		System.out.println();
		for (int i = 0; i < arp.length; i++) {
			System.out.printf("[%2c] ",arp[i]);
			
		}
	}

}

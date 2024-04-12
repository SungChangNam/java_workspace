package day0409;

import java.util.Scanner;

/*
 * 문]
 * 	
 * 	영단어를 보여주고 단어의 뜻을 알아 맞추는 프로그램 구현해 보자
 * 	
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class ArrayExam06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [][] words = {
				{"chair","의자"},// words [0][0], words[0][1]
				{"table","테이블"},// words [1][0], words[][1]
				{"computer","컴퓨터"},// words [2][0], words[2][1]				
		} ;
		
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("%d. %s의 뜻은? ",i+1,words[i][0]);
			String temp= scanner.nextLine();
			if (temp.equals(words[i][1])) 
				System.out.println("정답");
			else {
				System.out.printf("땡 !  정답은 %s입니다.\n",words[i][1]);
			}

		}
		

	}

}

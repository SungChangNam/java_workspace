package day0402;

import java.io.*;
public class whileEx02 {

	public static void main (String[] args) throws IOException{
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("게임을 계속 진행 하시겠습니까???");
			System.out.println("y/n  => ");
			char ch =(char)System.in.read();
			System.in.read();
			System.in.read();
			
			if (ch == 'n' ||ch =='N') {
				System.out.println("game is over");
				break;
			}
		}
	}

}

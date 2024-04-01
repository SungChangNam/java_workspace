package day0327;

import java.io.*;

import javax.swing.text.html.HTMLEditorKit.Parser;
public class InputEx02 {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		int  kor, eng ,math ;
		float ave = 0.0f;
		double dd;

		System.out.print("국어 점수: ");
		kor =  Integer.parseInt(br.readLine());
		System.out.print("영어 점수: ");
		eng =  Integer.parseInt(br.readLine());
		System.out.print("수학 점수: ");
		math =  Integer.parseInt(br.readLine());
		
		int sum = kor+ eng+math;
		float avg = sum /3.f;

		System.out.println("3과목 합 :" + sum );
		System.out.println("3과목 평균 :" + avg );
//		ff = Float.parseFloat(br.readLine());
//		dd = Double.parseDouble(br.readLine());
		
	
		
	}

}

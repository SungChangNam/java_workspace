package day0411Obj.obj;


/*	
 * 		Record Class
 * 			-속성만 존재하는 클래스
 * 			
 * 			속성: 이름 , 국어,영어,수학,총점,평균 ,석차
 * 		
 * 
 * 
 * 
 * */

public class Record {
	// name
	String name;
	
	// 국어, 영어, 수학 에 대한 점수를 저장할 공간
	
	int[] score =  new int[3];
	
	// 총점
	int tot;
	
	// 평균
	double avg;
	
	//석차
	int rank;
	
	
	
	
}

package day0411Obj.obj;

/*
 *   문]
 *     학생별로  국어,영어, 수학  점수를 입력받아 
 *     총점 평균 석차를 계산하는 프로그램 을 구현하시오.
 *     단,클래스를 활용하여 작성하고 또한 객체 배열을 활용하여 구현한다.
 *     클래스 구성
 *     1.Record 클래스 -> 속성만 존재하는 클래스로 설계
 *     
 *     2.Sung  클래스 -> 인원수를 입력받아, 입력받은 인원수 만큼 
 *     								이름 국어,영어, 수학 ,점수를 입력받고 
 *     								총점,평균 석차를 구하는 클래스
 *     
 *     					속성 : 인원수 Record 클래스 배열
 *     					기능: 인원수 입력, 상세 데이터 입력 ,계산기능
 *     								총점,평균,석차 계산기능,결과 출력
 *     
 *    3. 실행 클래스 --> ObjArrayEX 클래스에서 구현
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class ObjArrayEX {

	public static void main(String[] args) {
		// 인스턴스 생성
		Song s = new Song();
		//Record r= new Record();
		s.set();
		s.intput();
		s.print();

	}

}

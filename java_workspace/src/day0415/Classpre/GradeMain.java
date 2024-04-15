package day0415.Classpre;

/*
       문 2]
            Grade  클래스를 작성 하시오,
   
   세과목 점수를 입력받아 Grade 객체를 생성하고,
   성적 평균을 출력하는 프로그램을 구현하시오.
   

   출력
   국어 , 영어 ,수학 3개의 점수 입력: 90 ,88 ,96
   평균은 :
*/



import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 영어 수학 3개의 점수 입력: ");
		int kor =scanner.nextInt();
		int eng =scanner.nextInt();
		int mat=scanner.nextInt();
		
		Grade me =new Grade(kor, eng, mat);
		System.out.println("평균은" +me.avg());
	}

}

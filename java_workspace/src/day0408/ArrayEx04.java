package day0408;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{100,90,100},
				{20,25,30},
				{30,30,30},
				{40,40,40},
				{50,50,50}
				};
		
		//과목별 총점을 저장할 변수
		int korTot= 0, engTot=0 , matTot=0;
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균 ");
		System.out.println("====================");
		
		for (int i = 0; i < arr.length; i++) {// 행
			// 한행에 대한 총점 평균
			int sum =0; // 행에 대한 총점(개인)
			float avg=0.0f; //행에 대한 평균(개인)
			korTot += arr[i][0];
			engTot += arr[i][1];
			matTot += arr[i][2];
			System.out.printf("%3d" , i+1);
				for (int j = 0; j < arr[i].length; j++) {
					sum += arr[i][j];
					System.out.printf("%5d",arr[i][j]);
				}
			//평균
				avg= sum /(float)arr[i].length;
				System.out.printf("%5d %5.1f%n",sum,avg);
		}
		System.out.println("====================");
		System.out.printf("총점: %3d %4d %4d%n",korTot,engTot,matTot);
	}

}

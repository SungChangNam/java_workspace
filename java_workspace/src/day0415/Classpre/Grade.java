package day0415.Classpre;

public class Grade {
	
	private int kor ;
	private int eng ;
	private int mat ;
	

	public Grade(int kor,int eng, int mat) {
		this.kor =kor;
		this.eng= eng;
		this.mat = mat;
		
	}
	
	public double avg() {
		return(kor +eng +mat)/3;
	}
	

}

package day0412Obj.salary;


/*
 * 	접근 제한자
 * 		-멤버들은 객체 자신들만의 속성이자 특징이므로 대외적으로 공개되는 것이
 * 			결코 좋은 것 만은 아니다.
 * 			그래서 객체의 맴버들에게 접근 제한을 걸수 있는데 이를 접근 제한자라고 한다.
 * 			
 * 			public  :  모든 접근을 허용함
 * 			protected : 같은 패키지 (폴더)에 있는 객체와 상속관계의 객체들만 허용함
 * 			default  : 같은 패키지에 있는 객체만 허용함
 * 			private : 현재 객체 내에서만 허용함
 * 			
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class SalaryEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary sal = new Salary();
		sal.setPay(2000, "1");
		System.out.println(sal.getPay());
		
	}

}

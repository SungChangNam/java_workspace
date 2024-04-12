package day0412Obj.myclass;


/*
 *  생성자
 *  1. 메모리 내에 객체가 생성될때 호출되어 객채의 구조를 인식하게 하고
 *  	생성되는 멤버 변수를 초기화 하는데 목적을 둠
 *  
 *  2. 생성자명은  클래스명과  같아야 하고 , 리턴 타입(반환형)이 없음
 *  3.프로그래머가 어떠한 생성자도 정의하지 않을 경우 컴파일러가 기본생성자를
 *  	자동으로 정의해 줌(기본생성자)  : 인자가 없는 생성자
 *  	
 *  생성자의 접근 제한자의 의미
 *  	1. 생성자의 접근제한을 둘 경우 해당 객체를 생성할 수 있는 접근 권한을 가진다.
 *  	2. 클래스의 접근제한이 public 으로 정의되어 있어도 생성자가  private 로 정의
 *  		클래서 내부에서만 접근이 가능하다.
 *  	3. 만약 protected 로 정의 되는 클래스는 상속 관계의 객체들만 
 *  		생성할 수 있다.
 *  
 *  	생성자의 구성
 *  	[접근제한자] [생성자명] (자료형 인자 1 , 자료형 인자 2....) {
 *  		수행문 ;
 *  		수행문 ;
 *  		
 *  
 *  	}
 *			생성자의 특징  
 *  	1. 클래스명과 똑같다.
 *  	2. 반환형을 명시할 수 없다.
 *   	3. 클래스 내부에 생성자가 없을 때는 컴파일러가 기본생성자를 만든다.
 *   	4. 하나의 클래스에는 인자의 수가 다르거나 인자의 자료형이 다른 생성자를
 *   		여러개 정의할 수 있다.(생성자 오버로딩)
 *   	5.생성자의 첫번쨰 라인에서 this(인자) 생성자를 사용해서
 *   		다른 생성자 하나를 호출할 수 있다.
 *  
 *  	생성자 오버로딩
 *  
 * 		- 생성자의 오버로딩은 객체를 생성할 수있는 방법의 수를 제공하는 것과 같으며,
 * 			메소드의 오버로딩과 다르지 않다.
 * 		
 * 
 * */

class MyClass{
	
	private String name;
	private int age;
	
	
	public MyClass() {
		name ="none";// 생성자를 이용하여 멤버변수를 초기화
		
	}
	public MyClass(String n) {//생성자 오버로딩
		name =n;
		
		
	}
	public MyClass(int a ,String n) {
			age =a;
			name =n;
	}
	
	public MyClass(String n, int a) {
		name =n;
		age =a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	


	
}




public class MyClassEx {
	


	public static void main(String[] args) {
		
		MyClass mc1= new MyClass();
		MyClass mc2 = new MyClass("아라치");
		MyClass mc3 = new MyClass("마라치",46);
		MyClass mc4 = new MyClass(46,"오자바");
		
		
		System.out.println(mc1.getName()+ "," + mc1.getAge());
		System.out.println(mc2.getName()+ "," + mc2.getAge());
		System.out.println(mc3.getName()+ "," + mc3.getAge());
		System.out.println(mc4.getName()+ "," + mc4.getAge());
		
		

	}

}

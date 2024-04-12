package day0405;

public class StringArrEx01 {

	public static void main(String[] args) {
		
		String[] name = {"park","kim ","sung "};
		// 참조형 변수 = array String
		//모든 참조형 변수에는 객체가 메모리에 저장된 주소인 4byte의 정수 값이 저장된다.
		//참조형 변수의 크기 : 4byte
		for(int i  =0; i <name.length; i++) {
			System.out.println("name["+i+"]" +name[i]);
		}
		
		String tmp= name[2];
		System.out.println(tmp);
		name[0] ="hong";
		for(int i  =0; i <name.length; i++) {
			System.out.println("name["+i+"]" +name[i]);
		}
		System.out.println(name);
	}

}

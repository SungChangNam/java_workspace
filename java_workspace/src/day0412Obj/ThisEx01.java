package day0412Obj;

/*
 *   this 와 this() 
 *   - this 란 특정 객체 내에서 자신이 생성되었을때 주소값 변수
 *   - 객체의 주소 생성전까지는 알수없기 때문에 객체 생성 후 자신의 주소로 대치됨
 *   
 *    
 *    -this() 는 현재 객캐의 생성자를 의미함
 *    - 생성자 안에서 오버로딩 구현된 다른 생성자를 호출할떄 this() 라는 키워드로 호출함
 *      
 * */

class ThisEx {
	
	String name, idnum,tel; 
	public ThisEx() {
		this.name ="Guest";
		this.idnum ="000000-000000";
		this.tel ="010-0000-0000";
	}
	
	public ThisEx(String name) {
		this();// 다른 생성자를 의미함 (한번 다른 생성자를 호출시에 생성자 첫번째 라인한상 명시해야한다.)
	}
	
	public ThisEx(String name, String idnum) {
		this(name);
		this.idnum = idnum;
		
		
	}
	public ThisEx(String name, String idnum, String tel) {
		this(name,idnum);
		this.tel = tel;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdnum() {
		return idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}


public class ThisEx01 {

	public static void main(String[] args) {
	
		ThisEx te =new ThisEx();
		System.out.println("이름은  "+te.getName());
		System.out.println("jumin  "+te.getIdnum());
		System.out.println("tel  "+te.getTel());

	}

}

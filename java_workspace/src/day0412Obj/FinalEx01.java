package day0412Obj;

public class FinalEx01 {
	
	
	public static boolean bFlag=true;
	public static int nCount =0;
	
	public FinalEx01() {
		nCount++;
		if (nCount ==10) {
			bFlag =false;
			
		}
		
		
	}

	public static void main(String[] args) {
			while (bFlag) {
				new FinalEx01();
				System.out.println("test");
			}

	}

}

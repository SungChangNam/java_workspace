package day0405;
/*
 *  'C','A,'F','E'
 * 
 * 
 * 
 * */
public class StringArrEx02 {

	public static void main(String[] args) {
		char[]  hex = {'C','A','F','E'};//16진수;
		
		String[] binary = {
				"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111",
		};
		String str="";
		
		for (int i = 0; i < hex.length; i++) { //~9
			if (hex[i] >='0' && hex[i] <= '9') {
				str += binary[hex[i]-'0']; // '8' - '8' =8
			}else {// A ~ F 
				str += binary[hex[i]-'A'+10]; //C - A = 2
			}
			
		}
//		str +=binary[hex[0]-'A'+10] => hex[0] 은   'C'
//		str +=binary['C' -'A' +10] 은   'C'  'A' -> 67 -65 =2
//		str +=binary[2+10]  -> binary[12]
//		str += "1100"
		
		
		System.out.println("hex : " +new String(hex));
	}

}

package day0416class.dictionaryEx;

public class Dictionary {
		private static String [] kor={"사랑","아기","돈","미래","희망"};
		private static String [] eng={"Love","Baby","Money","future","Hope"};
		public static String kor2Eng(String word) {
			for (int i = 0; i < kor.length; i++) {
				if (word.equals(kor[i])) {
					if (i%2 ==0) 
						System.out.print(word +"은");
					else 
						System.out.print(word+ "는");
					return eng[i];
				}
			}
			return "false";
		}
		
		
}

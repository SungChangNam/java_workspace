package day0405;

import day0401.forEx01;

public class StringArrayEx01 {
	public static void name() {
	

	String[] name = {"park","kim ","sung "};
	
	for(int i  =0; i <name.length; i++) {
		System.out.println("name["+i+"]" +name[i]);
	}
	String tmp= name[2];
	System.out.println(tmp);
	name[0] ="hong";
	for(int i  =0; i <name.length; i++) {
		System.out.println("name["+i+"]" +name[i]);
	}
}
}
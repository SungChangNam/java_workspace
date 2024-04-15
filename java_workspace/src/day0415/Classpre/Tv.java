package day0415.Classpre;

import java.time.Year;

public class Tv {
	
	
	private String name;
	private int year;
	private int inch;

	
	
	  public Tv(String name, int year, int inch) {
	        this.name = name;
	        this.year = year;
	        this.inch = inch;
	       
	    }



	public  void show () {

		  System.out.println(name+"에서 만든 "+ year +" 년형 "+inch+" 인치 TV ");
		  
	  }


	
 
}

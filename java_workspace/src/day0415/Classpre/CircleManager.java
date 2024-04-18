package day0415.Classpre;

import java.util.Scanner;

public class CircleManager {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("x,y,radiuse:");

 
      

    
        Circle[] c = new Circle[3];

        
        for (int i = 0; i < c.length; i++) {
            System.out.printf("%d (x, y, radius): ", i + 1);
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();

            c[i] = new Circle(x, y, radius);

        }
        
    	int  big = 0;
    	for (int i = 0; i < c.length; i++) {
			if (c[big].getArea() < c[i].getArea()) {
				big =i;
			}
			
		}
        
        
        
        
        System.out.print("가장 면적이 큰 원은? :");
//        for ( int i =0; i<c.length; i++) 
           c[big].show();
		
        

 
	}

}

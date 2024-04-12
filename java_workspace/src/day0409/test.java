package day0409;

public class test {

	public static void main(String[] args) {
		
		int cnt_i = 4;
		int cnt_j = 5;
		int[][] arr = new int[cnt_i][cnt_j];
		int num = 1;

		for (int i = 0; i < arr.length; i++) { // Loop through rows

		  if (i % 2 == 0) {  // Even rows (0-based indexing)
		    for (int j = 0; j < arr[i].length; j++) {  // Left to right
		      arr[i][j] = num;
		      num -= 4;  // Decrement by 4
		    }
		  } else {  // Odd rows
		    for (int j = arr[i].length - 1; j >= 0; j--) {  // Right to left
		      
		    }
		  }
		}

		for (int i = 0; i < arr.length; i++) { // Print the array
		  for (int j = 0; j < arr[i].length; j++) {
		    System.out.printf("%3d\t", arr[i][j]);
		  }
		  System.out.println();
		}

	    

        
	}

}

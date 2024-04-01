package day0401;


// 1~ 10 까지 반복 수행하는 동안 
// 짝, 수 , 홀수 ,제곱, 역순(11- i) , i%3, i/3
// 
public class forEx03 {

    public static void main(String[] args) {

        System.out.printf("i\t  2*i\t  2*i-1\t   i*i\t  11-i\t   i%%3\t  i/3\t\n");
        System.out.println("---------------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d\t  %d\t  %d\t   %d\t  %d\t   %d\t   %d\n",
                    i, 2 * i, 2 * i - 1, i * i, 11 - i, i % 3, i / 3); // Corrected calculation and formatting
        }
    }
}

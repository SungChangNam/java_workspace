package testQ1;

import java.util.Scanner;

public class Q2money {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int won[] = new int[8];
        int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
        System.out.print("금액을 입력하여라 : ");
        int money = scanner.nextInt();

        for (int i = 0; i < 8; i++) {
            won[i] = money / unit[i];
            money = money % unit[i];
            System.out.println(unit[i] + "원 권 " + won[i] + "개");
        }
    }
}

package day0402;

import java.util.Scanner;

public class DowhileEx03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subject;

        do {
            System.out.println("과목 점수 (0~100) : ");
            subject = scanner.nextInt();

            // Improved error message
            if (subject < 0 || subject > 100) {
                System.out.println("유효한 점수 범위는 0부터 100까지입니다. 다시 입력하세요.");
            }
        } while (subject < 0 || subject > 100);

        // Process valid subject score here (outside the loop)
        System.out.println("입력된 점수는 " + subject + "입니다.");
    }
}

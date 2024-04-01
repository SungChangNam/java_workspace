package day0328;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 금액 입력받기
        System.out.print("출력 금액 입력: ");
        int money = sc.nextInt();

        // 각 화폐 단위별 개수 변수 초기화
		int oman =0;
		int man =0;
		int  cheon = 0;
		int obeak = 0;
		int beak = 0;
		int oship = 0;
		int ship = 0;
		int ilone= 0;
		

        // 각 화폐 단위별 계산
        if (money >= 50000) {
        	oman = money / 50000;
            money %= 50000;
        }

        if (money >= 10000) {
        	man = money / 10000;
            money %= 10000;
        }

        if (money >= 1000) {
        	cheon = money / 1000;
            money %= 1000;
        }

        if (money >= 500) {
        	obeak = money / 500;
            money %= 500;
        }

        if (money >= 100) {
        	beak = money / 100;
            money %= 100;
        }

        if (money >= 50) {
        	oship = money / 50;
            money %= 50;
        }

        if (money >= 10) {
        	ship = money / 10;
            money %= 10;
        }

        if (money >= 1) {
        	ilone = money;
        }

        // 결과 출력
        System.out.println("오만원권 " + oman + "매");
        System.out.println("만원권 " +man + "매");
        System.out.println("천원권 " + cheon + "매");
        System.out.println("오백원짜리 동전 " + obeak + "개");
        System.out.println("백원짜리 동전 " + beak + "개");
        System.out.println("오십원짜리 동전 " + oship + "개");
        System.out.println("십원짜리 동전 " + ship + "개");
        System.out.println("일원짜리 동전 " + ilone + "개");
    }
}

package day0415.Classpre;

import java.util.Scanner;

public class Day {
    private String work;

    public void setWork(String work) { // Use camelCase for method names
        this.work = work;
    }

    public void show() {
        if (work == null) {
            System.out.println("할 일이 없습니다. 오늘 하루 푹 쉬십시오.");
        } else {
            System.out.println(work + "입니다.");
        }
    }
}
/*
public class MonthSchedule {

    private Day[] days;
    private int lastDay;
    private final Scanner scanner = new Scanner(System.in); // Single Scanner object

    public MonthSchedule(int lastDay) {
        this.lastDay = lastDay;
        this.days = new Day[lastDay];

        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
    }

    public void input() {
        System.out.print("날짜(1~" + lastDay + "): ");
        int day = scanner.nextInt();
        day--; // Adjust for zero-based indexing

        if (day < 0 || day > lastDay) {
            System.out.println("날짜를 잘못 입력하셨습니다.");
            return;
        }

        System.out.print("할일(빈칸 없이 입력): ");
        String work = scanner.next();

        // Explicitly reference the 'days' array and use the 'day' index to access the Day object
        days[day].setWork(work);
    }

    public void view() {
        System.out.print("날짜(1~" + lastDay + "): ");
        int day = scanner.nextInt();
        day--; // Adjust for zero-based indexing

        if (day < 0 || day > lastDay) {
            System.out.println("날짜를 잘못 입력하셨습니다.");
            return;
        }

        System.out.print((day + 1) + "일의 할일은: ");
        days[day].show(); // Call show() to display the schedule
    }

    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리프로그램");
        while (true) {
            System.out.print("할일(입력 : 1, 보기 : 2, 종료: 3): ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다.");
                    break;
            }
            System.out.println();
        }


    }


}

 */
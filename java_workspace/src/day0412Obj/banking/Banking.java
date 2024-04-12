package day0412Obj.banking;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Banking {

	public static void main(String[] args) throws IOException {
		Account na = new Account("가길동");
		BufferedReader br = 
				new BufferedReader( new InputStreamReader(System.in));
		String strWokr;
		do {
			System.out.println("\n 업무를 선택하세요.   ");
			System.out.println("==================");
			System.out.println("입         급 ========= >1 ");
			System.out.println("출         급 ========= >2 ");
			System.out.println("잔액 조회 ========= >3 ");
			System.out.println("종         료 =========> 0 ");
			System.out.println("==================");
			System.out.print("업무를 선택하세요. :");
			strWokr = br.readLine();
			
			
			
			int switchInt =0;
			if (strWokr != null) // 업무가 선택 된 경우
				switchInt = Integer.parseInt(strWokr);
			
			else {// 업무가 없는 경우
				System.out.println("업무선택을 하지 않으셨습니다.");
				System.exit(0);
			}
				
			switch (switchInt) {
			case 0:
				System.out.println("모든 업무를 종료합니다.");
				break;
			case 1:
				System.out.println("\n ==================");
				System.out.print("입금할 금액 입력 :");
				String strdepositIn= br.readLine();
				long deposiLong = Long.parseLong(strdepositIn);
				na.deposit(deposiLong);
				break;
			case 2:
				System.out.println("\n ==================");
				System.out.print("출금할 금액 입력 :");
				String strwithdrwaLong= br.readLine();
				long withdrawLong = Long.parseLong(strwithdrwaLong);
				na.withdraw(withdrawLong);
				break;
			case 3:
				System.out.println(na.getName() + "님의 작액은 :"+ na.getBalance());
				break;
			default:
					System.out.println("업무 선택은 0 ~ 3번 사이의 숫자를 입력하셔야 합니다.");
					break;
			}
			
			
		} while (!strWokr.equals("0"));


	}

}

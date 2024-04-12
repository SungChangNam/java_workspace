package day0412Obj.banking;

public class Account {

	private String name;
	private long balance;
	
	public Account() {}
	public Account(String name) {this.name= name;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public void deposit(long amount) {// 입금 기능
		balance += amount;
	}
	
	public void withdraw(long amount) {
		if (balance <amount ) {
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
		}else {
			balance -= amount;
		}
		
	}
}

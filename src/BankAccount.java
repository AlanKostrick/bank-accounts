
public class BankAccount {

	private String type;
	private double balance;
	long accountNum;

	public BankAccount(long accountNum, String type, double balance) {
		this.accountNum = accountNum;
		this.type = type;
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public Long getAccoutNum() {
		return accountNum;
	}

	public double deposit(double amount) {
		balance += amount;
		return balance;

	}

	public double withdrawal(double amount) {
		balance -= amount;
		return balance;
	}

}

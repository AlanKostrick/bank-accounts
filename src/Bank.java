import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

	Map<Long, BankAccount> accounts = new HashMap<Long, BankAccount>();

	public Collection<BankAccount> accounts() {
		return accounts.values();
	}

	public void add(BankAccount account) {
		accounts.put(account.accountNum, account);
	}

	public BankAccount getAccountNum(Long accountNum) {
		return accounts.get(accountNum);
	}
	
	public BankAccount closeAccount(Long accountNum)
	{
		return accounts.remove(accountNum);
	}

}

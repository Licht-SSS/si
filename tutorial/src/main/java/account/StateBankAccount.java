package account;

/**
 * StateBank口座
 * 
 * @author onesword0618
 *
 */
public class StateBankAccount implements IAccount {

	double balance;

	// デフォルトコンストラクタ
	// コンストラクタが未作成だとコンパイル時に付与される

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;

	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;

	}

}

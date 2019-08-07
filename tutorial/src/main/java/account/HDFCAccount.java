package account;

/**
 * HDF口座
 * 
 * @author onesword0618
 *
 */
public class HDFCAccount implements IAccount {

	double deposits;
	double withdrawals;

	// デフォルトコンストラクタ
	// コンストラクタが未作成だとコンパイル時に付与される

	@Override
	public double getBalance() {
		return deposits - withdrawals;
	}

	@Override
	public void deposit(double amount) {
		deposits += amount;

	}

	@Override
	public void withdraw(double amount) {
		withdrawals += amount;

	}

}

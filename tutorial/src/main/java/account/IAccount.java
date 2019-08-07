package account;

/**
 * 口座を取り扱うインターフェース
 * 
 * @author onesword0618
 *
 */
public interface IAccount {

	/**
	 * 残高
	 * 
	 * @return
	 */
	double getBalance();

	/**
	 * 預金
	 * 
	 * @param amount
	 */
	void deposit(double amount);

	/**
	 * 引き出す
	 * 
	 * @param amount
	 */
	void withdraw(double amount);

}

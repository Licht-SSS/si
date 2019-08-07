package account;

public class TestAccount {

	public static void main(String s[]) {

		IAccount account = new HDFCAccount();

		System.out.println("Transacting using HDFC Account");
		transactOnAccount(account);

		account = new StateBankAccount();

		System.out.println("Transacting using State Bank Account");
		transactOnAccount(account);
	}

	public static void transactOnAccount(IAccount account) {
		System.out.println("------------------------------");
		account.deposit(10000.0);
		printBalance("depositing 10,000.0", account);
		account.withdraw(2500.0);
		printBalance("withdrawing 2,500.0", account);
		account.withdraw(4100.0);
		printBalance("withdrawing 4,100.0", account);
		account.deposit(5000.0);
		printBalance("depositing 5,000.0", account);
		System.out.println("------------------------------");
	}

	public static void printBalance(String message, IAccount account) {
		System.out.println("The balance after " + message + " is " + account.getBalance() + ".");
	}

}

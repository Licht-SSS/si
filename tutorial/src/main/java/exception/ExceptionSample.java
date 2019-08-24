package exception;

/**
 * 例外処理のサンプルクラス
 * 
 * このクラスでは、例外処理のいくつかのサンプルを確認することができます。
 * 
 * @author onesword0618
 *
 */
public class ExceptionSample {

	/**
	 * 業務では呼び出し元は画面が多いですがコンソール上で確認を行います
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// 例外処理を引き起こす処理
			for (int i = 0; i <= 5; i++) {
				int a = getNum(i);
				int b = 5;
				// コンソール上で確認を行う
				System.out.print(a + " / " + b + " = ");
				System.out.println(calc(a, b));
			}
		} catch (ArithmeticException e) {
			System.out.println();
			System.out.println("0による除算処理で失敗");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外を取得しようとして失敗");
		} finally {
			System.out.println("終了");
		}
	}

	// 算術例外を引き起こしている
	public static int calc(int a, int b) throws ArithmeticException {
		return a / b;
	}

	// 範囲例外を引き起こしている
	public static int getNum(int index) throws ArrayIndexOutOfBoundsException {
		int[] num = { 1, 2, 3, 4 };
		return num[index];
	}

}

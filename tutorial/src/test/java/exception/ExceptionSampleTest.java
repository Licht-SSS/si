package exception;

import org.junit.Test;

public class ExceptionSampleTest {

	@Test(expected = ArithmeticException.class)
	public void 算術計算で失敗していることの確認処理() {
		ExceptionSample.calc(1, 0);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void 範囲例外で失敗していることの確認処理() {
		ExceptionSample.getNum(5);
	}

}

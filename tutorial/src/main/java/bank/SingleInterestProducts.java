package bank;

/**
 * 単利商品を取り扱うクラス
 * 
 * @author onesword0618
 *
 */
public class SingleInterestProducts implements IFinancialProducts {

	// 元金
	int principal;
	// 商品価格
	int price = principal;

	/**
	 * コンストラクタ
	 * 
	 * @param principal
	 */
	public SingleInterestProducts(int principal) {

		this.principal = principal;
		this.price = principal;
	}

	@Override
	public void passedCalcAMonth() {
		price = (int) (price + principal * 0.1);
		System.out.println("現在の商品価格：" + price);
	}
}
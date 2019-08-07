package bank;

/**
 * 複利商品を取り扱うクラス
 * 
 * @author onesword0618
 *
 */
public class ComplexInterestProducts implements IFinancialProducts {

	// 元金
	int principal;
	// 商品価格
	int price = principal;

	/**
	 * コンストラクタ
	 * 
	 * @param principal
	 */
	public ComplexInterestProducts(int principal) {

		this.principal = principal;
		this.price = principal;
	}

	@Override
	public void passedCalcAMonth() {
		price = (int) (price + price * 0.1);
		System.out.println("現在の商品価格：" + price);
	}
}
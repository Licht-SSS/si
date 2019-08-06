package shop;

/**
 * マンドリンクラス<br>
 * 
 * <p>
 * 在庫にあるマンドリンを表現しているクラス
 * </p>
 * 
 * @author onesword0618
 *
 */
public class Mandolin extends Instrument {

	/**
	 * マンドリン仕様
	 */
	private MandolinSpec spec;

	/**
	 * コンストラクタ<br>
	 * 
	 * <p>
	 * 下記のパラメータを引数にしてマンドリンクラスから、マンドリンオブジェクトを生成する.
	 * </p>
	 * 
	 * @param serialNumber シリアル番号
	 * @param price        値段
	 * @param spec         仕様
	 */
	public Mandolin(String serialNumber, double price, MandolinSpec spec) {

		// 継承先の呼び出し
		super(serialNumber, price, spec);
	}

	/**
	 * オブジェクトが保持しているギター仕様を提供する.
	 */
	@Override
	public MandolinSpec getSpec() {
		return spec;
	}

}

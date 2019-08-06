package shop;

/**
 * ギタークラス<br>
 * 
 * <p>
 * 在庫にあるギターを表現しているクラス
 * ギターの特徴は、シリアル番号、価格、製造者、モデル、種別（アコースティックまたはエレキ）、ギターに使用する木材を定義した.
 * </p>
 * 
 * @author onesword0618
 *
 */
public class Guitar {

	/**
	 * シリアル番号
	 */
	private String serialNumber;

	/**
	 * 価格
	 */
	private double price;

	/**
	 * ギター仕様
	 */
	private GuitarSpec spec;

	/**
	 * コンストラクタ<br>
	 * 
	 * <p>
	 * 下記のパラメータを引数にしてギタークラスから、ギターオブジェクトを生成する.<br>
	 * </p>
	 * 
	 * @param serialNumber シリアル番号
	 * @param price        値段
	 * @param spec         ギター仕様
	 */
	public Guitar(String serialNumber, double price, GuitarSpec spec) {

		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	/**
	 * オブジェクトが保持しているシリアル番号を提供する.<br>
	 * 
	 * @return 保持しているシリアル番号
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * オブジェクトが保持している価格を提供する.<br>
	 * 
	 * @return 保持している価格
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * オブジェクトが保持している価格に引数の値を設定する.<br>
	 * 
	 * @param newPrice 新しく設定する価格
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	/**
	 * オブジェクトが保持しているギター仕様オブジェクトを提供する.<br>
	 * 
	 * @return 保持しているギター仕様オブジェクト
	 */
	public GuitarSpec getSpec() {
		return spec;
	}
}

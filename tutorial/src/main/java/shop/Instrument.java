package shop;

/**
 * 楽器クラス<br>
 * 
 * <p>
 * 楽器の共通定義.<br>
 * 楽器についてのクラスを作成する際に、このクラスを継承すること.
 * <p>
 * 
 * @author onesword0618
 *
 */
public abstract class Instrument {

	/**
	 * シリアル番号
	 */
	private String serialNumber;

	/**
	 * 価格
	 */
	private double price;

	/**
	 * 仕様
	 */
	private InstrumentSpec spec;

	/**
	 * コンストラクタ<br>
	 * 
	 * <p>
	 * 下記のパラメータを引数にして楽器クラスから、楽器オブジェクトを生成する.
	 * </p>
	 * 
	 * @param serialNumber シリアル番号
	 * @param price        価格
	 * @param spec         仕様
	 */
	public Instrument(String serialNumber, double price, InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	/**
	 * オブジェクトが保持しているシリアル番号を提供する
	 * 
	 * @return 保持しているシリアル番号
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * オブジェクトが保持している価格を提供する
	 * 
	 * @return 保持している価格
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * オブジェクトが保持している価格に引数の値を設定する
	 * 
	 * @param newPrice 再設定する価格
	 */
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	/**
	 * オブジェクトが保持している仕様を提供する
	 * 
	 * @return オブジェクトが保持している仕様
	 */
	public InstrumentSpec getSpec() {
		return spec;
	}
}

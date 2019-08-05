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
	 * 製造者
	 */
	private String builder;

	/**
	 * モデル
	 */
	private String model;

	/**
	 * 種別
	 */
	private String type;

	/**
	 * 背面で利用する木材
	 */
	private String backWood;

	/**
	 * 前面で利用する木材
	 */
	private String topWood;

	/**
	 * 価格
	 */
	private double price;

	/**
	 * コンストラクタ<br>
	 * 
	 * <p>
	 * 下記のパラメータを引数にしてギタークラスから、ギターオブジェクトを生成する.<br>
	 * </p>
	 * 
	 * @param serialNumber シリアル番号
	 * @param price        値段
	 * @param builder      製造者
	 * @param model        モデル
	 * @param type         種別
	 * @param backWood     背面木材
	 * @param topWood      前面木材
	 */
	public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {

		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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
	 * オブジェクトが保持している製造者を提供する.<br>
	 * 
	 * @return 保持している製造者
	 */
	public String getBuilder() {
		return builder;
	}

	/**
	 * オブジェクトが保持しているモデルを提供する.<br>
	 * 
	 * @return 保持しているモデル
	 */
	public String getModel() {
		return model;
	}

	/**
	 * オブジェクトが保持している種別を提供する.<br>
	 * 
	 * @return 保持している種別
	 */
	public String getType() {
		return type;
	}

	/**
	 * オブジェクトが保持している背面木材を提供する.<br>
	 * 
	 * @return 保持している背面木材
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * オブジェクトが保持している前面木材を提供する.<br>
	 * 
	 * @return 保持している前面木材
	 */
	public String getTopWood() {
		return topWood;
	}
}

package shop;

/**
 * ギター仕様<br>
 * 
 * @author onesword0618
 *
 */
public class GuitarSpec {

	/**
	 * 製造者
	 */
	private Builder builder;

	/**
	 * モデル
	 */
	private String model;

	/**
	 * 種別
	 */
	private Type type;

	/**
	 * 背面木材
	 */
	private Wood backWood;

	/**
	 * 前面木材
	 */
	private Wood topWood;

	/**
	 * コンストラクタ<br>
	 * ギター仕様オブジェクトを生成する際に渡された引数をもとにオンスタンスを生成する<br>
	 * 
	 * @param builder  製造者
	 * @param model    モデル
	 * @param type     種別
	 * @param backWood 背面木材
	 * @param topWood  前面木材
	 */
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	/**
	 * オブジェクトが保持している製造者を提供する
	 * 
	 * @return オブジェクトが保持している製造者
	 */
	public Builder getBuilder() {
		return builder;
	}

	/**
	 * オブジェクトが保持しているモデルを提供する
	 * 
	 * @return オブジェクトが保持しているモデル
	 */
	public String getModel() {
		return model;
	}

	/**
	 * オブジェクトが保持している種別を提供する
	 * 
	 * @return オブジェクトが保持している種別
	 */
	public Type getType() {
		return type;
	}

	/**
	 * オブジェクトが保持している背面木材を提供する
	 * 
	 * @return オブジェクトが保持している背面木材
	 */
	public Wood getBackWood() {
		return backWood;
	}

	/**
	 * オブジェクトが保持している前面木材を提供する
	 * 
	 * @return オブジェクトが保持している前面木材
	 */
	public Wood getTopWood() {
		return topWood;
	}

}

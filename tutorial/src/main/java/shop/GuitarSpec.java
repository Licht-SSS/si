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
	 * 弦の数
	 */
	private int numStrings;

	/**
	 * コンストラクタ<br>
	 * ギター仕様オブジェクトを生成する際に渡された引数をもとにオンスタンスを生成する<br>
	 * 
	 * @param builder    製造者
	 * @param model      モデル
	 * @param type       種別
	 * @param backWood   背面木材
	 * @param topWood    前面木材
	 * @param numStrings 弦の数
	 */
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
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

	/**
	 * オブジェクトが保持している弦の数を提供する
	 * 
	 * @return オブジェクトが保持している弦の数
	 */
	public int getNumStrings() {
		return numStrings;
	}

	/**
	 * 指定した条件が合致するか<br>
	 * 
	 * @param otherSpec 指定された仕様
	 * @return 合致した場合、true それ以外はfalse
	 */
	public boolean matches(GuitarSpec otherSpec) {

		// 製造者が一致しているか
		if (builder != otherSpec.builder) {
			return false;
		}

		// モデルが一致しているか
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel()))) {
			return false;
		}

		// 種別が一致しているか
		if (type != otherSpec.type) {
			return false;
		}

		// 弦の数が一致しているか
		if (numStrings != otherSpec.numStrings) {
			return false;
		}

		// 背面木材が一致しているか
		if (backWood != otherSpec.backWood) {
			return false;
		}

		// 前面木材が一致しているか
		if (topWood != otherSpec.topWood) {
			return false;
		}
		return true;
	}
}

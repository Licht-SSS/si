package shop;

/**
 * 楽器仕様クラス<br>
 * 
 * <p>
 * 楽器仕様の共通定義.<br>
 * 楽器仕様についてのクラスを作成する際に、このクラスを継承すること.
 * <p>
 * 
 * @author onesword0618
 *
 */
public abstract class InstrumentSpec {

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
	 * 
	 * <p>
	 * 下記のパラメータを引数にして楽器仕様クラスから、楽器仕様オブジェクトを生成する.
	 * </p>
	 * 
	 * @param builder  製造者
	 * @param model    モデル
	 * @param type     種別
	 * @param backWood 背面木材
	 * @param topWood  前面木材
	 */
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	/**
	 * オブジェクトが保持している製造者を提供する.
	 * 
	 * @return オブジェクトが保持している製造者
	 */
	public Builder getBuilder() {
		return builder;
	}

	/**
	 * オブジェクトが保持しているモデルを提供する.
	 * 
	 * @return オブジェクトが保持しているモデル
	 */
	public String getModel() {
		return model;
	}

	/**
	 * オブジェクトが保持している種別を提供する.
	 * 
	 * @return オブジェクトが保持している種別
	 */
	public Type getType() {
		return type;
	}

	/**
	 * オブジェクトが保持している背面木材を提供する.
	 * 
	 * @return オブジェクトが保持している背面木材
	 */
	public Wood getBackWood() {
		return backWood;
	}

	/**
	 * オブジェクトが保持している前面木材を提供する.
	 * 
	 * @return オブジェクトが保持している前面木材
	 */
	public Wood getTopWood() {
		return topWood;
	}

	/**
	 * 指定した条件の仕様に合致しているか.
	 * 
	 * @param otherSpec 指定された仕様
	 * @return 合致したらture. それ以外はfalse
	 */
	public boolean matches(InstrumentSpec otherSpec) {
		if (builder != otherSpec.builder)
			return false;
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
			return false;
		if (type != otherSpec.type)
			return false;
		if (backWood != otherSpec.backWood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;
		return true;
	}
}

package shop;

/**
 * ギター仕様<br>
 * 
 * @author onesword0618
 *
 */
public class GuitarSpec extends InstrumentSpec {

	/**
	 * 弦の数
	 */
	private int numStrings;

	/**
	 * コンストラクタ<br>
	 * ギター仕様オブジェクトを生成する際に渡された引数をもとにインスタンスを生成する<br>
	 * 
	 * @param builder    製造者
	 * @param model      モデル
	 * @param type       種別
	 * @param backWood   背面木材
	 * @param topWood    前面木材
	 * @param numStrings 弦の数
	 */
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {

		// 継承先の呼び出し
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	/**
	 * オブジェクトが保持している弦の数を提供する.
	 * 
	 * @return オブジェクトが保持している弦の数
	 */
	public int getNumStrings() {
		return numStrings;
	}

	/**
	 * 指定した条件が合致するか.
	 * 
	 * @param otherSpec 指定された仕様
	 * @return 合致した場合、true それ以外はfalse
	 */
	@Override
	public boolean matches(InstrumentSpec otherSpec) {

		// 仕様が一致しているか
		if (!super.matches(otherSpec)) {
			return false;
		}

		// オブジェクトの型が同じかどうか
		if (!(otherSpec instanceof GuitarSpec)) {
			return false;
		}

		// ダウンキャスト 親クラスから子クラスへ
		GuitarSpec spec = (GuitarSpec) otherSpec;

		// 弦の数が一致しているか
		if (numStrings != spec.numStrings) {
			return false;
		}
		return true;
	}
}

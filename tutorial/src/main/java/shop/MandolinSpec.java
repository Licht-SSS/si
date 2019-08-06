package shop;

/**
 * マンドリン仕様<br>
 * 
 * @author onesword0618
 *
 */
public class MandolinSpec extends InstrumentSpec {

	/**
	 * スタイル
	 */
	private Style style;

	/**
	 * コンストラクタ<br>
	 * マンドリン仕様オブジェクトを生成する際に渡された引数をもとにインスタンスを生成する<br>
	 * 
	 * @param builder  製造者
	 * @param model    モデル
	 * @param type     種別
	 * @param backWood 背面木材
	 * @param topWood  前面木材
	 * @param style    スタイル
	 */
	public MandolinSpec(Builder builder, String model, Type type, Style style, Wood backWood, Wood topWood) {

		// 継承先の呼び出し
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}

	/**
	 * オブジェクトが保持しているスタイルを提供する.
	 * 
	 * @return オブジェクトが保持しているスタイル
	 */
	public Style getStyle() {
		return style;
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
		if (!(otherSpec instanceof MandolinSpec)) {
			return false;
		}

		// ダウンキャスト 親クラスから子クラスへ
		MandolinSpec spec = (MandolinSpec) otherSpec;

		// マンドリンの型が一致しているかどうか
		if (!style.equals(spec.style)) {
			return false;
		}
		return true;
	}
}

package shop;

import java.util.HashMap;
import java.util.Map;

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
public class InstrumentSpec {

	/**
	 * プロパティマップ
	 */
	private Map<String, String> properties;

	/**
	 * コンストラクタ<br>
	 * 
	 * <p>
	 * 下記のパラメータを引数にして楽器仕様クラスから、楽器仕様オブジェクトを生成する.
	 * </p>
	 * 
	 * @param prooerties プロパティ
	 */
	public InstrumentSpec(Map<String, String> prooerties) {

		if (prooerties == null) {
			this.properties = new HashMap<>();
		} else {
			this.properties = new HashMap<>(prooerties);
		}

	}

	/**
	 * オブジェクトが保持しているプロパティに引数の値を渡した結果を提供する.
	 * 
	 * @param propertyName プロパティ名
	 * @return プロパティマップの値
	 */
	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}

	/**
	 * オブジェクトが保持しているプロパティを提供する.
	 * 
	 * @return 保持しているプロパティ
	 */
	public Map<String, String> getProperties() {
		return properties;
	}

	/**
	 * 指定した条件の仕様に合致しているか.
	 * 
	 * @param otherSpec 指定された仕様
	 * @return 合致したらture. それ以外はfalse
	 */
	public boolean matches(InstrumentSpec otherSpec) {

		for (String propertyName : otherSpec.getProperties().keySet()) {

			if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
				return false;
			}
		}
		return true;
	}
}

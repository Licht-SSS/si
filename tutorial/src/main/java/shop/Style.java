package shop;

/**
 * スタイルを扱うEnumクラス.
 * 
 * <p>
 * スタイルを提供する.
 * </p>
 * 
 * @author onesword0618
 *
 */
public enum Style {

	A("A style"), F("F style"), ANY("Unspecified");

	/**
	 * 名称を格納する
	 */
	private final String name;

	/**
	 * 名称を設定する
	 */
	private Style(String name) {
		this.name = name;
	}

	/**
	 * 保持している名称を提供する
	 * 
	 * @return 保持している名称を提供する
	 */
	public String getName() {
		return name;
	}
}

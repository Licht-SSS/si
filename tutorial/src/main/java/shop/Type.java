package shop;

/**
 * 種別を扱うEnumクラス.
 * 
 * <p>
 * 種別を提供する.
 * </p>
 * 
 * @author onesword0618
 *
 */
public enum Type {

	ACOUSTIC("acoustic"), ELECTRIC("electric"), ANY("unspecified");

	/**
	 * 名称を格納する
	 */
	private final String name;

	/**
	 * 名称を設定する
	 */
	private Type(String name) {
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

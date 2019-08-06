package shop;

/**
 * 製造者を扱うEnumクラス.
 * 
 * <p>
 * 製造者を提供する.
 * </p>
 * 
 * @author onesword0618
 *
 */
public enum Builder {

	FENDER("Fender"), MARTIN("Martin"), GIBSON("Gibson"), COLLINGS("Collings"), OLSON("Olson"), RYAN("Ryan"),
	PRS("PRS"), ANY("Unspecified");

	/**
	 * 名称を格納する
	 */
	private final String name;

	/**
	 * 名称を設定する
	 */
	private Builder(String name) {
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

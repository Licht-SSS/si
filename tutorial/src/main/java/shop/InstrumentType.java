package shop;

/**
 * 楽器を扱うEnumクラス.
 * 
 * <p>
 * 楽器を提供する.
 * </p>
 * 
 * @author onesword0618
 *
 */
public enum InstrumentType {

	GUITAR("Guitar"), BANJO("Banjo"), DOBRO("Dobro"), FIDDLE("Fiddle"), BASS("Bass"), MANDOLIN("Mandolin"),
	ANY("unspecified");

	/**
	 * 名称を格納する
	 */
	private final String name;

	/**
	 * 名称を設定する
	 */
	private InstrumentType(String name) {
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

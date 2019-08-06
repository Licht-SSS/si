package shop;

/**
 * 木材を扱うEnumクラス.
 * 
 * <p>
 * 木材を提供する.
 * </p>
 * 
 * @author onesword0618
 *
 */
public enum Wood {

	INDIAN_ROSEWOOD("Indian Rosewood"), BRAZILIAN_ROSEWOOD("Brazilian Rosewood"), MAHOGANY("Mahogany"), MAPLE("Maple"),
	COCOBOLO("Cocobolo"), CEDAR("Cedar"), ADIRONDACK("Adirondack"), ALDER("Alder"), SITKA("Sitka"), ANY("Unspecified");

	/**
	 * 名称を格納する
	 */
	private final String name;

	/**
	 * 名称を設定する
	 */
	private Wood(String name) {
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

package tutorial;

import java.util.ArrayList;

/**
 * 軍艦のクラス<br>
 * 
 * ゲーム上、軍艦として必要な機能をここに記載する。
 * 
 * @author onesword0618
 *
 */
public class Ship {

	// 設定値を保持する
	private ArrayList<String> locationCells;
	private String name;

	/**
	 * 軍艦の設定位置を保持する
	 * 
	 * @param loc セル位置
	 */
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}

	/**
	 * 軍艦の名前を保持する
	 * 
	 * @param shipName
	 */
	public void setName(String shipName) {

		name = shipName;
	}

	/**
	 * 軍艦の位置に推測した値が入っているかを確認する
	 * 
	 * @param userInput 入力値
	 * @return 入力値がセル位置に当たっているかの結果
	 */
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
				System.out.println("Oh Your sunk " + name + " ＼(^o^)／ ");
			} else {
				result = "hit";
			}
		}
		return result;
	}
}

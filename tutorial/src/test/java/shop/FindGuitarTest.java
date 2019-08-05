package shop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * ギター検索用のテストクラス
 * 
 * @author onesword0618
 *
 */
public class FindGuitarTest {

	/**
	 * ギターの検索が行えるかを検証する<br>
	 * 
	 * <p>
	 * 実行するとわかるが、必ず失敗するので、慌てないように。
	 * </p>
	 * 
	 */
	@Test
	public void ギター検索を行う() {

		// ギターの在庫を設定する
		Inventory inventory = new Inventory();
		initialzeInventory(inventory);

		// 顧客の検索条件を設定
		Guitar whatCustemerLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");

		// 顧客の検索条件に合致するギターを在庫から探す
		Guitar guitar = inventory.search(whatCustemerLikes);

		// 実際の値を設定
		String actual = null;

		// 期待しているのは下記の検索結果
		String expected = "You might like this" + " " + "Fender" + " " + "Stratocastor" + " " + "electric" + " "
				+ "Alder" + " " + "Alder" + " " + 150000.0;

		// 検索結果がnullでない場合
		if (guitar != null) {

			// 実際の値
			actual = "You might like this" + " " + guitar.getBuilder() + " " + guitar.getModel() + " "
					+ guitar.getType() + " " + guitar.getBackWood() + " " + guitar.getTopWood() + " "
					+ guitar.getPrice();

			// コンソールに出力
			System.out.println(actual);
		} else {

			// コンソールに出力
			System.out.println("Sorry, we have nothing for you.");
		}

		// Verify -検証
		// 期待値と異なっていた場合はエラーになる
		assertThat(actual, is(expected));
	}

	/**
	 * 倉庫にギターを設定する
	 * 
	 * @param inventory
	 */
	private static void initialzeInventory(Inventory inventory) {

		// 在庫を設定する
		inventory.addGuitar("V95693", 150000, "Fender", "Stratocastor", "electric", "Alder", "Alder");
	}

}

package shop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class FindGuitarTest {

	/**
	 * ギターの検索が行えるかを検証する<br>
	 * 
	 */
	@Test
	public void ギター検索を行う() {

		// ギターの在庫を設定する
		Inventory inventory = new Inventory();
		initialzeInventory(inventory);

		// 顧客の検索条件を設定
		Guitar whatCustemerLikes = new Guitar("", 0, Builder.FENDER.getName(), "Stratocastor", Type.ELECTRIC.getName(),
				Wood.ALDER.getName(), Wood.ALDER.getName());

		// 顧客の検索条件に合致するギターを在庫から探す
		List<Guitar> guitars = inventory.search(whatCustemerLikes);

		List<String> actuals = new LinkedList<>();

		String actualGuitar1 = "You might like this" + " " + guitars.get(0).getBuilder() + " "
				+ guitars.get(0).getModel() + " " + guitars.get(0).getType() + " " + guitars.get(0).getTopWood() + " "
				+ guitars.get(0).getBackWood() + " " + guitars.get(0).getPrice();

		String actualGuitar2 = "You might like this" + " " + guitars.get(1).getBuilder() + " "
				+ guitars.get(1).getModel() + " " + guitars.get(1).getType() + " " + guitars.get(1).getTopWood() + " "
				+ guitars.get(1).getBackWood() + " " + guitars.get(1).getPrice();

		actuals.add(actualGuitar1);
		actuals.add(actualGuitar2);

		// 期待しているのは下記の検索結果
		List<String> expecteds = new LinkedList<>();

		String expectedGuitar1 = "You might like this" + " " + "Fender" + " " + "Stratocastor" + " " + "electric" + " "
				+ "Alder" + " " + "Alder" + " " + 150000.0;
		String expectedGuitar2 = "You might like this" + " " + "Fender" + " " + "Stratocastor" + " " + "electric" + " "
				+ "Alder" + " " + "Alder" + " " + 100000.0;

		expecteds.add(expectedGuitar1);
		expecteds.add(expectedGuitar2);

		// 検索結果がnullの場合
		if (actuals.isEmpty()) {
			// コンソールに出力
			System.out.println("Sorry, we have nothing for you.");
		} else {
			// コンソールに出力
			System.out.println(actuals);
		}
		// Verify -検証
		// 期待値と異なっていた場合はエラーになる
		assertThat(actuals, is(expecteds));
	}

	private static void initialzeInventory(Inventory inventory) {

		// 在庫を設定する
		// ここで設定しているのはシリアル番号と値段以外は同じギター
		inventory.addGuitar("V95693", 150000, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		inventory.addGuitar("V95612", 100000, "Fender", "Stratocastor", "electric", "Alder", "Alder");
	}

}

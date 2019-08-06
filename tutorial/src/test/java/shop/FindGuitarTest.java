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
		GuitarSpec whatCustemerLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
				Wood.ALDER, 6);

		// 顧客の検索条件に合致するギターを在庫から探す
		List<Guitar> guitars = inventory.search(whatCustemerLikes);

		List<String> actuals = new LinkedList<>();

		String actualGuitar1 = "You might like this" + " " + guitars.get(0).getSpec().getBuilder().getName() + " "
				+ guitars.get(0).getSpec().getModel() + " " + guitars.get(0).getSpec().getType().getName() + " "
				+ guitars.get(0).getSpec().getTopWood().getName() + " "
				+ guitars.get(0).getSpec().getBackWood().getName() + " " + guitars.get(0).getSpec().getNumStrings()
				+ guitars.get(0).getPrice();

		String actualGuitar2 = "You might like this" + " " + guitars.get(1).getSpec().getBuilder().getName() + " "
				+ guitars.get(1).getSpec().getModel() + " " + guitars.get(1).getSpec().getType().getName() + " "
				+ guitars.get(1).getSpec().getTopWood().getName() + " "
				+ guitars.get(1).getSpec().getBackWood().getName() + " " + guitars.get(1).getSpec().getNumStrings()
				+ guitars.get(1).getPrice();

		actuals.add(actualGuitar1);
		actuals.add(actualGuitar2);

		// 期待しているのは下記の検索結果
		List<String> expecteds = new LinkedList<>();

		String expectedGuitar1 = "You might like this" + " " + "Fender" + " " + "Stratocastor" + " " + "electric" + " "
				+ "Alder" + " " + "Alder" + " " + 6 + 150000.0;
		String expectedGuitar2 = "You might like this" + " " + "Fender" + " " + "Stratocastor" + " " + "electric" + " "
				+ "Alder" + " " + "Alder" + " " + 6 + 100000.0;

		expecteds.add(expectedGuitar1);
		expecteds.add(expectedGuitar2);

		// コンソールに出力
		System.out.println(actuals);

		// Verify -検証
		// 期待値と異なっていた場合はエラーになる
		assertThat(actuals, is(expecteds));
	}

	private static void initialzeInventory(Inventory inventory) {

		// 在庫を設定する
		// ここで設定しているのはシリアル番号と値段以外は同じギター
		GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		inventory.addGuitar("V95693", 150000, spec);
		inventory.addGuitar("V95612", 100000, spec);

	}

}

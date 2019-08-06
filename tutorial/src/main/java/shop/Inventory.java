package shop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 在庫クラス<br>
 * 
 * <p>
 * 店舗の全在庫の楽器が格納されている<br>
 * 在庫にあるギターを検索する機能を提供する
 * </p>
 * 
 * @author onesword0618
 *
 */
public class Inventory {

	/**
	 * ギターオブジェクトを格納するリスト
	 */
	private List<Guitar> guitars;

	/**
	 * コンストラクタ<br>
	 * 在庫オブジェクトを生成する際に、ギターオブジェクトを格納するリストを生成する
	 */
	public Inventory() {
		this.guitars = new LinkedList<>();
	}

	/**
	 * ギターオブジェクトを格納するリストにギターオブジェクトを追加する.<br>
	 * 
	 * <p>
	 * ギタークラスにパラメータを渡してギターオブジェクトを生成する.
	 * </p>
	 * 
	 * @param serialNumber シリアル番号
	 * @param price        価格
	 * @param spec         仕様
	 */
	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		// ここで、ギタークラスのコンストラクタを呼び出してギターオブジェクトを生成している
		Guitar guitar = new Guitar(serialNumber, price, spec);

		// ギターオブジェクトを格納するリストに生成したギターオブジェクトを追加
		guitars.add(guitar);
	}

	/**
	 * ギターオブジェクトを格納するリストから渡したパラメータのシリアル番号と合致するギターオブジェクトを提供する.
	 * 
	 * @param serialNumber シリアル番号
	 * @return シリアル番号と合致したギターオブジェクト
	 */
	public Guitar getGuitar(String serialNumber) {

		/*
		 * 拡張for文
		 */
		for (Guitar guitar : guitars) {

			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	/**
	 * 指定した条件のギターを検索する<br>
	 * 
	 * @param searchGuita 検索しているギター
	 * @return 合致しているギターオブジェクト
	 */
	public List<Guitar> search(GuitarSpec searchSpec) {

		List<Guitar> matchingGuitars = new LinkedList<>();

		/*
		 * Iteratorを利用したループ処理
		 */
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {

			// Iteratorを利用してリストのギターオブジェクトを取り出す
			Guitar guitar = i.next();

			GuitarSpec guitarSpec = guitar.getSpec();
			// 引数のギターオブジェクトの製造者と合致しているか
			if (!searchSpec.getBuilder().equals(guitarSpec.getBuilder())) {
				continue;
			}

			String model = searchSpec.getModel();
			// 引数のギターオブジェクトの仕様と合致しているか
			if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel()))) {
				continue;
			}

			Type type = searchSpec.getType();
			// 引数のギターオブジェクトの種別と合致しているか
			if (!type.equals(guitarSpec.getType())) {
				continue;
			}

			Wood backWood = searchSpec.getBackWood();
			// 引数のギターオブジェクトの背面木材と合致しているか
			if (!backWood.equals(guitarSpec.getBackWood())) {
				continue;
			}

			Wood topWood = searchSpec.getTopWood();
			// 引数のギターオブジェクトの前面木材と合致しているか
			if (!topWood.equals(guitarSpec.getTopWood())) {
				continue;

			}
			// 全てに合致しているギターオブジェクトを追加する
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}

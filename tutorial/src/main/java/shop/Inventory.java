package shop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 在庫クラス<br>
 * 
 * <p>
 * 店舗の全在庫の楽器が格納されている<br>
 * 在庫にある楽器を検索する機能を提供する
 * </p>
 * 
 * @author onesword0618
 *
 */
public class Inventory {

	/**
	 * 楽器オブジェクトを格納するリスト
	 */
	private List<Instrument> inventory;

	/**
	 * コンストラクタ<br>
	 * 在庫オブジェクトを生成する際に、楽器オブジェクトを格納するリストを生成する
	 */
	public Inventory() {
		this.inventory = new LinkedList<>();
	}

	/**
	 * 楽器オブジェクトを格納するリストに追加する.
	 * 
	 * @param serialNumber シリアル番号
	 * @param price        価格
	 * @param spec         仕様
	 */
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {

		/*
		 * 渡されたパラメータによって何の楽器クラスのオブジェクトを生成するかを決める
		 * 
		 */
		Instrument instrument = null;

		// ギターオブジェクトだった場合
		if (spec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
		}

		// マンドリンオブジェクトだった場合
		if (spec instanceof MandolinSpec) {
			instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
		}

		inventory.add(instrument);
	}

	/**
	 * 楽器オブジェクトを格納するリストから渡したパラメータのシリアル番号と合致する楽器オブジェクトを提供する.
	 * 
	 * @param serialNumber シリアル番号
	 * @return シリアル番号と合致した楽器オブジェクト
	 */
	public Instrument getInstrument(String serialNumber) {

		/*
		 * 拡張for文
		 */
		for (Instrument instrument : inventory) {

			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	/**
	 * 指定した条件のギターを検索する<br>
	 * 
	 * @param searchSpec 検索している仕様
	 * @return 合致しているギターオブジェクト
	 */
	public List<Guitar> search(GuitarSpec searchSpec) {

		List<Guitar> matchingGuitars = new LinkedList<>();

		/*
		 * Iteratorを利用したループ処理
		 */
		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();) {

			// Iteratorを利用してリストのギターオブジェクトを取り出す
			Guitar guitar = (Guitar) i.next();

			if (guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);
		}
		// 全てに合致しているギターオブジェクトを追加する
		return matchingGuitars;
	}

	/**
	 * 指定した条件のマンドリンを検索する<br>
	 * 
	 * @param searchSpec 検索している仕様
	 * @return 合致しているマンドリンオブジェクト
	 */
	public List<Mandolin> search(MandolinSpec searchSpec) {

		List<Mandolin> matchingMandolins = new LinkedList<>();

		/*
		 * Iteratorを利用したループ処理
		 */
		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();) {

			// Iteratorを利用してリストのマンドリンオブジェクトを取り出す
			Mandolin mandolin = (Mandolin) i.next();

			if (mandolin.getSpec().matches(searchSpec))
				matchingMandolins.add(mandolin);
		}
		// 全てに合致しているマンドリンオブジェクトを追加する
		return matchingMandolins;
	}

}

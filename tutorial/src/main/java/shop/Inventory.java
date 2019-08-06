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

		// 渡されたパラメータによって何の楽器クラスのオブジェクトを生成するかを決める
		Instrument instrument = new Instrument(serialNumber, price, spec);
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
	 * 指定した条件の楽器を検索する<br>
	 * 
	 * @param searchSpec 検索している仕様
	 * @return 合致している楽器オブジェクト
	 */
	public List<Instrument> search(InstrumentSpec searchSpec) {

		List<Instrument> matchingInstruments = new LinkedList<>();

		/*
		 * Iteratorを利用したループ処理
		 */
		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();) {

			// Iteratorを利用してリストの楽器オブジェクトを取り出す
			Instrument instrument = (Instrument) i.next();

			if (instrument.getSpec().matches(searchSpec))
				matchingInstruments.add(instrument);
		}
		// 全てに合致している楽器オブジェクトを追加する
		return matchingInstruments;
	}
}

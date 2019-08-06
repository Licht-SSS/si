package shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class FindInstrumentTest {

	/**
	 * 楽器の検索が行えるかを検証する<br>
	 * 
	 */
	@Test
	public void 楽器検索を行う() {

		// 楽器の在庫を設定する
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map<String, String> properties = new HashMap<>();
		properties.put("builder", Builder.GIBSON.getName());
		properties.put("backWood", Wood.MAPLE.getName());

		InstrumentSpec whatBryanLikes = new InstrumentSpec(properties);

		List<Instrument> matchingInstruments = inventory.search(whatBryanLikes);

		if (!matchingInstruments.isEmpty()) {

			for (Instrument instrument : matchingInstruments) {
				InstrumentSpec spec = instrument.getSpec();

				System.out
						.println("We have a " + spec.getProperty("instrumentType") + " with the following properties:");

				for (String propertyName : spec.getProperties().keySet()) {

					if (propertyName.equals("instrumentType")) {
						System.out.println("  You can have this " + spec.getProperty("instrumentType") + " for $"
								+ instrument.getPrice() + "\n---");
						continue;
					}
					System.out.println("    " + propertyName + ": " + spec.getProperty(propertyName));

				}
			}
		} else {
			System.out.println("Sorry, Bryan, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		Map<String, String> properties = new HashMap<>();
		properties.put("instrumentType", InstrumentType.GUITAR.getName());
		properties.put("builder", Builder.COLLINGS.getName());
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC.getName());
		properties.put("numStrings", "6");
		properties.put("topWood", Wood.INDIAN_ROSEWOOD.getName());
		properties.put("backWood", Wood.SITKA.getName());
		inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

		properties.put("builder", Builder.MARTIN.getName());
		properties.put("model", "D-18");
		properties.put("topWood", Wood.MAHOGANY.getName());
		properties.put("backWood", Wood.ADIRONDACK.getName());
		inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

		properties.put("builder", Builder.FENDER.getName());
		properties.put("model", "Stratocastor");
		properties.put("type", Type.ELECTRIC.getName());
		properties.put("topWood", Wood.ALDER.getName());
		properties.put("backWood", Wood.ALDER.getName());
		inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
		inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));

		properties.put("builder", Builder.GIBSON.getName());
		properties.put("model", "Les Paul");
		properties.put("topWood", Wood.MAPLE.getName());
		properties.put("backWood", Wood.MAPLE.getName());
		inventory.addInstrument("70108276", 2295.95, new InstrumentSpec(properties));

		properties.put("model", "SG '61 Reissue");
		properties.put("topWood", Wood.MAHOGANY.getName());
		properties.put("backWood", Wood.MAHOGANY.getName());
		inventory.addInstrument("82765501", 1890.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.MANDOLIN.getName());
		properties.put("type", Type.ACOUSTIC.getName());
		properties.put("model", "F-5G");
		properties.put("backWood", Wood.MAPLE.getName());
		properties.put("topWood", Wood.MAPLE.getName());
		properties.remove("numStrings");
		inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.BANJO.getName());
		properties.put("model", "RB-3 Wreath");
		properties.remove("topWood");
		properties.put("numStrings", "5");
		inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
	}

}

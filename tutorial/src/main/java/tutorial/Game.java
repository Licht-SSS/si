package tutorial;

import java.util.ArrayList;

public class Game {

	private GameHelper helper = new GameHelper();
	private ArrayList<Ship> shipList = new ArrayList<Ship>();
	private int numOfGuesses = 0;

	// ゲーム開始準備
	private void setUpGame() {
		
		// 軍艦の設定を行う
		Ship shipOne = new Ship();
		shipOne.setName("Pets.com");
		Ship shipTwo = new Ship();
		shipTwo.setName("Toy.com");
		Ship shipThree = new Ship();
		shipThree.setName("XXX.com");
		shipList.add(shipOne);
		shipList.add(shipTwo);
		shipList.add(shipThree);

		System.out.println("あなたの目標は、3隻の軍艦を沈めることです");
		System.out.println("少ない回数で3隻の軍艦のすべての位置を当ててください");

		for (Ship setShip : shipList) {

			// 軍艦を3隻設定する
			ArrayList<String> newLocation = helper.placeShipGame(3);
			setShip.setLocationCells(newLocation);
		}
	}

	// 目標が達成するまで継続
	private void startPlaying() {
		
		while(!shipList.isEmpty()) {
			String userGuess = helper.getUserInput("入力してください");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	// 入力値が当たっているかを確認
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		
		for (Ship ship : shipList) {
			result = ship.checkYourself(userGuess);
			
			if (result.equals("hit")) {
				break;
			}
			
			if (result.equals("kill")) {
				shipList.remove(ship);
				break;
			}
		}
		
		System.out.println(result);
	}

	// ゲーム終了
	private void finishGame() {
		System.out.println("全ての軍艦を沈めることが出来ました。");
		
		// 評価
		if (numOfGuesses <= 18) {
			System.out.println("あなたの記録は " + numOfGuesses + " です ");
		} else {
			System.out.println("少し回数が多いかもしれません");
		}
	}

	// プログラムの起動
	public static void main(String[] args) {
		Game game = new Game();
		game.setUpGame();
		game.startPlaying();
	}
}

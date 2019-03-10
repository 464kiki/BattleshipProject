package models;

public class Firing {
	public void tileLocation() {
		// Gets tile location from what player has selected
	}

	public boolean isHit() {
		boolean isHit = true;
//		do {
//			// Checks if the tile has already been hit by getting an already stored boolean
//			// in boardspot
//			if (/* tile location is hit */) {
//				System.out.println("Tile has already been hit.");
//				isHit = false;
//				return false;
//			} else /* Tile hasn't been hit */ {
//				isHit = true;
		return true;
//			}
//		} while (isHit);

	}

	public boolean isShip() {
		// Checks if imageview is a ship or water
//		if(/*imageview = water.jpg*/) {
//			// change jpg to white target
//		} else /*If imageview is carrier, battleship, etc.*/{
//			//change jpg to red target
		hitShip();
//		}

		return false;
	}

	public void whatPart() {
		// Finds ship part using cell location and matching it to ship img array
	}

	public void hitShip() {
		// make cell become hit by changing boolean
		// remove img from ship img array (running whatPart() first)
	}
}

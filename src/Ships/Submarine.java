package Ships;

import javafx.scene.image.Image;

public class Submarine implements Ship {
	// Variables
	final private int shipLength = 3;
	final private String shipName = "Submarine";
	final private Image shipImg[] = {};
	private String shipPosition[];

	public Submarine(String[] shipPosition) {
		super();
		this.setShipPosition(shipPosition);
	}

	// Getters & Setters
	public int getShipLength() {
		return shipLength;
	}

	public String getShipName() {
		return shipName;
	}

	public Image[] getShipImg() {
		return shipImg;
	}

	public String[] getShipPosition() {
		return shipPosition;
	}

	public void setShipPosition(String shipPosition[]) {
		this.shipPosition = shipPosition;
	}
	///////////////////
	@Override
	public String shipLength(int tileLength) {

		if (tileLength == shipLength) {

			return "Tiles selected is the correct length.";
		} else {
			return "Please select the tile length that equals the ship length you've chosen.";
		}

	}

	@Override
	public String shipPosition() {
//		if (/*ship coordinates changes in x axis or in y axis*/) {
//			return "Ship needs to be vertical or horizontal.";
//		} else {
//			//save coordinates in shipPosition
//			return "Ship has been stored.";
//		}

		return null;

	}

	@Override
	public void shipNameSunk() {
		// TODO Auto-generated method stub

	}

	@Override
	public Image shipImgs() {
		// If array isn't empty
		if (shipPosition.length != 0) {
			// changes selected tiles to correct ship image, which returns an image
		}
		return null;
	}

}

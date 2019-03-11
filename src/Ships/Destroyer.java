package Ships;

import java.util.Arrays;

import javafx.scene.image.Image;

public class Destroyer implements Ship {
	// Variables
	final private int shipLength = 2;
	final private String shipName = "Destroyer";
	final private Image shipImg[] = {};
	private String shipPosition[];

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
	public String shipPosition(String[] shipPositionDE) {
		// Get char index for each coordinate
		char x1 = 0;
		char x2 = 0;

		char y1 = 0;
		char y2 = 0;

		// Gets vertical positioning
		for (int count = 0; count < shipPositionDE.length; count++) {
			y1 = shipPositionDE[count = 0].charAt(2);
			y2 = shipPositionDE[count = 1].charAt(2);
			System.out.println(y1 + "+" + y2);
		}

		// Checks if y value is 10
		if (y1 == '0') {
			y1 = shipPositionDE[0].charAt(1);
			if (y1 == '1') {
				y1 = '-' /* equals 10 */;
			}
		} else if (y2 == '0') {
			y2 = shipPositionDE[0].charAt(1);
			if (y2 == '1') {
				y2 = '-' /* equals 10 */;
			}
		}
		///////////////////////////

		// Gets horizontal positioning
		for (int count = 0; count < shipPositionDE.length; count++) {
			x1 = shipPositionDE[count = 0].charAt(5);
			x2 = shipPositionDE[count = 1].charAt(5);
			System.out.println(x1 + "+" + x2);
		}

		// Checks if x value is 10
		if (x1 == '0') {
			x1 = shipPositionDE[0].charAt(4);
			if (x1 == '1') {
				x1 = '-' /* equals 10 */;
			}
		} else if (x2 == '0') {
			x2 = shipPositionDE[0].charAt(4);
			if (x2 == '1') {
				x2 = '-' /* equals 10 */;
			}
		}
		///////////////////////////

		// Compares if ship is horizontal
		if (y1 == y2) {
			// Store coordinates in array
			setShipPosition(shipPositionDE);
			System.out.println(Arrays.toString(shipPositionDE));
			return "Ship has been stored horizontally";
		} else if /* Compares if ship is vertical */ (x1 == x2) {
			// Store coordinates in array
			setShipPosition(shipPositionDE);
			System.out.println(Arrays.toString(shipPositionDE));
			return "Ship has been stored vertically";
		} else {
			// Make them do it again
			return "Ship needs to be vertical or horizontal.";
		}
	}

	@Override
	public void shipNameSunk() {
		// TODO Auto-generated method stub

	}

}

package Ships;

import java.util.Arrays;

import javafx.scene.image.Image;

public class Submarine implements Ship {
	// Variables
	final private int shipLength = 3;
	final private String shipName = "Submarine";
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
	public String shipPosition(String[] shipPositionSU) {
		// Get char index for each coordinate
		char x1 = 0;
		char x2 = 0;
		char x3 = 0;

		char y1 = 0;
		char y2 = 0;
		char y3 = 0;

		// Gets vertical positioning
		for (int count = 0; count < shipPositionSU.length; count++) {
			y1 = shipPositionSU[count = 0].charAt(2);
			y2 = shipPositionSU[count = 1].charAt(2);
			y3 = shipPositionSU[count = 2].charAt(2);
			System.out.println(y1 + "+" + y2 + "+" + y3);
		}

		// Checks if y value is 10
		if (y1 == '0') {
			y1 = shipPositionSU[0].charAt(1);
			if (y1 == '1') {
				y1 = '-' /* equals 10 */;
			}
		} else if (y2 == '0') {
			y2 = shipPositionSU[0].charAt(1);
			if (y2 == '1') {
				y2 = '-' /* equals 10 */;
			}
		} else if (y3 == '0') {
			y3 = shipPositionSU[0].charAt(1);
			if (y3 == '1') {
				y3 = '-' /* equals 10 */;
			}
		}
		///////////////////////////

		// Gets horizontal positioning
		for (int count = 0; count < shipPositionSU.length; count++) {
			x1 = shipPositionSU[count = 0].charAt(5);
			x2 = shipPositionSU[count = 1].charAt(5);
			x3 = shipPositionSU[count = 2].charAt(5);
			System.out.println(x1 + "+" + x2 + "+" + x3);
		}

		// Checks if x value is 10
		if (x1 == '0') {
			x1 = shipPositionSU[0].charAt(4);
			if (x1 == '1') {
				x1 = '-' /* equals 10 */;
			}
		} else if (x2 == '0') {
			x2 = shipPositionSU[0].charAt(4);
			if (x2 == '1') {
				x2 = '-' /* equals 10 */;
			}
		} else if (x3 == '0') {
			x3 = shipPositionSU[0].charAt(4);
			if (x3 == '1') {
				x3 = '-' /* equals 10 */;
			}
		}
		///////////////////////////

		// Compares if ship is horizontal
		if (y1 == y2 && y1 == y3) {
			// Store coordinates in array
			setShipPosition(shipPositionSU);
			System.out.println(Arrays.toString(shipPositionSU));
			return "Ship has been stored horizontally";
		} else if /* Compares if ship is vertical */ (x1 == x2 && x1 == x3) {
			// Store coordinates in array
			setShipPosition(shipPositionSU);
			System.out.println(Arrays.toString(shipPositionSU));
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

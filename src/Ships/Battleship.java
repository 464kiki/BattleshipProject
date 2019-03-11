package Ships;

import java.util.Arrays;

import javafx.scene.image.Image;

public class Battleship implements Ship {
	// Variables
	final private int shipLength = 4;
	final private String shipName = "Battleship";
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
	public String shipPosition(String[] shipPositionBA) {
		// Get char index for each coordinate
		char x1 = 0;
		char x2 = 0;
		char x3 = 0;
		char x4 = 0;

		char y1 = 0;
		char y2 = 0;
		char y3 = 0;
		char y4 = 0;

		// Gets vertical positioning
		for (int count = 0; count < shipPositionBA.length; count++) {
			y1 = shipPositionBA[count = 0].charAt(2);
			y2 = shipPositionBA[count = 1].charAt(2);
			y3 = shipPositionBA[count = 2].charAt(2);
			y4 = shipPositionBA[count = 3].charAt(2);

			System.out.println(y1 + "+" + y2 + "+" + y3 + "+" + y4);
		}

		// Checks if y value is 10
		if (y1 == '0') {
			y1 = shipPositionBA[0].charAt(1);
			if (y1 == '1') {
				y1 = '-' /* equals 10 */;
			}
		} else if (y2 == '0') {
			y2 = shipPositionBA[0].charAt(1);
			if (y2 == '1') {
				y2 = '-' /* equals 10 */;
			}
		} else if (y3 == '0') {
			y3 = shipPositionBA[0].charAt(1);
			if (y3 == '1') {
				y3 = '-' /* equals 10 */;
			}
		} else if (y4 == '0') {
			y4 = shipPositionBA[0].charAt(1);
			if (y4 == '1') {
				y4 = '-' /* equals 10 */;
			}
		}
		///////////////////////////

		// Gets horizontal positioning
		for (int count = 0; count < shipPositionBA.length; count++) {
			x1 = shipPositionBA[count = 0].charAt(5);
			x2 = shipPositionBA[count = 1].charAt(5);
			x3 = shipPositionBA[count = 2].charAt(5);
			x4 = shipPositionBA[count = 3].charAt(5);
			System.out.println(x1 + "+" + x2 + "+" + x3 + "+" + x4);
		}

		// Checks if x value is 10
		if (x1 == '0') {
			x1 = shipPositionBA[0].charAt(4);
			if (x1 == '1') {
				x1 = '-' /* equals 10 */;
			}
		} else if (x2 == '0') {
			x2 = shipPositionBA[0].charAt(4);
			if (x2 == '1') {
				x2 = '-' /* equals 10 */;
			}
		} else if (x3 == '0') {
			x3 = shipPositionBA[0].charAt(4);
			if (x3 == '1') {
				x3 = '-' /* equals 10 */;
			}
		} else if (x4 == '0') {
			x4 = shipPositionBA[0].charAt(4);
			if (x4 == '1') {
				x4 = '-' /* equals 10 */;
			}
		}
		///////////////////////////

		// Compares if ship is horizontal
		if (y1 == y2 && y1 == y3 && y1 == y4) {
			// Store coordinates in array
			setShipPosition(shipPositionBA);
			System.out.println(Arrays.toString(shipPositionBA));
			return "Ship has been stored horizontally";
		} else if /* Compares if ship is vertical */ (x1 == x2 && x1 == x3 && x1 == x4) {
			// Store coordinates in array
			setShipPosition(shipPositionBA);
			System.out.println(Arrays.toString(shipPositionBA));
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

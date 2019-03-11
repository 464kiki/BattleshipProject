package Ships;

import java.util.Arrays;

public class Carrier implements Ship {
	// Variables
	final private int shipLength = 5;
	final private String shipName = "Carrier";
	private String shipPosition[];

	// Getters & Setters
	public int getShipLength() {
		return shipLength;
	}

	public String getShipName() {
		return shipName;
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
		// If tiles equal the ship length
		if (tileLength == shipLength) {
			return "Tiles selected is the correct length.";
		} else {
			return "Please select the tile length that equals the ship length you've chosen.";
		}

	}

	@Override
	public String shipPosition(String[] shipPositionCA) {
		// Get char index for each coordinate
		char x1 = 0;
		char x2 = 0;
		char x3 = 0;
		char x4 = 0;
		char x5 = 0;

		char y1 = 0;
		char y2 = 0;
		char y3 = 0;
		char y4 = 0;
		char y5 = 0;

		// Gets vertical positioning
		for (int count = 0; count < shipPositionCA.length; count++) {
			y1 = shipPositionCA[count = 0].charAt(2);
			y2 = shipPositionCA[count = 1].charAt(2);
			y3 = shipPositionCA[count = 2].charAt(2);
			y4 = shipPositionCA[count = 3].charAt(2);
			y5 = shipPositionCA[count = 4].charAt(2);
			System.out.println(y1 + "+" + y2 + "+" + y3 + "+" + y4 + "+" + y5);
		}

		// Checks if y value is 10
		if (y1 == '0') {
			y1 = shipPositionCA[0].charAt(1);
			if (y1 == '1') {
				y1 = '-' /* equals 10 */;
			}
		} else if (y2 == '0') {
			y2 = shipPositionCA[0].charAt(1);
			if (y2 == '1') {
				y2 = '-' /* equals 10 */;
			}
		} else if (y3 == '0') {
			y3 = shipPositionCA[0].charAt(1);
			if (y3 == '1') {
				y3 = '-' /* equals 10 */;
			}
		} else if (y4 == '0') {
			y4 = shipPositionCA[0].charAt(1);
			if (y4 == '1') {
				y4 = '-' /* equals 10 */;
			}
		} else if (y5 == '0') {
			y5 = shipPositionCA[0].charAt(1);
			if (y5 == '1') {
				y5 = '-' /* equals 10 */;
			}
		}
		///////////////////////////

		// Gets horizontal positioning
		for (int count = 0; count < shipPositionCA.length; count++) {
			x1 = shipPositionCA[count = 0].charAt(5);
			x2 = shipPositionCA[count = 1].charAt(5);
			x3 = shipPositionCA[count = 2].charAt(5);
			x4 = shipPositionCA[count = 3].charAt(5);
			x5 = shipPositionCA[count = 4].charAt(5);
			System.out.println(x1 + "+" + x2 + "+" + x3 + "+" + x4 + "+" + x5);
		}

		// Checks if x value is 10
		if (x1 == '0') {
			x1 = shipPositionCA[0].charAt(4);
			if (x1 == '1') {
				x1 = '-' /* equals 10 */;
			}
		} else if (x2 == '0') {
			x2 = shipPositionCA[0].charAt(4);
			if (x2 == '1') {
				x2 = '-' /* equals 10 */;
			}
		} else if (x3 == '0') {
			x3 = shipPositionCA[0].charAt(4);
			if (x3 == '1') {
				x3 = '-' /* equals 10 */;
			}
		} else if (x4 == '0') {
			x4 = shipPositionCA[0].charAt(4);
			if (x4 == '1') {
				x4 = '-' /* equals 10 */;
			}
		} else if (x5 == '0') {
			x5 = shipPositionCA[0].charAt(4);
			if (x5 == '1') {
				x5 = '-' /* equals 10 */;
			}
		}
		///////////////////////////

		// Compares if ship is horizontal
		if (y1 == y2 && y1 == y3 && y1 == y4 && y1 == y5) {
			// Store coordinates in array
			setShipPosition(shipPositionCA);
			System.out.println(Arrays.toString(shipPositionCA));
			return "Ship has been stored horizontally";
		} else if /* Compares if ship is vertical */ (x1 == x2 && x1 == x3 && x1 == x4 && x1 == x5) {
			// Store coordinates in array
			setShipPosition(shipPositionCA);
			System.out.println(Arrays.toString(shipPositionCA));
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

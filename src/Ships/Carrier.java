package Ships;

import javafx.scene.image.Image;

public class Carrier implements Ship {
	// Variables
	private int shipLength;
	private String shipName;
	private Image shipImg[];
	private String shipPosition[];

	public Carrier(int shipLength, String shipName, Image[] shipImg, String[] shipPosition) {
		super();
		this.setShipLength(shipLength);
		this.setShipName(shipName);
		this.setShipImg(shipImg);
		this.setShipPosition(shipPosition);
	}

	// Getters & Setters
	public int getShipLength() {
		return shipLength;
	}

	public void setShipLength(int shipLength) {
		this.shipLength = shipLength;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public Image[] getShipImg() {
		return shipImg;
	}

	public void setShipImg(Image shipImg[]) {
		this.shipImg = shipImg;
	}

	public String[] getShipPosition() {
		return shipPosition;
	}

	public void setShipPosition(String shipPosition[]) {
		this.shipPosition = shipPosition;
	}
	///////////////////

	@Override
	public void shipLength() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shipName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shipPosition() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shipImgs() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ship Name: ").append(getShipName()).append("Ship Length: ").append(getShipLength());
		return builder.toString();
	}

}

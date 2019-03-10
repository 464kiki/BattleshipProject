package models;

import javafx.scene.image.Image;

public class BoardSpot {
	// Variables
	private boolean isTaken;
	private boolean isHit;
	private int row;
	private int column;
	private Image img;

	public BoardSpot(boolean isTaken, boolean isHit, int row, int column, Image img) {
		super();
		this.setTaken(isTaken);
		this.setHit(isHit);
		this.setRow(row);
		this.setColumn(column);
		this.setImg(img);
	}

	// Getters & Setters
	public boolean isTaken() {
		return isTaken;
	}

	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}

	public boolean isHit() {
		return isHit;
	}

	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	///////////////////

}

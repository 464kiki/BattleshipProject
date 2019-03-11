package models;

import javafx.scene.image.Image;

public class BoardSpot {
	// Variables
	private boolean isTaken;
	private boolean isHit;
	private Image img;

	public BoardSpot(boolean isTaken, boolean isHit, Image img) {
		super();
		this.setTaken(isTaken);
		this.setHit(isHit);
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

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	///////////////////

	

}

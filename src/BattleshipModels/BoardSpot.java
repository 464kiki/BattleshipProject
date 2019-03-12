package BattleshipModels;

public class BoardSpot {
	// Variables
	private boolean isTaken;
	private boolean isHit;
	private String img;

	public BoardSpot(boolean isTaken, boolean isHit, String img) {
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	///////////////////

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("isTaken = ").append(isTaken()).append("isHit = ").append(isHit()).append("getImg = ")
				.append(getImg());
		return builder.toString();
	}

}

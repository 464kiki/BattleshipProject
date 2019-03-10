package Ships;

import javafx.scene.image.Image;

public interface Ship {
	// Makes sure tiles selected are ship length
	public String shipLength(int tileLength);

	// Saves position
	public String shipPosition();

	// Works with displaying ship imgs
	public Image shipImgs();
	
	// When ship is sunk, display message
	public void shipNameSunk();
}

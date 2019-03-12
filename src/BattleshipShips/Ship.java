package BattleshipShips;

public interface Ship {
	// Makes sure tiles selected are ship length
	public String shipLength(int tileLength);

	// Saves position
	public String shipPosition(String[] shipPosition);

	// When ship is sunk, display message
	public String shipNameSunk();
}

package BattleshipModels;

public class Player {
	private String playerName;
	private Board board;
	private int WinLose;

	public Player(String playerName) {
		super();
		this.setPlayerName(playerName);
	}

	// Getters & Setters
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public int getWinLose() {
		return WinLose;
	}

	public void setWinLose(int winLose) {
		WinLose = winLose + WinLose;
	}
	///////////////////

	public void takeTurn() {
		// Switch using boolean to see which turn it is
		// Swap data back and forth, changing the grid's imageviews
	}

	public String checkWin(String playerName) {
		// Count how many unique hits have occurred by the player
		if (WinLose == 17) {
			// player win
			return playerName + " has won!";
		} else {
			return playerName;
		}

	}
}

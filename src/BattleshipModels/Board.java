package BattleshipModels;

public class Board {
	// Variables
	private BoardSpot[][] Board;

	public Board() {
		super();
		Board = new BoardSpot[11][10];
	}

	// Getter & Setter
	public BoardSpot[][] getBoard() {
		return Board;
	}

	public void setBoard(BoardSpot[][] board) {
		Board = board;
	}
	/////////////////

	public void createBoard(BoardSpot[][] Board) {

	}

}

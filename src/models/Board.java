package models;

import java.util.Arrays;

public class Board {
	// Variables
	private BoardSpot[][] Board;

	public Board(BoardSpot[][] board) {
		super();
		setBoard(board);
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

	public void placeShip() {

	}

}

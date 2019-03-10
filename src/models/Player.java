package models;

import java.util.Arrays;

import Ships.Ship;

public class Player {
	private String playerName;
	private Board board;
	private Ship[] ships;
	private int WinLose;

	public Player(String playerName, Board board, Ship[] ships, int winLose) {
		super();
		this.setPlayerName(playerName);
		this.setBoard(board);
		this.setShips(ships);
		setWinLose(winLose);
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

	public Ship[] getShips() {
		return ships;
	}

	public void setShips(Ship[] ships) {
		this.ships = ships;
	}

	public int getWinLose() {
		return WinLose;
	}

	public void setWinLose(int winLose) {
		WinLose = winLose;
	}
	///////////////////

	public void takeTurn() {
		//Switch using boolean to see which turn it is
		//Swap data back and forth, changing the grid's imageviews
	}

	public String checkWin(String playerName) {
		//Count how many unique hits have occurred
		if(WinLose == 17) {
			//player wins
		}
			
		return playerName;
	}
}

package BattleshipController;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ResourceBundle;

import BattleshipModels.Board;
import BattleshipModels.BoardSpot;
import BattleshipModels.Player;
import BattleshipShips.Battleship;
import BattleshipShips.Carrier;
import BattleshipShips.Cruiser;
import BattleshipShips.Destroyer;
import BattleshipShips.Submarine;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class GamePlay implements Initializable {
	// Variables
	private Player player;
	private Board board;
	private Board currBoard;
	private BoardSpot boardspot;
	HashMap<String, Player> players = new HashMap<String, Player>();

	// Saves the name in a global variable
	private String player1;
	private String player2;
	private int nameCounter = 0;

	// Makes a global imageview for firing
	private ImageView imageViewF;

	// Has name of the imageview always accessible
	private String location;

	// Counts number of ships placed
	int counter = 0;
	// Counts number of unique hits each player takes
	int uniqueHit = 0;

	// Ship selection
	boolean isCarrier = false;
	boolean isBattleship = false;
	boolean isCruiser = false;
	boolean isSubmarine = false;
	boolean isDestroyer = false;

	// Ship counters
	public int tileLengthCA = 0;
	public int tileLengthBA = 0;
	public int tileLengthCR = 0;
	public int tileLengthSU = 0;
	public int tileLengthDE = 0;

	// Ship Position Arrays
	private String[] shipPositionCA = new String[5];
	private String[] shipPositionBA = new String[4];
	private String[] shipPositionCR = new String[3];
	private String[] shipPositionSU = new String[3];
	private String[] shipPositionDE = new String[2];

	// GUI interactables
	// Grids
	@FXML
	private GridPane grid_placing;
	@FXML
	private GridPane grid_firing;

	// Panes
	@FXML
	private AnchorPane placingAnchorPane;
	@FXML
	private AnchorPane firingAnchorPane;

	// Tabs
	@FXML
	private Tab tab_Firing;
	@FXML
	private Tab tab_ShipPlacement;

	// Ship imageviews
	@FXML
	private ImageView ship_Carrier;
	@FXML
	private ImageView ship_Battleship;
	@FXML
	private ImageView ship_Cruiser;
	@FXML
	private ImageView ship_Submarine;
	@FXML
	private ImageView ship_Destroyer;

	// Buttons
	@FXML
	private Button btn_accept;
	@FXML
	private Button btn_return;
	@FXML
	private Button btn_fire;
	@FXML
	private Button btn_name;

	// Textfield
	@FXML
	private TextField txt_playerName;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		resetControls();
		getGridTiles_Placing();
		getGridTiles_Firing();
		clickEvents();
	}

	private void resetControls() {
		placingAnchorPane = new AnchorPane();
		firingAnchorPane = new AnchorPane();
	}

	public void getGridTiles_Placing() {
		int rowNum = 10;
		int colLetter = 10;
		board = new Board();
		tileLengthCA = 0;
		tileLengthBA = 0;
		tileLengthCR = 0;
		tileLengthSU = 0;
		tileLengthDE = 0;

		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colLetter; j++) {
				// Makes a new ImageView each time
				ImageView imageView = new ImageView();

				// Creates id for each ImageView and prints it out
				String name = generateMapCellName(i, j);
				System.out.println(name);
				imageView.setId(name);

				imageView.setImage(null);

				// Sets each ImageView to the default image
				File defaultPicture = new File("src/images/water.jpg");
				Image image = new Image(defaultPicture.toURI().toString());
				imageView.setImage(image);

				// Declares ImageView width and height
				imageView.setFitWidth(42);
				imageView.setFitHeight(44);

				// Sets default variables to each boardspot
				boardspot = new BoardSpot(false, false, "src/images/water.jpg");

				// Creates default board by changing value of each individual spot
				board.getBoard()[i][j] = boardspot;

				// Generates a click event for each square
				imageView.setOnMouseClicked((MouseEvent e) -> {
					// Tells which one has been clicked
					System.out.println(name);

					// For placing ships
					if (isCarrier == true) {
						// Adds position selected in array
						for (int count = tileLengthCA; count < shipPositionCA.length; count++) {
							shipPositionCA[tileLengthCA] = imageView.getId();
						}
						System.out.println(Arrays.toString(shipPositionCA));

						// Counts how many tiles are selected
						tileLengthCA++;
						System.out.println(tileLengthCA);

						// Places image on tile
						File Carrier = new File("src/images/Carrier.jpg");
						Image imgCarrier = new Image(Carrier.toURI().toString());
						imageView.setImage(imgCarrier);
					} else if (isBattleship == true) {
						// Adds position selected in array
						for (int count = tileLengthBA; count < shipPositionBA.length; count++) {
							shipPositionBA[tileLengthBA] = imageView.getId();
						}
						System.out.println(Arrays.toString(shipPositionBA));

						// Counts how many tiles are selected
						tileLengthBA++;
						System.out.println(tileLengthBA);

						// Places image on tile
						File Battleship = new File("src/images/Battleship.jpg");
						Image battleship = new Image(Battleship.toURI().toString());
						imageView.setImage(battleship);
					} else if (isCruiser == true) {
						// Adds position selected in array
						for (int count = tileLengthCR; count < shipPositionCR.length; count++) {
							shipPositionCR[tileLengthCR] = imageView.getId();
						}
						System.out.println(Arrays.toString(shipPositionCR));

						// Counts how many tiles are selected
						tileLengthCR++;
						System.out.println(tileLengthCR);

						// Places image on tile
						File Cruiser = new File("src/images/Cruiser.png");
						Image cruiser = new Image(Cruiser.toURI().toString());
						imageView.setImage(cruiser);
					} else if (isSubmarine == true) {
						// Adds position selected in array
						for (int count = tileLengthSU; count < shipPositionSU.length; count++) {
							shipPositionSU[tileLengthSU] = imageView.getId();
						}
						System.out.println(Arrays.toString(shipPositionSU));

						// Counts how many tiles are selected
						tileLengthSU++;
						System.out.println(tileLengthSU);

						// Places image on tile
						File Submarine = new File("src/images/Submarine.png");
						Image submarine = new Image(Submarine.toURI().toString());
						imageView.setImage(submarine);
					} else if (isDestroyer == true) {
						// Adds position selected in array
						for (int count = tileLengthDE; count < shipPositionDE.length; count++) {
							shipPositionDE[tileLengthDE] = imageView.getId();
						}
						System.out.println(Arrays.toString(shipPositionDE));

						// Counts how many tiles are selected
						tileLengthDE++;
						System.out.println(tileLengthDE);

						// Places image on tile
						File Destroyer = new File("src/images/Destroyer.jpg");
						Image destroyer = new Image(Destroyer.toURI().toString());
						imageView.setImage(destroyer);
					}

				});

				// Adds ImageViews to the placing grid in appropriate locations
				grid_placing.add(imageView, j + 1, i + 1);

			}
		}
		// Displays Board in console
		// System.out.println(Arrays.deepToString(board.getBoard()));
	}

	public void getGridTiles_Firing() {
		int rowNum = 10;
		int colLetter = 10;

		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colLetter; j++) {

				// Makes a new ImageView each times
				ImageView imageView = new ImageView();
				imageViewF = imageView;

				// Creates id for each ImageView and prints it out
				String name = generateMapCellName(i, j);
				System.out.println(name);
				imageView.setId(name);

				// Sets each ImageView to the default image
				File defaultPicture = new File("src/images/water.jpg");
				Image image = new Image(defaultPicture.toURI().toString());
				imageView.setImage(image);

				// Declares ImageView width and height
				imageView.setFitWidth(42);
				imageView.setFitHeight(44);

				// Generates a click event for each square
				imageView.setOnMouseClicked((MouseEvent e) -> {
					// Tells which one has been clicked
					System.out.println(name);

					// Sets name to location so known what cell has been chosen
					location = name;
					board.getBoard();

					// Splits string into an array with x = index 1 and y = index 2
					String[] hold = location.split(",");

					char x1 = 0;
					char y1 = 0;

					// Gets y and x coordinate
					x1 = hold[0].charAt(2);
					y1 = hold[1].charAt(1);

					// Changes them to ints
					int x = x1 - 48;
					int y = y1 - 48;

					boolean isHit = currBoard.getBoard()[y][x].isHit();
					boolean isTaken = currBoard.getBoard()[y][x].isTaken();

					if (isHit == true) {
						// Say spot has already been hit
						System.out.println("Spot has already been hit.");
					} else {
						// If ship is in square
						if (isTaken == true) {
							// change imageview to red target
							String target_hit = "src/images/red_hit.jpg";
							File hit = new File(target_hit);
							Image red_hit = new Image(hit.toURI().toString());
							imageView.setImage(red_hit);
							uniqueHit++;
							
							//Sets the win counter to current player
							player.setWinLose(uniqueHit);
							//Updates hashmap
							players.put(player.getPlayerName(), player);
						
							
							// Change boolean to true
							board.getBoard()[y][x].setHit(true);
							// Changes boolean to true
							board.getBoard()[y][x].setTaken(true);
							// Change image string to hit
							board.getBoard()[y][x].setImg(target_hit);
							
							String currPlayer = player.getPlayerName();
							System.out.println(player.checkWin(currPlayer));
							
						} else {
							// Miss
							// change imageview to white target
							String missHit = "src/images/miss_hit.jpg";
							File miss = new File(missHit);
							Image miss_hit = new Image(miss.toURI().toString());
							imageView.setImage(miss_hit);

							// Change boolean to true
							board.getBoard()[y][x].setHit(true);
							// Change image string to hit
							board.getBoard()[y][x].setImg(missHit);
						}
						System.out.println(Arrays.deepToString(board.getBoard()));
					}
				});

				// Adds ImageViews to the placing grid in appropriate locations
				grid_firing.add(imageView, j + 1, i + 1);

			}
		}

	}

	private String generateMapCellName(int row, int col) {
		// Formats IDs for ImageViews
		if (row < 10 & col < 10) {
			return "(" + "0" + row + "," + "0" + col + ")";
		} else if (col < 10) {
			return "(" + row + "," + "0" + col + ")";
		} else {
			return "(" + row + "," + col + ")";
		}

	}

	public void clickEvents() {

		// Ship Placing Click Event
		btn_accept.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!");

			// Takes in counter for chosen ship so proper checks can be made
			if (isCarrier == true) {
				Carrier carrier = new Carrier();
				// Checks that tile length is correct
				String resultLength = carrier.shipLength(tileLengthCA);
				System.out.println(resultLength);

				// Checks that its horizontal or vertical
				String resultPosition = carrier.shipPosition(shipPositionCA);
				System.out.println(resultPosition);
				counter++;

				// Updates board with the correct coordinates
				for (int count = 0; count < shipPositionCA.length; count++) {
					// If it's a proper coordinate
					if (resultPosition.contains("stored")) {
						// Gets the x position
						String xString = shipPositionCA[count].substring(4, 6);
						int x = Integer.parseInt(xString);
						// Gets the y position
						String yString = shipPositionCA[count].substring(1, 3);
						int y = Integer.parseInt(yString);

						// Compares x,y to index array to change correct tile
						board.getBoard()[x][y].setTaken(true);
					}
				}
				System.out.println(Arrays.deepToString(board.getBoard()));

			} else if (isBattleship == true) {
				Battleship battleship = new Battleship();

				// Checks that tile length is correct
				String resultLength = battleship.shipLength(tileLengthBA);
				System.out.println(resultLength);

				// Checks that its horizontal or vertical
				String resultPosition = battleship.shipPosition(shipPositionBA);
				System.out.println(resultPosition);
				counter++;

				// Updates board with the correct coordinates
				for (int count = 0; count < shipPositionBA.length; count++) {
					// If it's a proper coordinate
					if (resultPosition.contains("stored")) {
						// Gets the x position
						String xString = shipPositionBA[count].substring(4, 6);
						int x = Integer.parseInt(xString);
						// Gets the y position
						String yString = shipPositionBA[count].substring(1, 3);
						int y = Integer.parseInt(yString);

						// Compares x,y to index array to change correct tile
						board.getBoard()[x][y].setTaken(true);
					}
				}
				System.out.println(Arrays.deepToString(board.getBoard()));

			} else if (isCruiser == true) {
				Cruiser cruiser = new Cruiser();

				// Checks that tile length is correct
				String resultLength = cruiser.shipLength(tileLengthCR);
				System.out.println(resultLength);

				// Checks that its horizontal or vertical
				String resultPosition = cruiser.shipPosition(shipPositionCR);
				System.out.println(resultPosition);
				counter++;

				// Updates board with the correct coordinates
				for (int count = 0; count < shipPositionCR.length; count++) {
					// If it's a proper coordinate
					if (resultPosition.contains("stored")) {
						// Gets the x position
						String xString = shipPositionCR[count].substring(4, 6);
						int x = Integer.parseInt(xString);
						// Gets the y position
						String yString = shipPositionCR[count].substring(1, 3);
						int y = Integer.parseInt(yString);

						// Compares x,y to index array to change correct tile
						board.getBoard()[x][y].setTaken(true);
					}
				}
				System.out.println(Arrays.deepToString(board.getBoard()));

			} else if (isSubmarine == true) {
				Submarine submarine = new Submarine();

				// Checks that tile length is correct
				String resultLength = submarine.shipLength(tileLengthSU);
				System.out.println(resultLength);

				// Checks that its horizontal or vertical
				String resultPosition = submarine.shipPosition(shipPositionSU);
				System.out.println(resultPosition);
				counter++;

				// Updates board with the correct coordinates
				for (int count = 0; count < shipPositionSU.length; count++) {
					// If it's a proper coordinate
					if (resultPosition.contains("stored")) {
						// Gets the x position
						String xString = shipPositionSU[count].substring(4, 6);
						int x = Integer.parseInt(xString);
						// Gets the y position
						String yString = shipPositionSU[count].substring(1, 3);
						int y = Integer.parseInt(yString);

						// Compares x,y to index array to change correct tile
						board.getBoard()[x][y].setTaken(true);
					}
				}
				System.out.println(Arrays.deepToString(board.getBoard()));

			} else if (isDestroyer == true) {
				Destroyer destroyer = new Destroyer();

				// Checks that tile length is correct
				String resultLength = destroyer.shipLength(tileLengthDE);
				System.out.println(resultLength);

				// Checks that its horizontal or vertical
				String resultPosition = destroyer.shipPosition(shipPositionDE);
				System.out.println(resultPosition);
				counter++;

				// Updates board with the correct coordinates
				for (int count = 0; count < shipPositionDE.length; count++) {
					// If it's a proper coordinate
					if (resultPosition.contains("stored")) {
						// Gets the x position
						String xString = shipPositionDE[count].substring(4, 6);
						int x = Integer.parseInt(xString);
						// Gets the y position
						String yString = shipPositionDE[count].substring(1, 3);
						int y = Integer.parseInt(yString);

						// Compares x,y to index array to change correct tile
						board.getBoard()[x][y].setTaken(true);
					}
				}
				System.out.println(Arrays.deepToString(board.getBoard()));

			}

			// When done placing ships
			if (counter == 5) {
				counter = 0;
				System.out.println(counter);

				// Gets player key and sets board to player
				players.get(player.getPlayerName()).setBoard(board);

				// Resets board
				player = players.get(player2);
				getGridTiles_Placing();

			}

		});
		// Returning to main menu
		btn_return.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!"); // change functionality
		});
		// Firing at ships
		btn_fire.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!");

			// Get player one name
			if (player1 == player.getPlayerName()) {
				currBoard = players.get(player2).getBoard();
				player.setPlayerName(player2);
			} else {
				currBoard = players.get(player1).getBoard();
				player.setPlayerName(player1);
			}

			for (Node node : grid_firing.getChildren()) {
				if (GridPane.getRowIndex(node) > 0 && GridPane.getColumnIndex(node) > 0) {
					// Gets the image from that variable
					String properImage = currBoard.getBoard()[GridPane.getRowIndex(node)][GridPane.getColumnIndex(node)]
							.getImg();
					System.out.println(properImage);

					// Places it onto the board
					File rightImage = new File(properImage);
					Image image = new Image(rightImage.toURI().toString());
					imageViewF.setImage(image);
				}
			}

		});

		// Getting player name
		btn_name.setOnMouseClicked((

				MouseEvent e) -> {
			System.out.println("Clicked!");
			String playerName;
			nameCounter++;

			if (nameCounter == 1) {
				// Gets value from textfield
				playerName = txt_playerName.getText();
				player = new Player(playerName);
				player1 = playerName;

				// Put value into hashmap and player instance
				players.put(playerName, player);
			} else if (nameCounter == 2) {
				// Gets value from textfield
				playerName = txt_playerName.getText();
				player = new Player(playerName);
				player2 = playerName;

				// Put value into hashmap and player instance
				players.put(playerName, player);
			}

		});

		// Selecting carrier
		ship_Carrier.setOnMouseClicked((MouseEvent e) -> {
			// Tells console it's been clicked
			System.out.println("Clicked!");

			// Carrier is selected
			isCarrier = true;

			// Every other ship false
			isBattleship = false;
			isCruiser = false;
			isSubmarine = false;
			isDestroyer = false;
		});
		// Selecting battleship
		ship_Battleship.setOnMouseClicked((MouseEvent e) -> {
			// Tells console it's been clicked
			System.out.println("Clicked!");

			// Battleship is selected
			isBattleship = true;

			// Every other ship false
			isCarrier = false;
			isCruiser = false;
			isSubmarine = false;
			isDestroyer = false;
		});
		// Selecting cruiser
		ship_Cruiser.setOnMouseClicked((MouseEvent e) -> {
			// Tells console it's been clicked
			System.out.println("Clicked!");

			// Cruiser is selected
			isCruiser = true;

			// Every other ship false
			isCarrier = false;
			isBattleship = false;
			isSubmarine = false;
			isDestroyer = false;
		});
		// Selecting submarine
		ship_Submarine.setOnMouseClicked((MouseEvent e) -> {
			// Tells console it's been clicked
			System.out.println("Clicked!");

			// Submarine is selected
			isSubmarine = true;

			// Every other ship false
			isCarrier = false;
			isBattleship = false;
			isCruiser = false;
			isDestroyer = false;
		});
		// Selecting destroyer
		ship_Destroyer.setOnMouseClicked((MouseEvent e) -> {
			// Tells console it's been clicked
			System.out.println("Clicked!");

			// Destroyer is selected
			isDestroyer = true;

			// Every other ship false
			isCarrier = false;
			isBattleship = false;
			isCruiser = false;
			isSubmarine = false;
		});

	}

}

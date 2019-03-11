package controller;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ResourceBundle;

import Ships.Battleship;
import Ships.Carrier;
import Ships.Cruiser;
import Ships.Destroyer;
import Ships.Submarine;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import models.Board;
import models.Player;

public class GamePlay implements Initializable {
	// Variables
	private Player player;
	private Board board;
	HashMap<String, Player> players;

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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		resetControls();
		getGridTiles_Placing();
		clickEvents();
	}

	private void resetControls() {
		placingAnchorPane = new AnchorPane();
	}

	public void getGridTiles_Placing() {
		int rowNum = 11;
		int colLetter = 10;

		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colLetter; j++) {
				// Makes a new ImageView each time
				ImageView imageView = new ImageView();

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

			// Variable
			int counter = 0;

			// Takes in counter for chosen ship so proper checks can be made
			if (isCarrier == true) {
				Carrier carrier = new Carrier();

				// Checks that tile length is correct
				System.out.println(carrier.shipLength(tileLengthCA));
				// Checks that its horizontal or vertical
				System.out.println(carrier.shipPosition(shipPositionCA));
				counter++;

			} else if (isBattleship == true) {
				Battleship battleship = new Battleship();

				// Checks that tile length is correct
				System.out.println(battleship.shipLength(tileLengthBA));
				// Checks that its horizontal or vertical
				System.out.println(battleship.shipPosition(shipPositionBA));
				counter++;
			} else if (isCruiser == true) {
				Cruiser cruiser = new Cruiser();

				// Checks that tile length is correct
				System.out.println(cruiser.shipLength(tileLengthCR));
				// Checks that its horizontal or vertical
				System.out.println(cruiser.shipPosition(shipPositionCR));
				counter++;
			} else if (isSubmarine == true) {
				Submarine submarine = new Submarine();

				// Checks that tile length is correct
				System.out.println(submarine.shipLength(tileLengthSU));
				// Checks that its horizontal or vertical
				System.out.println(submarine.shipPosition(shipPositionSU));
				counter++;
			} else if (isDestroyer == true) {
				Destroyer destroyer = new Destroyer();

				// Checks that tile length is correct
				System.out.println(destroyer.shipLength(tileLengthDE));
				// Checks that its horizontal or vertical
				System.out.println(destroyer.shipPosition(shipPositionDE));
				counter++;
			}

			// When done placing ships
			if (counter == 5) {

			}

		});
		// Returning to main menu
		btn_return.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!"); // change functionality
		});
		// Firing at ships
		btn_fire.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!"); // change functionality
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

	private void placeShip() {

	}

}

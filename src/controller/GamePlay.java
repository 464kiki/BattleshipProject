package controller;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
				String name = generateMapCellName(i, j);
				System.out.println(name);

				ImageView imageView = new ImageView();
				// set image to imageview
				File defaultPicture = new File("src/images/water.jpg");
				Image image = new Image(defaultPicture.toURI().toString());
				System.out.println("Width: " + image.getWidth());
				System.out.println("Height: " + image.getHeight());

				imageView.setImage(image);
				imageView.setFitWidth(42);
				imageView.setFitHeight(44);

				// add imageview where image is instead
				grid_placing.add(imageView, j + 1, i + 1);

			}
		}
	}

	private String generateMapCellName(int row, int col) {
		return "Cell_" + row + "_" + col;
	}

	public void clickEvents() {
		// Ship Placing Click Event
		btn_accept.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!"); // change functionality
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
			System.out.println("Clicked!"); // change functionality
		});
		// Selecting battleship
		ship_Battleship.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!"); // change functionality
		});
		// Selecting cruiser
		ship_Cruiser.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!"); // change functionality
		});
		// Selecting submarine
		ship_Submarine.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!"); // change functionality
		});
		// Selecting destroyer
		ship_Destroyer.setOnMouseClicked((MouseEvent e) -> {
			System.out.println("Clicked!"); // change functionality
		});

	}

	private void createGame() {

	}

}

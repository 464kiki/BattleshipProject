package BattleshipViews;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/BattleshipGUI.fxml"));
			Parent root1 = loader.load();
			if (root1 == null) {
				System.out.println("Is null");
			}
			Scene scene = new Scene(root1);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//forcing an update
	public static void main(String[] args) {
		launch(args);
	}

}

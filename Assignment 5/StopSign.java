/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 14.15 
 * Shows two versions of a stop sign
 * 2017-03-20
 */

import javafx.application.*;
import javafx.collections.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class StopSign extends Application {
	@Override
	public void start(Stage stage) {
		
		// create panes
		Pane pane = new StackPane();
		Pane pane2 = new StackPane();
		
		// create an HBox and place the panes inside
		HBox box = new HBox(pane, pane2);
		box.setAlignment(Pos.CENTER);
		
		// create a polygon
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.WHITE);
		pane.getChildren().add(polygon);
		ObservableList<Double> list = polygon.getPoints();
		
		final double WIDTH = 400;
		final double HEIGHT = 200;
		double centerX = WIDTH / 2;
		double centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		
		for (int i = 0; i < 8; i++) {
			// add x and y coordinates to make points of an octagon
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
		}
		// rotate it so it looks more like a stop sign...
		polygon.setRotate(22);
		
		// create another polygon with the same points
		Polygon p2 = new Polygon();
		p2.getPoints().addAll(polygon.getPoints());
		p2.setFill(Color.RED);
		p2.setRotate(22);
		pane2.getChildren().add(p2);
		
		// create stop label for first octagon
		Label label = new Label("STOP");
		label.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 40));
		label.setTextFill(Color.WHITE);
		pane.getChildren().add(label);
		
		// create label for second octagon
		Label label2 = new Label("ARRET");
		label2.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 35));
		label2.setTextFill(Color.WHITE);
		pane2.getChildren().add(label2);
		
		// create scene and place it in the stage
		Scene scene = new Scene(box, WIDTH, HEIGHT);
		stage.setScene(scene);
		stage.show();
	
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}

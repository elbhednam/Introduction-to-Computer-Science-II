/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 14.13 
 * Creates custom pie charts
 * 2017-03-20
 */

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.*;
import java.util.*;

public class PieChart extends Application{
	@Override
	public void start(Stage stage) {
		
		// create a pane and an array for holding percentages
		Pane pane = new Pane();
		double[] percentages = new double[8];
		
		// populate the array with user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter percentages in decimal form: ");
		for (int i = 0; i < 8; i++) {
			percentages[i] = input.nextDouble() * 360;
		}
		double sum = 0;
		// create arcs for array elements greater than 0
		for (int i = 0; i < percentages.length; i++) {
			if (i == 0 && percentages[i] > 0) {
				Arc arc = new Arc(100, 100, 100, 100, sum, percentages[i]);
				arc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
				arc.setType(ArcType.ROUND);
				pane.getChildren().add(arc); // add arc to pane
			}
			else if (i > 0 && percentages[i] > 0){
				sum += percentages[i - 1];
				Arc arc = new Arc(100, 100, 100, 100, sum, percentages[i]);
				arc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
				arc.setType(ArcType.ROUND);
				pane.getChildren().add(arc); // add arc to pane
			}
		}
		// create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 350);
		stage.setScene(scene);
		stage.show(); // display the stage
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
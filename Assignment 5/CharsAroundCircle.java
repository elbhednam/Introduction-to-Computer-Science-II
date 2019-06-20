/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 14.5 
 * Creates circular text
 * 2017-03-20
 */

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class CharsAroundCircle extends Application {
	public void start(Stage stage) {
		
		// create a pane
		Pane pane = new Pane();
		
		// create a circle
		Circle circle = new Circle();
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.setFill(null);
		circle.setRadius(100);
		pane.getChildren().add(circle);
		
		// create an array of strings split into tokens
		String[] s = "My name is Amanda".split("");
		double rotation = 90;
		double angle = 0;
		// position each character and rotate it along the circle 
		for (int i = 0; i < s.length; i++) {
			angle += 19;
			rotation += 19;
			// parametric equation for a circle
			double x = circle.getCenterX() + circle.getRadius() * Math.cos(Math.toRadians(angle));
            double y = circle.getCenterY() + circle.getRadius() * Math.sin(Math.toRadians(angle));
            Text name = new Text(x, y,s[i]); // create text 
            name.setRotate(rotation);
			name.setFont(Font.font("Arial", FontWeight.MEDIUM, FontPosture.REGULAR, 30));
			pane.getChildren().add(name); // add text to pane
			
		}
		// create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 450);
		stage.setScene(scene);
		stage.show(); // display the stage
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}

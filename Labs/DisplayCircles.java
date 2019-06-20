import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;

public class DisplayCircles extends Application {
	@Override
	public void start(Stage stage) {
		
		Scene scene = new Scene(new Cpane(80),200,200);
		stage.setTitle("Circles");
		stage.setScene(scene);
		stage.show();
	}
	
	public class Cpane extends Pane {
		
		public Cpane (int radius)
		{
			
			display (radius);
		}
		public void display(double radius) {
			if (radius >= 5) {
				Circle circle = new Circle(100,100,radius);
				circle.setFill(Color.WHITE);
				circle.setStroke(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
				//circle.setStroke(Color.BLACK);
				getChildren().add(circle);
				display(radius - 5);
				
			}
		}
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

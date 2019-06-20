
import javafx.scene.image.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.effect.*;
import javafx.scene.layout.*;
import static java.lang.Math.random;
import javafx.animation.*;
import javafx.util.*;
import java.util.*;

public class Bubbles2 extends Application {

	@Override
	public void start(Stage ps) {
		
		BorderPane pane = new BorderPane();
	
		ArrayList<Circle> bubbles = new ArrayList<>();
		for (int i = 0; i < 210; i++) {
			Circle bubble = new Circle(4, Color.web("white", 0.05));
			bubble.setStrokeType(StrokeType.OUTSIDE);
			bubble.setStroke(Color.web("white", 0.16));
			bubble.setStrokeWidth(4);
			bubble.setEffect(new BoxBlur(8, 8, 3));
			bubbles.add(bubble);
			if (i < 105) {
				FillTransition ft = new FillTransition(Duration.millis(3000), bubble, Color.PINK, Color.YELLOW);
				ft.setCycleCount(Timeline.INDEFINITE);
				ft.setAutoReverse(true);
				ft.play();
			}
			else {
				FillTransition ft = new FillTransition(Duration.millis(3000), bubble, Color.AQUA, Color.MAGENTA);
				ft.setCycleCount(Timeline.INDEFINITE);
				ft.setAutoReverse(true);
				ft.play();
			}
			
			
			
		}
		
		pane.getChildren().addAll(bubbles);
		
		Timeline timeline = new Timeline();
		for (Circle bubble: bubbles) {
			timeline.getKeyFrames().addAll(
	       	        new KeyFrame(Duration.ZERO, 
	       	            new KeyValue(bubble.translateXProperty(), random() * 900),
	       	            new KeyValue(bubble.translateYProperty(), random() * 700)
	       	        ),
	       	        new KeyFrame(new Duration(80000), 
	       	            new KeyValue(bubble.translateXProperty(), random() * 900),
	       	            new KeyValue(bubble.translateYProperty(), random() * 700)
	       	        )
	       	    );
		}
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
		Pane sp = new Pane();
		Circle moon = new Circle(400, 300, 100);
		Image img = new Image("https://vignette2.wikia.nocookie.net/avatarrp/images/4/47/Moon.png/revision/latest?cb=20140826234501");
	
		moon.setStrokeType(StrokeType.OUTSIDE);
		moon.setStroke(Color.web("white", 0.06));
		moon.setStrokeWidth(4);
		moon.setFill(new ImagePattern(img));
		moon.setEffect(new BoxBlur(2, 2, 3));
		sp.getChildren().add(moon);
		
		pane.getChildren().add(sp);
		
		Scene scene = new Scene(pane, 800, 600, Color.BLACK);
		ps.setScene(scene);
		ps.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.scene.shape.*;

public class JavaFX extends Application {
	@Override
	public void start(Stage stage) {
		
		Pane pane = new Pane();
		final int WIDTH = 200;
		final int HEIGHT = 200;
		for (int i = 0; i <= 8;i++) {
			for (int j = 0; j <= 8 ;j++) {
				Rectangle r = new Rectangle(i * WIDTH / 8, j * HEIGHT / 8, WIDTH / 8, HEIGHT / 8);
				if (i % 2 == 0 && j % 2 != 0 || j % 2 == 0 && i % 2 != 0) {
					r.setFill(Color.WHITE);
				}
				else
				r.setFill(Color.BLACK);
				pane.getChildren().add(r);
			}
		}
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		stage.setTitle("Lab 7");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}

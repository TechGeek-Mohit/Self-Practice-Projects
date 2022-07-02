package eventHandling;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class MainChangeCirclecolor extends Application {	
	private final static String title = "Circle";
	public void start(Stage primaryStage) {
		try {
			//Event Handler
			
			Group root = new Group();
			
			Scene scene = new Scene(root, 600, 400);
			scene.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> putCircle(e, root));
			primaryStage.setScene(scene);
			primaryStage.setTitle(title);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Circle constructCircle(double x, double y) {
		Circle cir = new Circle();
		cir.setCenterX(x);
		cir.setCenterY(y);
		cir.setRadius(20);
		cir.setFill(Color.RED);
		//cir.setCursor(Cursor.HAND);
		return cir;
	}
	private void putCircle(MouseEvent e, Group root) {
		double x = e.getX();
		double y = e.getY();
		Circle circ = constructCircle(x, y);
		root.getChildren().add(circ);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

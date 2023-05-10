
	import javafx.application.Application;
	import javafx.collections.ObservableList;
	import javafx.scene.Scene;
	import javafx.scene.text.Font;
	import javafx.scene.text.FontWeight;
	import javafx.scene.paint.Color;
	import javafx.stage.Stage;
	import javafx.scene.control.Label;
	import javafx.scene.layout.BorderPane;
	import javafx.geometry.Pos;
	import javafx.scene.layout.StackPane;
	import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;

	public class Exercise14_28 extends Application {
		@Override // Override the start method in the Application class
		public void start(Stage primaryStage) {
			// Create a scene and place it in the stage
			 ClockPane clock = new ClockPane();
			    String timeString = clock.getHour() + ":" + clock.getMinute() 
			      + ":" + clock.getSecond();
			    clock.setSecondHandVisible(false);
			    Label lblCurrentTime = new Label(timeString);

			    // Place clock and label in border pane
			    BorderPane pane = new BorderPane();
			    pane.setCenter(clock);
			    pane.setBottom(lblCurrentTime);
			    BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

			    // Create a scene and place it in the stage
			    Scene scene = new Scene(pane, 250, 250);
			    primaryStage.setTitle("DisplayClock"); // Set the stage title
			    primaryStage.setScene(scene); // Place the scene in the stage
			    primaryStage.show(); // Display the stage
			  }

			  /**
			   * The main method is only needed for the IDE with limited
			   * JavaFX support. Not needed for running from the command line.
			   */
			  public static void main(String[] args) {
			    launch(args);
			  }
	}
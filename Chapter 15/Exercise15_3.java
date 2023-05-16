package exercise15_03;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Exercise15_3 extends Application{
	private BallPane ballPane = new BallPane();
	
	@Override 
	  public void start(Stage primaryStage) {
		
		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		Button left = new Button("Left");
		Button right = new Button("Right");
		Button up = new Button("Up");
		Button down = new Button("Down");
		hbox.getChildren().addAll(left, right, up, down);
		
		left.setOnAction(e -> ballPane.moveLeft());
		right.setOnAction(e -> ballPane.moveRight());
		up.setOnAction(e -> ballPane.moveUp());
		down.setOnAction(e -> ballPane.moveDown());
		
		BorderPane Pane = new BorderPane();
		Pane.setPadding(new Insets(5, 10, 5, 10));
		Pane.setCenter(ballPane);
		Pane.setBottom(hbox);
		
		Scene scene = new Scene(Pane, 250, 250);
	    primaryStage.setTitle("Lukes Ballgame"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show(); 
	}
	public static void main(String[] args) {
		launch(args);

	}

}

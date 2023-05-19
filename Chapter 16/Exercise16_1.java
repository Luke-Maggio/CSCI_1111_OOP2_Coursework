package exercise16_1;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

public class Exercise16_1 extends Application {
	
	protected Text text = new Text(50, 50, "Programming is fun");
	
		protected Pane getPane() {
		HBox buttonBox = new HBox(20);
		Button left = new Button("Left");
		Button right = new Button("Right");
		buttonBox.getChildren().addAll(left, right);
		buttonBox.setAlignment(Pos.CENTER);
		BorderPane pane = new BorderPane();
		pane.setBottom(buttonBox);
		
		HBox radioButtons = new HBox(20);
		RadioButton red = new RadioButton("Red");
		RadioButton yellow = new RadioButton("Yellow");
		RadioButton black = new RadioButton("Black");
		RadioButton orange = new RadioButton("Orange");
		RadioButton green = new RadioButton("Green");
		radioButtons.getChildren().addAll(red, yellow, black, orange, green);		
	
		ToggleGroup buttnGroup = new ToggleGroup();
		red.setToggleGroup(buttnGroup);
		yellow.setToggleGroup(buttnGroup);
		black.setToggleGroup(buttnGroup);
		orange.setToggleGroup(buttnGroup);
		green.setToggleGroup(buttnGroup);
	
		Pane textPane = new Pane();
		textPane.getChildren().add(text);
		pane.setCenter(textPane);
		pane.setTop(radioButtons);
		
		left.setOnAction(e -> text.setX(text.getX() - 10));
		right.setOnAction(e -> text.setX(text.getX() + 10));
		
		

		
		red.setOnAction(e -> {
			if(red.isSelected()) {
				text.setFill(Color.RED);
			}
		});
		
		yellow.setOnAction(e -> {
			if(yellow.isSelected()) {
				text.setFill(Color.YELLOW);
			}
		});
		
		black.setOnAction(e -> {
			if(black.isSelected()) {
				text.setFill(Color.BLACK);
			}
		});
		
		orange.setOnAction(e -> {
			if(orange.isSelected()) {
				text.setFill(Color.ORANGE);
			}
		});
		
		green.setOnAction(e -> {
			if(green.isSelected()) {
				text.setFill(Color.GREEN);
			}	
		});

		return pane;
		
	}
		@Override
		public void start(Stage primaryStage) {
		Scene scene = new Scene(getPane(), 450, 200);
	    primaryStage.setTitle("Exercise16_1"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}
	public static void main(String[] args) {
		launch(args);
	}
}

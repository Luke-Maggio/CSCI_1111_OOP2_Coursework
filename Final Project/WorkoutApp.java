package finalProject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WorkoutApp extends Application {
	//create an array for the number of exercises 
	private Exercise[] exercises = new Exercise[5];
	private int currentIndex = 0;
	
	//create labels with corresponding text fields for Exercise name,reps,sets
	 Label nameLabel = new Label("Exercise Name: ");
	 TextField nameField = new TextField();
	 Label repsLabel = new Label("Reps: ");
	 TextField repsField = new TextField();
	 Label setsLabel = new Label("Sets: ");
	 TextField setsField = new TextField();
	 Label messageLabel = new Label();
	 
	 //create two buttons for adding and cycling through exercises
	 private Button addButton = new Button("Add Exercise");
	 private Button nextButton = new Button("Next Exercise");
	 
	 public static void main(String[] args) {
		 launch(args);
	 }
	 
	@Override
	public void start(Stage primaryStage) {
		exercises[0] = new Exercise("Push ups", 20, 3 );
		exercises[1] = new Exercise("Sit ups", 15, 3);
		exercises[2] = new Exercise("Pull ups (Can be assisted)", 10, 3);
		exercises[3] = new Exercise("Air Squats", 20, 3);
		exercises[4] = new Exercise("Lunges (reps are for each leg)", 15, 3);
		
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		
		pane.add(nameLabel, 0, 0);
		pane.add(nameField, 1, 0);
		pane.add(repsLabel, 0, 1);
		pane.add(repsField, 1, 1);
		pane.add(setsLabel, 0, 2);
		pane.add(setsField, 1, 2);
		pane.add(addButton, 0, 3);
		pane.add(messageLabel, 1, 3);
		pane.add(nextButton, 0, 4);
		
		addButton.setOnAction(e -> addExercise());
		nextButton.setOnAction(e -> nextExercise());
		
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Workout App");
		primaryStage.show();
		
	}
	
	private void addExercise() {
		String name = nameField.getText();
		int reps = Integer.parseInt(repsField.getText());
		int sets = Integer.parseInt(setsField.getText());
		
		Exercise exercise = new Exercise(name, reps, sets);
		exercises[currentIndex] = exercise;
		messageLabel.setText("Exercise Added: " + exercise.getName());
		
		currentIndex++;
		if (currentIndex >= 5) {
			currentIndex = 0;
		}
	}
	
	private void nextExercise() {
		
		
	}

}

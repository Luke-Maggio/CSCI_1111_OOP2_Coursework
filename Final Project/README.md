# Workout App
## Synopsis: This software is for a workout app that allows the user to scroll through different pre-determined exercises that they may like to implement in their workout routine. It also allows the user enter the name of a preferred exercise they would like to perform along with the reps and sets and add that exercise to the app inventory.
## Motivation: I built this app because it combines my interest in fitness along with my interest in software development
## The workout app and exercise classes are needed to run this program. The workout app is the main file to run that prompts the user for their workout routine.
[WorkoutApp](ScreenShot1.png)
## Code Example: Code for creating the exercises along with their name, reps, and sets. 
```
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
   ```
   ##

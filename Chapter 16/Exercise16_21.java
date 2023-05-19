package exercise16_21;


import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;
import javafx.scene.input.KeyCode;
import javafx.animation.KeyFrame;
import javafx.util.Duration;


public class Exercise16_21 extends Application {
	private TextField txtField = new TextField();
	private static final String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
    protected Media media = new Media(MEDIA_URL);
	protected MediaPlayer mediaPlayer = new MediaPlayer(media);

	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		txtField.setAlignment(Pos.CENTER);
		txtField.setFont(Font.font(60));
		txtField.setPrefColumnCount(4);
	    
	    StackPane pane = new StackPane(txtField);
	    Timeline animation = new Timeline(
	    		new KeyFrame(Duration.millis(1000), e -> run()));
	    	animation.setCycleCount(Timeline.INDEFINITE);
	    	
	    	txtField.setOnKeyPressed(e -> {
	    		if (e.getCode() == KeyCode.ENTER) {
	    			animation.play();
	    		}
	    	});
	    	
	        Scene scene = new Scene(pane);
	        primaryStage.setTitle("Exercise16_21"); 
	        primaryStage.setScene(scene); 
	        primaryStage.show();    
	  }
	    	
	  private void run() {
		  if(Integer.parseInt(txtField.getText()) > 0) {
			  txtField.setText(String.valueOf(
				Integer.parseInt(txtField.getText()) - 1));	  ;
		  }
		  if (txtField.getText().equals("0")) {
			  mediaPlayer.play();
		  }
	    	
	  }
	public static void main(String[] args) {
		launch(args);
	}

}

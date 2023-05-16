package exercise15;

import javafx.application.Application;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;

public class Exercise15 extends Application {

		private double pentRadius = 200;
		private double rectSize = 50;
		private Duration AniDuration = Duration.seconds(5);
		
		private Parent content() {
			StackPane stackpane = new StackPane();
			
			Path path = PentPath();
			Rectangle rect1 = new Rectangle(rectSize, rectSize);
			rect1.setFill(Color.BLUE);
			rect1.setOpacity(5);
			
			PathTransition anim1 = new PathTransition(AniDuration, path, rect1);
			anim1.setCycleCount(Animation.INDEFINITE);
			anim1.setAutoReverse(true);
			stackpane.getChildren().addAll(path, rect1);
			
			stackpane.setOnMouseClicked((MouseEvent event) -> {
				if (event.getButton().equals(MouseButton.PRIMARY)) {
					if (anim1.getStatus() == Animation.Status.PAUSED) {
						anim1.play();
						} else {
							anim1.pause();
						}
					}
			});
			
		rect1.opacityProperty().bind(rect1.translateXProperty().add(rect1.translateYProperty()).divide(pentRadius * 2));
		return stackpane;
		}
		
		private Path PentPath() {
			double centerX = 0;
			double centerY = 0;
			
			Path path = new Path();
			path.getElements().add(new MoveTo(centerX + pentRadius, centerY));
			
			for (int i = 1; i < 5;  i++ ) {
				double angle = 2 * Math.PI/5 * i;
			
			double x = centerX + pentRadius * Math.cos(angle);
			double y = centerY + pentRadius * Math.sin(angle);
			path.getElements().add(new LineTo(x,y));
			}
			
			path.getElements().add(new LineTo(centerX + pentRadius, centerY));
			return path; 
			}
		@Override
		public void start(Stage primaryStage) {
			Scene scene = new Scene(content(), 800, 600);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	public static void main(String[] args) {
		launch(args);

	}

}

package exercise15_03;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class BallPane extends Pane {
	private Circle circle = new Circle(20,20,20);
	private final int moveDistance = 20;
	private final int Radius = 20;
	
	public BallPane() {
		circle.setFill(Color.RED);
		circle.setStroke(Color.BLACK);
		getChildren().add(circle);
	}
	
	public void moveLeft() {
		if ((circle.getCenterX() - moveDistance) >= Radius) {
			circle.setCenterX(circle.getCenterX() - moveDistance);
		}
	}
	
	public void moveRight() {
		if((circle.getCenterX() + moveDistance) <= (getWidth() - Radius)) {
			circle.setCenterX(circle.getCenterX() + moveDistance);
		}
	}
	
	public void moveUp() {
		if ((circle.getCenterY() - moveDistance) >= Radius) {
			circle.setCenterY(circle.getCenterY() - moveDistance);
		}
	}
	
	public void moveDown() {
		if ((circle.getCenterY() + moveDistance) <= (getHeight() - Radius)) {
			circle.setCenterY(circle.getCenterY() + moveDistance);
		}
	}
}

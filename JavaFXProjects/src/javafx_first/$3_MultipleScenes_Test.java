package javafx_first;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class $3_MultipleScenes_Test extends Application{
	
	Stage window;
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		Label label1 = new Label("This is the homescreen");
		Button button1 = new Button("Go to the scene two");
		button1.setOnAction(e -> window.setScene(scene2));
		
		VBox layout1 = new VBox(50);
		layout1.getChildren().addAll(label1,button1);
		scene1 = new Scene(layout1,600,400);
		
		Label label2 = new Label("welcome to the scene two");
		Button button2 = new Button("Go back to the first scene");
		button2.setOnAction(e -> window.setScene(scene1));
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().addAll(label2,button2);
		scene2 = new Scene(layout2,600,400);
		
		window.setScene(scene1);
		window.setTitle("welcome to the scene builder");
		window.show();
	}

}

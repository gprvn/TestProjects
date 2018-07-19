package javafx_first;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class First extends Application{
	
	Button save;
	Button cancel;
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Main Window");
		
		save = new Button();
		save.setText("Save");
		
		cancel = new Button();
		cancel.setText("Cancel");
		
		StackPane saveLayout = new StackPane();
		saveLayout.getChildren().add(save);
		
		saveLayout.getChildren().add(cancel);
		
		Scene scene1 = new Scene(saveLayout, 300, 150);
		primaryStage.setScene(scene1);
//		primaryStage.setScene(scene2);
		primaryStage.show();
	}
}

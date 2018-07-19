package javafx_first;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class $3_AnnonymousEventClass extends Application{
	
	Button save;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Welcome");
		save = new Button();
		save.setText("Save");
		
		save.setOnAction(e -> System.out.println("lambda print"));
		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(save);
		Scene scene = new Scene(stackPane, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

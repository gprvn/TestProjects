package javafx_first;
//sample commects
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class $2_Events extends Application implements EventHandler<ActionEvent>{
	Button save;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Event Window");
		
		save = new Button();
		save.setText("Save");
		
		save.setOnAction(this);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(save);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void handle(ActionEvent event) {
		if(event.getSource() == save) {
			System.out.println("data is saved");
		}
	}

}

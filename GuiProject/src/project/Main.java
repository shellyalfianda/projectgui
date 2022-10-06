package project;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
BorderPane data;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label lb = new Label("Pick A Number");
		Button btn = new Button("Generate");
		VBox data2 = new VBox();
		data2.getChildren().addAll(lb,btn);
		data = new BorderPane(data2);
		data.setCenter(data2);
		Scene sc = new Scene(data,600,600);
		primaryStage.setScene(sc);
		btn.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				Integer random = (int)(Math.random()*100);
				String randomStr = random.toString();
				Label lb1 = new Label(randomStr);
				data2.getChildren().add(lb1);
			}
		});
		primaryStage.show();
		

	}
}

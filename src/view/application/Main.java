package view.application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	

	public static FXMLLoader loader;
	
	public void start(Stage primaryStage) {
		try {
			loader= new FXMLLoader(getClass().getResource("/view/Main.fxml"));
			Parent root = loader.load();
			//Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("/view/application.application.css").toExternalForm());
			primaryStage.setScene(new Scene(root, 500,500));
			primaryStage.show();
	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package view;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import view.application.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Tab1Controller implements Initializable{
	

	 @FXML private Label lbl_1;
	 @FXML private Button btn1;
	 @FXML private Tab2Controller tab2contentController;
	 
	 private int counter=0;
	 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
	@FXML public void resetCounter2(ActionEvent e) throws IOException{
			
			
			MainController m = Main.loader.getController();
			m.tab2contentController.resetCounter();
		    System.out.println("Hhjskjfd");
		
	}

	public void resetCounter() {
		counter = 0;
		lbl_1.setText(""+counter);

	}
	
	
	public void addViewCounter(){
		counter++;
		lbl_1.setText(""+counter);
	}
}

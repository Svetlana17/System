package view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import view.application.Tab3Controller;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{
	
	@FXML private Tab tab1;
	@FXML private Tab tab2;
	@FXML private Tab tab3;
	@FXML private TabPane pane;
	@FXML public Tab1Controller tab1contentController;
	@FXML public Tab2Controller tab2contentController;
	@FXML public Tab3Controller tab3Controller;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	    pane.getSelectionModel().selectedItemProperty()
        .addListener((obs, oldTab, newTab) -> {
            if (newTab == tab1) {
                tab1contentController.addViewCounter();
            } else if (newTab == tab2) {
                tab2contentController.addViewCounter();
            }
            else  if(newTab == tab3){
            	System.out.println("This Tab 3");
            	//tab3Controller.addViewCounter();
			}
        });
	}
	
	

}
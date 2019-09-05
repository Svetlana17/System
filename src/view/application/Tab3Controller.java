package view.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.Tab2Controller;

public class Tab3Controller {

    @FXML
    private Label lbl_1;
    @FXML private Button btn1;
    @FXML private Tab2Controller tab2contentController;
    @FXML
    private  ComboBox<String> cmb = new ComboBox<>();
    private int counter=0;




    public void addViewCounter() {
        counter++;
        lbl_1.setText(""+counter);
    }

    public void resetCounter2(ActionEvent actionEvent) {
        counter = 0;
        lbl_1.setText(""+counter);
    }




    public void start(ActionEvent actionEvent) {

        //cmb.getItems().addAll(LISTA);
        System.out.println(cmb);
    }

    public void comboox(ActionEvent actionEvent) {
        System.out.println(cmb.getItems()); //получить все знания
        System.out.println(cmb.getValue()); // получить выбранное значение
    }
}

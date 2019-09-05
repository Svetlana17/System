package fxapps;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ComboBoxAutoCompleteTest extends Application {

	private static final String[] LISTA = { "Abacate", "Abacaxi", "Ameixa", "Amora", "Araticum", "Atemoia", "Avocado",
			"Banana prata", "Caju", "Cana descascada", "Caqui", "Caqui Fuyu", "Carambola", "Cereja", "Coco verde",
			"Figo", "Figo da Índia", "Framboesa", "Goiaba", "Graviola", "Jabuticaba", "Jambo", "Jambo rosa", "Jambolão",
			"Kino (Kiwano)", "Kiwi", "Laranja Bahia", "Laranja para suco", "Laranja seleta", "Laranja serra d’água",
			"Laranjinha kinkan", "Lichia", "Lima da pérsia", "Limão galego", "Limão Taiti", "Maçã argentina",
			"Maçã Fuji", "Maçã gala", "Maçã verde", "Mamão formosa", "Mamão Havaí", "Manga espada", "Manga Haden",
			"Manga Palmer", "Manga Tommy", "Manga Ubá", "Mangostim", "Maracujá doce", "Maracujá para suco", "Melancia",
			"Melancia sem semente", "Melão", "Melão Net", "Melão Orange", "Melão pele de sapo", "Melão redinha",
			"Mexerica carioca", "Mexerica Murcote", "Mexerica Ponkan", "Mirtilo", "Morango", "Nectarina",
			 };

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		ComboBox<String> cmb = new ComboBox<>();
		cmb.setTooltip(new Tooltip());
		cmb.getItems().addAll(LISTA);
		stage.setScene(new Scene(new StackPane(cmb)));
		stage.show();
		stage.setTitle("Filtrando um ComboBox");
		stage.setWidth(300);
		stage.setHeight(300);
		//new ComboBoxAutoComplete<String>(cmb);
		System.out.println(cmb.selectionModelProperty());
	}

}

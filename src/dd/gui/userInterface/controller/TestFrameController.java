package dd.gui.userInterface.controller; /**
 * Sample Skeleton for 'testframe.fxml' Controller Class
 */

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Observable;
import java.util.ResourceBundle;

import dd.db.crud.Crud;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import javax.swing.event.ListSelectionListener;

public class TestFrameController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="spellResultList"
    private ListView<String> spellResultList; // Value injected by FXMLLoader

    @FXML // fx:id="SearchBtn"
    private Button SearchBtn; // Value injected by FXMLLoader

    @FXML // fx:id="spellSearchBar"
    private TextField spellSearchBar; // Value injected by FXMLLoader

    @FXML // fx:id="spellDetails"
    private TextArea spellDetails; // Value injected by FXMLLoader


    @FXML
    void SpellSearchOnMouseClick(MouseEvent event) {
        String search = spellSearchBar.getText();
        Crud crud = new Crud();

        LinkedHashMap<String, String[]> results = new LinkedHashMap<>();
        results = crud.searchSpellByWord(search);

        ObservableList<String> obsList = FXCollections.observableArrayList(results.keySet());
        spellResultList.setItems(obsList);
    }

    @FXML
    void SpellResultListSelected (MouseEvent event){

        spellDetails.clear();

        String selected = spellResultList.getSelectionModel().getSelectedItem();

        if (selected != null) {
            Crud crud = new Crud();
            String[] details = crud.searchSpellByName(selected);

            for (int i = 0; i < details.length; i++) {

                spellDetails.appendText(details[i]+"\n");
            }
        } else {

            spellDetails.insertText(0,"");
        }

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }
}


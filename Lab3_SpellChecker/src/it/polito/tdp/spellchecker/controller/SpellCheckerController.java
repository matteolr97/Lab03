package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SpellCheckerController {
	private Dictionary dictionary;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> txtLanguage;
    

    @FXML
    private TextArea txtInsert;

    @FXML
    private Button btnCheck;

    @FXML
    private TextArea txtResult;

    @FXML
    private TextField txtError;

    @FXML
    private Button btnClear;

    @FXML
    private TextField txtTime;

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtLanguage != null : "fx:id=\"txtLanguage\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnCheck != null : "fx:id=\"btnCheck\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtError != null : "fx:id=\"txtError\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'SpellChecker.fxml'.";

    }

	public void setModel(Dictionary model) {
		this.dictionary = model;
		txtLanguage.getItems().addAll("English", "Italian");		
	}
   
}

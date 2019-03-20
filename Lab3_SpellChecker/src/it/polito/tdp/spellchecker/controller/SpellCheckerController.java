package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import it.polito.tdp.spellchecker.model.RichWord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SpellCheckerController {
	public Dictionary model;
	private String lingua;
	String parole = "";
	List<String> par  =new LinkedList<String>();
	int counter = 0;
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
    void doLanguage(ActionEvent event) {
    
    }

    @FXML
    void doClearText(ActionEvent event) {
    	txtResult.clear();
    	txtError.clear();
    	txtInsert.clear();
    	txtTime.clear();
    		
    }

    @FXML
    void doSpellCheck(ActionEvent event) {
    	lingua = txtLanguage.getValue();
    	if(lingua!=null)
    		{
    		model.loadDictionary(lingua);
    		txtResult.appendText("SSSS");
    		}
    	
    	txtResult.clear();
    	parole  = txtInsert.getText().toLowerCase();    	
    	parole = parole.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]\"]", "");
    	par.addAll(Arrays.asList(parole.split("\\s+")));
    	List<RichWord>paroleRich= new LinkedList<RichWord>();
    	//List<RichWord>errate= new LinkedList<RichWord>();

    	paroleRich = model.spellCheckText(par);
    	for(RichWord r: paroleRich) {
    		if(r.isGiusto() == false) {
    			counter++;
    			txtResult.appendText(r.getParolaInserita()+"\n");}
    			
    	}
    	txtError.appendText("There are"+counter+" errors!");

    	txtTime.appendText(System.nanoTime()+"\n");
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
		this.model = model;
		txtLanguage.getItems().addAll("English", "Italian");		
	}
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML;

import classes.controleEquipamento;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author a1502549
 */
public class FXMLDocumentControllerAtualizar implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField nome;

    @FXML
    private TextField ip;

    controleEquipamento CE = new controleEquipamento();

    private void handleButtonAction(ActionEvent event) {
        CE.setNome(nome.toString());
        CE.setIp(ip.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CE.getNome();
        CE.getIp();
    }

}

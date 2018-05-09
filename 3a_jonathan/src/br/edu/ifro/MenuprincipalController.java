/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 79643035204
 */
public class MenuprincipalController implements Initializable {
    
    @FXML
    private TextField txt1,txt2,txtr;
    
    @FXML
    private Button btn;
   
    
    @FXML
    public void btn (ActionEvent event) {
    Double t1 = Double.parseDouble(txt1.getText());
    Double t2 = Double.parseDouble(txt2.getText());
    Double tr = t1 + t2;
    
    txtr.setText(tr.toString());

}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar aluno");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){


}
}
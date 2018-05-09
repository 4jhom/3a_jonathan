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
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author 79643035204
 */
public class MeuprincipalController implements Initializable {

    @FXML
    private AnchorPane btn;
    @FXML
    private JFXTextField txt1;
    @FXML
    private JFXTextField txt2;
    @FXML
    private JFXTextField txtr;
    @FXML
    private MenuItem abrirCadastroAluno;
    @FXML
    private MenuItem FecharProjeto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    
        try{
    FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("aluno.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 682);
        Stage stage = new Stage();
        stage.setTitle("Cadastrar aluno");
        stage.setScene(scene);
        stage.show();
    }
    catch(IOException e
            
 ){

}

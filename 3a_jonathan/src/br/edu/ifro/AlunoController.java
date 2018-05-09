/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.modelo.aluno;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * FXML Controller class
 *
 * @author 79643035204
 */
public class AlunoController implements Initializable {

    @FXML
    private JFXButton salvar;
    @FXML
    private JFXButton fecharprojeto;

     @FXML
    private TextField nome ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void fecharProjeto(ActionEvent event){
        
    }
    @FXML
    private void salvar(ActionEvent event){
        EntityManagerFactory = persistence.createEntityMenagerFactory("aula");
        EntityManager em = emf.createEntityManeger();
        
        aluno aluno1 = new aluno ();
        aluno.setNome(nome.getText()):
        
        em.getTransaction().begin();
        
        em.persist(aluno);
        
        em.getTransaction().commit();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaexercise;

import jars.PersonJpaController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author emz5051
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("JpaExercisePU");
        Person dude = new Person();
        dude.setFirstName("Ethan");
        
        PersonJpaController jpaPerson = new PersonJpaController(emf);
        
        jpaPerson.create(dude);
    }    
    
}

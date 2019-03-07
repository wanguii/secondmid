/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_beatrice;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 *
 * @author hp
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
   GridPane gridpane;
    
    String d[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String t[] = new String[]{"Time", "8:00-9:00" , "4:00-6:00"}; 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       // Label.abel = new Label ("Label");
        gridpane.add(new Label("Monday"), 1,0);
         gridpane.add(new Label("Tuesday"), 2,0);
         gridpane.add(new Label("Wednesday"), 3,0);
          gridpane.add(new Label("Thursday"), 4,0);
           gridpane.add(new Label("Friday"), 5,0);
            gridpane.add(new Label("Time"), 0,0);
             gridpane.add(new Label("8:00-9:00 AM"), 0,1);
              gridpane.add(new Label("4:00-6:00 AM"), 0,2);
               gridpane.add(new Label("AI & Blockchain"), 1,1);
                gridpane.add(new Label("Java 002"), 4,1);
                 gridpane.add(new Label("Java 003"), 5,2);
                 
                 
        for(int col = 0; col<d.length; col++){
        for(int row = 0; row<t.length; row++){
       //  gridpane.add(new Label(t [row]), col,row);
        // gridpane.add(new Label(d [col]), col,row);
        }
        }
       
        
    }    
    
}

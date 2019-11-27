package sample;

//import java.awt.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button cancelButton;
    @FXML
    private Button helpButton;

    @FXML
    public void onOkayClicked(){
        System.out.println("Okay, your name is "+ nameField.getText());
    }

    @FXML
    public void onClicked(ActionEvent e){
        if(e.getSource().equals(cancelButton)){
            System.out.println("Cancel");
        }else if(e.getSource().equals(helpButton)){
            System.out.println("Help");
        }
    }
}

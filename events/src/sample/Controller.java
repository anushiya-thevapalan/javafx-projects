package sample;

//import java.awt.*;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
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
    private Button okayButton;
    @FXML
    private CheckBox clearFieldCheck;

    @FXML
    public void initialize(){
        okayButton.setDisable(true);
    }

    @FXML
    public void onOkayClicked(){
        System.out.println("Okay, your name is "+ nameField.getText());
        if(clearFieldCheck.isSelected()){
            nameField.clear();
            okayButton.setDisable(true);
        }
    }

    @FXML
    public void onClicked(ActionEvent e){
        if(e.getSource().equals(cancelButton)){
            System.out.println("Cancel");
        }else if(e.getSource().equals(helpButton)){
            System.out.println("Help");
        }
    }

    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButton = text.isEmpty() || text.trim().isEmpty();
        okayButton.setDisable(disableButton);
    }
}

package sample;

//import java.awt.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField name;
    public void onOkayClicked(){
        System.out.println("Okay, your name is "+ name.getText());
    }

    public void onCancelClicked(){
        System.out.println("Cancel");
    }
}

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class StartController {

    public   ArrayList[][] t;

    @FXML
    private GridPane Game_GridPane;

    @FXML
    private VBox Score_VBox;

    @FXML
    private Pane NextBlock_Pane;

    @FXML
    private Rectangle test;

    @FXML
    private void btn_MainMenu(ActionEvent event){
        System.out.println("Button: \"btn_MainMenu\" was pressed");

    }

    @FXML
    private void btn_QuitGame(ActionEvent event){
        System.out.println("Button: \"btn_QuitGame\" was pressed");
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    public void initialize(){
        Game_GridPane.getChildren().add(GameFunctions.setGame_GridPane(10, 20, 20, Color.RED, Color.GRAY));
    }


}

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField text_field;

    //this is used to limit the types of characters that can be entered into the text field
    //if a character that is not in the list gets inputted it removes all characters that
    @FXML
    public void initialize() {
        text_field.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*|\\+*|\\-*|\\**|\\/|\\%|\\(|\\)|s|q|r|t|i|n|a|c|o|\\.")) {
                text_field.setText(newValue.replaceAll("[^(\\d*|\\+*|\\-*|\\**|\\/|\\%|\\(|\\)|s|q|r|t|i|n|a|c|o|\\.)]", ""));
            }
        });
    }

    @FXML
    private void btn_1(ActionEvent event){
        System.out.println("Button: \"btn_1\" was pressed");
        text_field.setText(text_field.getText() + "1");
    }
    @FXML
    private void btn_2(ActionEvent event){
        System.out.println("Button: \"btn_2\" was pressed");
        text_field.setText(text_field.getText() + "2");
    }
    @FXML
    private void btn_3(ActionEvent event){
        System.out.println("Button: \"btn_3\" was pressed");
        text_field.setText(text_field.getText() + "3");
    }
    @FXML
    private void btn_add(ActionEvent event){
        System.out.println("Button: \"btn_add\" was pressed");
        text_field.setText(text_field.getText() + "+");
    }
    @FXML
    private void btn_sin(ActionEvent event){
        System.out.println("Button: \"btn_sin\" was pressed");
        text_field.setText(text_field.getText() + "sin(");
    }
    @FXML
    private void btn_C(ActionEvent event){
        System.out.println("Button: \"btn_sin\" was pressed");
        text_field.setText("");
    }


    @FXML
    private void btn_4(ActionEvent event){
        System.out.println("Button: \"btn_4\" was pressed");
        text_field.setText(text_field.getText() + "4");
    }
    @FXML
    private void btn_5(ActionEvent event){
        System.out.println("Button: \"btn_5\" was pressed");
        text_field.setText(text_field.getText() + "5");
    }
    @FXML
    private void btn_6(ActionEvent event){
        System.out.println("Button: \"btn_6\" was pressed");
        text_field.setText(text_field.getText() + "6");
    }
    @FXML
    private void btn_sub(ActionEvent event){
        System.out.println("Button: \"btn_sub\" was pressed");
        text_field.setText(text_field.getText() + "-");
    }
    @FXML
    private void btn_cos(ActionEvent event){
        System.out.println("Button: \"btn_cos\" was pressed");
        text_field.setText(text_field.getText() + "cos(");
    }
    @FXML
    private void btn_tan(ActionEvent event){
        System.out.println("Button: \"btn_sin\" was pressed");
        text_field.setText(text_field.getText() + "tan(");
    }


    @FXML
    private void btn_7(ActionEvent event){
        System.out.println("Button: \"btn_7\" was pressed");
        text_field.setText(text_field.getText() + "7");
    }
    @FXML
    private void btn_8(ActionEvent event){
        System.out.println("Button: \"btn_8\" was pressed");
        text_field.setText(text_field.getText() + "8");
    }
    @FXML
    private void btn_9(ActionEvent event){
        System.out.println("Button: \"btn_9\" was pressed");
        text_field.setText(text_field.getText() + "9");
    }
    @FXML
    private void btn_multi(ActionEvent event){
        System.out.println("Button: \"btn_multi\" was pressed");
        text_field.setText(text_field.getText() + "*");
    }
    @FXML
    private void btn_percent(ActionEvent event){
        System.out.println("Button: \"btn_percent\" was pressed");
        text_field.setText(text_field.getText() + "%");
    }
    @FXML
    private void btn_par1(ActionEvent event){
        System.out.println("Button: \"btn_sin\" was pressed");
        text_field.setText(text_field.getText() + "(");
    }


    @FXML
    private void btn_comma(ActionEvent event){
        System.out.println("Button: \"btn_comma\" was pressed");
        text_field.setText(text_field.getText() + ",");
    }
    @FXML
    private void btn_0(ActionEvent event){
        System.out.println("Button: \"btn_0\" was pressed");
        text_field.setText(text_field.getText() + "0");
    }
    @FXML
    private void btn_equals(ActionEvent event){
        System.out.println("Button: \"btn_equals\" was pressed");

        text_field.setText(Functions.calc(text_field.getText()));
    }
    @FXML
    private void btn_divide(ActionEvent event){
        System.out.println("Button: \"btn_divide\" was pressed");
        text_field.setText(text_field.getText() + "/");
    }
    @FXML
    private void btn_root(ActionEvent event){
        System.out.println("Button: \"btn_root\" was pressed");
        text_field.setText(text_field.getText() + "sqrt(");
    }
    @FXML
    private void btn_par2(ActionEvent event){
        System.out.println("Button: \"btn_sin\" was pressed");
        text_field.setText(text_field.getText() + ")");
    }
}

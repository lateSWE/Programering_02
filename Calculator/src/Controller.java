import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Controller {

    @FXML
    private TextField text_field;


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
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String calc = format(text_field.getText());
        try {
            text_field.setText(engine.eval(calc).toString());
            System.out.println(calc);
            System.out.println("Equals: " + engine.eval(calc).toString());
        } catch (ScriptException e) {
            e.printStackTrace();
        }
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






    private String format(String in){

        in = parentheses(in);

        in = in.replaceAll("sqrt", "Math.sqrt ");
        in = in.replaceAll("sin", "Math.sin ");
        in = in.replaceAll("cos", "Math.cos ");
        in = in.replaceAll("tan", "Math.tan ");

        return in;
    }

    private String parentheses(String in){
        while (AmountOfCharInString(in, '(') > AmountOfCharInString(in, ')')){
            in = in.concat(")");
            System.out.println("Added a \")\"");
        }
        return in;
    }

    private int AmountOfCharInString(String in, char CharIn){
        int out=0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == CharIn){
                out++;
            }
        }
        return out;
    }
}

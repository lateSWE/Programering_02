package Flags;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Denmark extends Flag {
    @Override
    public String getName() {
        return "Denmark";
    }

    @Override
    public Node renderFlag() {
        StackPane flagContainer = new StackPane();
        flagContainer.setAlignment(Pos.CENTER);

        Rectangle red = new Rectangle();
        red.setWidth(400);
        red.setHeight(200);
        red.setFill(Color.rgb(255, 0, 0));

        Rectangle white1 = new Rectangle();
        white1.setWidth(40);
        white1.setHeight(200);
        white1.setTranslateY(0);
        white1.setTranslateX(-50);
        white1.setFill(Color.rgb(255, 255, 255));

        Rectangle white2 = new Rectangle();
        white2.setWidth(400);
        white2.setHeight(40);
        white2.setTranslateY(0);
        white2.setTranslateX(0);
        white2.setFill(Color.rgb(255, 255, 255));

        flagContainer.getChildren().add(red);
        flagContainer.getChildren().add(white1);
        flagContainer.getChildren().add(white2);

        return flagContainer;
    }
}
package Flags;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class France extends Flag {
    @Override
    public String getName() {
        return "France";
    }

    @Override
    public Node renderFlag() {
        StackPane flagContainer = new StackPane();
        flagContainer.setAlignment(Pos.CENTER);

        Rectangle blue = new Rectangle();
        blue.setWidth(133);
        blue.setHeight(200);
        blue.setFill(Color.rgb(0, 0, 255));
        blue.setTranslateX(-133);
        blue.setTranslateY(0);

        Rectangle white = new Rectangle();
        white.setWidth(133);
        white.setHeight(200);
        white.setFill(Color.rgb(255, 255, 255));
        white.setTranslateX(0);
        white.setTranslateY(0);

        Rectangle red = new Rectangle();
        red.setWidth(133);
        red.setHeight(200);
        red.setFill(Color.rgb(255, 0, 0));
        red.setTranslateX(133);
        red.setTranslateY(0);

        flagContainer.getChildren().add(blue);
        flagContainer.getChildren().add(white);
        flagContainer.getChildren().add(red);

        return flagContainer;
    }
}
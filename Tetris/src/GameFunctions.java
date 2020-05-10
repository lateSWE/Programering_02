import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class GameFunctions{
    public static GridPane setGame_GridPane(int BoxesInX, int BoxesInY, int BoxSize, Paint BackColor, Paint BorderColor){
        GridPane tempGridPane = new GridPane();
        for (int i = 0; i < BoxesInY; i++) {
            for (int j = 0; j < BoxesInX; j++) {
                Rectangle tempRectangle = new Rectangle(BoxSize, BoxSize);
                tempRectangle.setFill(BackColor);
                tempRectangle.setStroke(BorderColor);



                tempGridPane.setId(i + "," + j);


                tempGridPane.add(tempRectangle, j, i);
            }
        }

        System.out.println(tempGridPane);


        return tempGridPane;
    }

    private static void setRectangleAA(int x, int y){

    }

    private void ChangeColor(int x, int y, Paint NewColor, GridPane gp){

    }
}

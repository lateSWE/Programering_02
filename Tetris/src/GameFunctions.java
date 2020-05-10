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


                tempRectangle.setId(j + "," + i);


                tempGridPane.add(tempRectangle, j, i);

                System.out.print("[");
                System.out.print(j + "  " + i);
                System.out.print("][");
                System.out.print(tempRectangle.getId());
                System.out.println("]");
            }
        }

        System.out.println(tempGridPane);

        System.out.println(tempGridPane.getColumnConstraints());
        System.out.println(tempGridPane.getRowConstraints());

        System.out.println();

        return tempGridPane;
    }

    private static void setRectangleAA(int x, int y){

    }

    private void ChangeColor(int x, int y, Paint NewColor, GridPane gp){

    }
}

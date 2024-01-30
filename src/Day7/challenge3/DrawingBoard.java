package Day7.challenge3;

import java.util.ArrayList;

public class DrawingBoard {
    private ArrayList<Drawable> shapes;

    public DrawingBoard() {
        shapes = new ArrayList<>();
    }

    public void addShape(Drawable shape) {
        shapes.add(shape);
    }

    public void displayAllShapes() {
        for (Drawable shape : shapes) {
            if (shape instanceof Shape) {
                ((Shape) shape).displayShapeType();
            }
        }
    }

    public void drawAllShapes() {
        for (Drawable shape : shapes) {
            shape.drawShape();
        }
    }

}

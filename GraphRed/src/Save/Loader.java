package Save;

import graphred.MyCanvas;
import graphred.shapes.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Loader {
    public Loader(MyCanvas jp) throws IOException {
        SaveShapeQueue shapes = new SaveShapeQueue();
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            try {
                shapes = (SaveShapeQueue) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            Queue queue = Queue.singleton();
            //refresh();
            for (SaveShape saveShape : shapes.getShapes()) {
                queue.setCurrColor(saveShape.getColor());
                if (saveShape.getType().equals("Ellipse")) {
                    queue.addShape(new Ellipse());
                } else if (saveShape.getType().equals("Rectangle")) {
                    queue.addShape(new RectShape());
                } else if (saveShape.getType().equals("Polygon")) {
                    queue.addShape(new Poligon());
                } else if (saveShape.getType().equals("Polyline")) {
                    queue.addShape(new Line());
                } else throw new RuntimeException("problem");
                if (saveShape.getPoints().size() != 0) {
                    queue.getLastShape().setCoordinates(saveShape.getPoints());
                }
            }
            jp.PaintToBuffer();
            jp.repaint();
        }
    }
}
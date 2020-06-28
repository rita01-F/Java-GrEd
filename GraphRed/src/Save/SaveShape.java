package Save;

import graphred.shapes.BaseShape;

import java.awt.*;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;

public class SaveShape implements Serializable {
    private static final long serialVersionUID = 1L;
    private String type;
    private List<Point2D> points;
    private Color color;

    public SaveShape(BaseShape shape){
        setType(shape.getType());
        setPoints(shape.getPoints());
        setColor(shape.getColor());
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPoints(List <Point2D> points) {
        this.points = points;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public List<Point2D> getPoints() {
        return points;
    }

    public Color getColor() {
        return this.color;
    }


}

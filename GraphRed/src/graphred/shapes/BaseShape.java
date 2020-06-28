/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author George
 */
public abstract class BaseShape implements Serializable {
    abstract public void addCoordinate(Point2D point);
    abstract public void putCanvasCoordinate(Point2D point);
    abstract public void paintShape(Graphics g);
    abstract public void setColor(Color color);
    abstract public Color getColor();
    abstract public String getType();
    abstract public void setShape();
    abstract public List<Point2D> getPoints();
    abstract public void setCoordinates(List<Point2D> point);
}

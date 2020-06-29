/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * @author George
 */
public class RectShape extends BaseShape {
    private Color shapeColor;
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private int xp, yp;
    private Shape shape;
    private List<Point2D> coordinates;
    private Point2D p;

    public RectShape() {
        coordinates = new ArrayList<Point2D>();
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
        coordinates.add(new Point2D.Double(x1,y1));
        coordinates.add(new Point2D.Double(x1,y1));
    }

    @Override
    public void addCoordinate(Point2D point) {
        if (point.getX() != coordinates.get(1).getX()) {
            coordinates.set(0, point);
            x1 = point.getX();
            y1 = point.getY();
        }
    }

    @Override
    public void putCanvasCoordinate(Point2D point) {
        coordinates.set(1,point);
        x2 = point.getX();
        y2 = point.getY();
        Rectangle rect = new Rectangle();
        rect.setFrameFromDiagonal(x1, y1, x2, y2);
        shape = rect;
    }

    @Override
    public void paintShape(Graphics g) {
        if (shape != null) {
            g.setColor(shapeColor);
            g.drawRect(((Rectangle) shape).x, ((Rectangle) shape).y, ((Rectangle) shape).width, ((Rectangle) shape).height);
        }

    }

    @Override
    public void setColor(Color color) {
        this.shapeColor = color;
        ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getColor() {
        return shapeColor; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getType() {
        return ("Rectangle"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setShape() {
        this.shape = (Rectangle) shape; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Point2D> getPoints() {
        return this.coordinates;
    }

    @Override
    public void setCoordinates(List<Point2D> point) {
        addCoordinate(point.get(0));
        putCanvasCoordinate(point.get(1));
    }
}

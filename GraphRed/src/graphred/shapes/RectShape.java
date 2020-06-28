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
 *
 * @author George
 */
public class RectShape extends BaseShape{
    Color shapeColor;
    double x1;
    double x2;
    double y1;
    double y2;
    int xp,yp;
    Shape shape;
    List<Point2D> coordinates;
    
    public RectShape(){
        coordinates = new ArrayList<Point2D>();
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
    }

    @Override
    public void addCoordinate(Point2D point){
        coordinates.add(point);
        x1 = point.getX();
        y1 = point.getY();
    }
    
    @Override
    public void putCanvasCoordinate(Point2D point) {
        coordinates.add(point);
        x2 = point.getX();
        y2 = point.getY();
        Rectangle rect = new Rectangle();
        rect.setFrameFromDiagonal(x1, y1, x2, y2);
        shape = rect;
    }

    @Override
    public void paintShape(Graphics g) {
        g.setColor(shapeColor);
        g.drawRect(((Rectangle)shape).x , ((Rectangle)shape).y, ((Rectangle)shape).width, ((Rectangle)shape).height);
    }

    @Override
    public void setColor(Color color) {
        this.shapeColor = color;; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getColor() {
        return shapeColor; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getType() {
        return("Rectangle"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setShape() {
        this.shape = (Rectangle)shape; //To change body of generated methods, choose Tools | Templates.
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

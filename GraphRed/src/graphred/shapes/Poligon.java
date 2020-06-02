/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 *
 * @author George
 */
public class Poligon extends BaseShape{
    Color shapeColor;
    ArrayList<Integer> x;
    ArrayList<Integer> y;
    int xp,yp;
    Polygon shape;
    
    public Poligon(){
        this.shape = new Polygon();
    }

    @Override
    public void addCoordinate(int x, int y){
        shape.addPoint(x, y);
    }
    
    @Override
    public void putCanvasCoordinate(int x, int y) {
    }

    @Override
    public void paintShape(Graphics g) {
        g.setColor(shapeColor);
        g.drawPolygon(shape);
         
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
    public String getShape() {
        return("Polygon"); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void setShape() {
        this.shape = (Polygon)shape; //To change body of generated methods, choose Tools | Templates.
    }
}

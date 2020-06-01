/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.util.ArrayList;

/**
 *
 * @author George
 */
public class Ellipse extends BaseShape{
    Color shapeColor;
    ArrayList<Integer> x;
    ArrayList<Integer> y;
    int xp,yp;
    Shape shape;
    
    public Ellipse(){
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
    }
    
    @Override
    public void addCoordinate(int x, int y){
        this.x.add(x);
        this.y.add(y);
    }
    
    @Override
    public void putCanvasCoordinate(int x, int y) {
        xp = x;
        yp = y;
    }

    @Override
    public Color getColor() {
        return shapeColor; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shape getShape() {
        return shape; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintShape(Graphics g) {
        g.setColor(shapeColor);
        for(int i = 1; i<x.size(); i++) {
            if (x.get(i) >= x.get(i-1) & y.get(i) >= y.get(i-1)) g.drawOval(x.get(i-1), y.get(i-1),Math.abs(x.get(i)-x.get(i-1)), Math.abs(y.get(i)-y.get(i-1)));
            else if(x.get(i) >= x.get(i-1) & y.get(i) < y.get(i-1)) g.drawOval(x.get(i-1), y.get(i),Math.abs(x.get(i)-x.get(i-1)), Math.abs(y.get(i)-y.get(i-1)));
            else if(x.get(i) < x.get(i-1) & y.get(i) < y.get(i-1)) g.drawOval(x.get(i), y.get(i),Math.abs(x.get(i)-x.get(i-1)), Math.abs(y.get(i)-y.get(i-1)));
            else if(x.get(i) < x.get(i-1) & y.get(i) >= y.get(i-1)) g.drawOval(x.get(i), y.get(i-1),Math.abs(x.get(i)-x.get(i-1)), Math.abs(y.get(i)-y.get(i-1)));
            
        }
        if (!x.isEmpty()) {
            if (xp >= x.get(x.size()-1) & yp >= y.get(y.size()-1)) g.drawOval(x.get(x.size()-1), y.get(y.size()-1), Math.abs(xp - x.get(x.size()-1)), Math.abs(yp - y.get(y.size()-1)));
            else if(xp >= x.get(x.size()-1) & yp < y.get(y.size()-1)) g.drawOval(x.get(x.size()-1), yp , Math.abs(xp - x.get(x.size()-1)), Math.abs(yp - y.get(y.size()-1)));
            else if(xp < x.get(x.size()-1) & yp < y.get(y.size()-1)) g.drawOval(xp, yp, Math.abs(xp - x.get(x.size()-1)), Math.abs(yp - y.get(y.size()-1)));
            else if(xp < x.get(x.size()-1) & yp >= y.get(y.size()-1)) g.drawOval(xp, y.get(y.size()-1), Math.abs(xp - x.get(x.size()-1)), Math.abs(yp - y.get(y.size()-1)));
           
        }
    }

    @Override
    public void setColor(Color color) {
        this.shapeColor = color;; //To change body of generated methods, choose Tools | Templates.
    }
    
}

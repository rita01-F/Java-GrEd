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
public class Line extends BaseShape{
    Color shapeColor;
    ArrayList<Integer> x;
    ArrayList<Integer> y;
    int xp,yp;
    Shape shape;
    
    public Line(){
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
    public void paintShape(Graphics g){
        g.setColor(shapeColor);
        for(int i = 1; i<x.size(); i++) {
            g.drawLine(x.get(i-1), y.get(i-1), x.get(i), y.get(i));
        }
        if (!x.isEmpty()) {
            g.drawLine(x.get(x.size()-1), y.get(y.size()-1), xp, yp);
        }
    }
    @Override
    public void setColor(Color color){
        this.shapeColor = color;
    }
    
    @Override
    public Color getColor(){
        return shapeColor;
    }
    
    @Override
    public Shape getShape(){
        return shape;
    }
}

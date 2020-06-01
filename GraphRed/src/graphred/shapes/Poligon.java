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
import java.util.Arrays;

/**
 *
 * @author George
 */
public class Poligon extends BaseShape{
    Color shapeColor;
    ArrayList<Integer> x;
    ArrayList<Integer> y;
    int xp,yp;
    Shape shape;
    int[] ax;
    int[] ay;
    
    public Poligon(){
        this.ax = new int[100];
        this.ay = new int[100];
    }

    @Override
    public void addCoordinate(int x, int y){
        this.ax = addElement(ax,x);
        this.ay = addElement(ay,y);
    }
    
    @Override
    public void putCanvasCoordinate(int x, int y) {
        xp = x;
        yp = y;
    }

    @Override
    public void paintShape(Graphics g) {
        g.setColor(shapeColor);
        for(int i = 1; i<x.size(); i++){
            g.drawPolygon(ax, ay, i);
        }
         
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
    public Shape getShape() {
        return shape; //To change body of generated methods, choose Tools | Templates.
    }
    
    static int[] addElement(int[] a, int e) {
    a  = Arrays.copyOf(a, a.length + 1);
    a[a.length - 1] = e;
    return a;
    }
}

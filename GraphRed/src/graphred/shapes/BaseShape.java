/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;

/**
 *
 * @author George
 */
public abstract class BaseShape {
    abstract public void addCoordinate(int x, int y);
    abstract public void putCanvasCoordinate(int x, int y);
    abstract public void paintShape(Graphics g);
    abstract public void setColor(Color color);
    abstract public Color getColor();
    abstract public Shape getShape();
    abstract public void setShape();
}

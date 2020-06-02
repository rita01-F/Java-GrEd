
package graphred.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author George
 */
public class Queue {
    ArrayList<BaseShape> shapes;
    Color currColor;
    
    public Queue(){
        shapes = new ArrayList<>();
        currColor = Color.BLACK;
    }
    
    
    public int getSize(){
        return shapes.size();
    }
    
    public void addShape(BaseShape bt){
        shapes.add(bt);
    }
    
    public BaseShape getLastShape(){
        if (shapes.isEmpty()) return null;
        return shapes.get(shapes.size()-1);
    }
    
    public void paintShapes(Graphics g){
        for (BaseShape bs:shapes){
            bs.paintShape(g);
        }
    }
    
    public void setColor(){}
    
    public void setCurrColor(Color color){
        this.currColor = color;
    }
    
}

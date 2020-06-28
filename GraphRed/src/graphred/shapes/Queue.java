
package graphred.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author George
 */
public class Queue {
    private ArrayList<BaseShape> shapes;
    private Color currColor;
    private static Queue me;
    
    private Queue(){
        shapes = new ArrayList<>();
        currColor = Color.BLACK;
    }
    public static Queue singleton(){
        if(me == null){
            me = new Queue();
        }
        return me;
    }
    
    public int getSize(){
        return shapes.size();
    }
    
    public void addShape(BaseShape bt){
        bt.setColor(this.currColor);
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

    public ArrayList<BaseShape> getQueue() {
        return shapes;
    }
}

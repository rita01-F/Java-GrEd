
package graphred.shapes;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author George
 */
public class Queue {
    ArrayList<BaseShape> shapes = new ArrayList<>();
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
}



package graphred;

import graphred.shapes.Line;
import graphred.shapes.Queue;

import javax.swing.*;
import java.awt.*;

public class GraphRed  extends JFrame{
    private JFrame fr;
    private MyCanvas jp;
    private Queue q = Queue.singleton();
    
    public GraphRed(){
        super("New Graphics Edit");
        this.setLocation(0, 0);
        this.setSize(1900,1000);
        this.getContentPane().setBackground(Color.DARK_GRAY);

        fr= this;
        this.setVisible(true);
        this.setLayout(null);

        jp = new MyCanvas(1600,1000,q);
        jp.setVisible(true);
        jp.setBounds(0,40,1600,1000);

        q.addShape(new Line());

        JPanel colorButtonPanel = new ColorButtonsPanel(q);
        this.add(colorButtonPanel);
        JPanel toolsPanel = new ToolsPanel(q, jp);
        this.add(toolsPanel);



        this.add(jp);
        this.repaint();
        
    }
    
    public static void main(String[] args){
        GraphRed app =new GraphRed();
        app.setEnabled(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

     
    
    
    

    
    


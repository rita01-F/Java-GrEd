//sdsdsdsdsdsdsdsd

package graphred;

import graphred.shapes.Line;
import graphred.shapes.Queue;
import java.awt.Color;
import javax.swing.*;

public class GraphRed  extends JFrame{

    JFrame fr;
    JButton jb;
    MyCanvas jp;
    Queue q = new Queue();
    
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
        JPanel toolsPanel = new ToolsPanel(q);
        this.add(toolsPanel);
//        JButton jb = new LineButton(q);
//        jb.setVisible(true);
//        jb.setBounds(15, 70,100,30);
        

        this.add(jp);
//        this.add(jb);
        this.repaint();
        
    }

//    @Override
//    public void paint(Graphics g){
//        super.paint(g);
//    }
    
    public static void main(String[] args){
        GraphRed app =new GraphRed();
        app.setAlwaysOnTop(true);
        app.setEnabled(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

     
    
    
    

    
    


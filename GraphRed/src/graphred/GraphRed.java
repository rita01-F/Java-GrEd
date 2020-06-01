//sdsdsdsdsdsdsdsd

package graphred;

import graphred.shapes.Line;
import graphred.shapes.Queue;
import graphred.tools.LineButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GraphRed  extends JFrame{

    JFrame fr;
    JButton jb1;
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
        jp.setBounds(120,70,1600,1000);
        q.addShape(new Line());
        JButton jb1 = new LineButton("Line");
        jb1.setVisible(true);
        jb1.setBounds(15, 70,100,30);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jb1 instanceof LineButton) 
                    q.addShape(((LineButton)jb1).getShape());
            }
        });

        this.add(jp);
        this.add(jb1);
        this.repaint();
        
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
    }
    
    public static void main(String[] args){
        GraphRed app =new GraphRed();
        app.setAlwaysOnTop(true);
        app.setEnabled(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

     
    
    
    

    
    


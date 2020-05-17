package graphred;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GraphRed  extends JFrame{

    JFrame fr;
    JButton jb1;
    JButton jb2;
    MyCanvas jp;
    
    public GraphRed(){
        super("New Graphics Edit");
        this.setLocation(10, 40);
        this.setSize(1900,1000);
        this.getContentPane().setBackground(Color.DARK_GRAY);        
        
        fr= this;
        this.setVisible(true);
        this.setLayout(null);
        
        jp = new MyCanvas();
        jp.setVisible(true);
        jp.setBounds(120,70,1600,1000);
                
        JButton jb1 = new JButton("Line");
        jb1.setVisible(true);
        jb1.setBounds(15, 70,100,30);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jp.setMode(1);
            }
        });

        JButton jb2 = new JButton("Rectangle");
        jb2.setVisible(true);
        jb2.setBounds(15, 110,100,30);
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jp.setMode(2);
            }
        });

        
        this.add(jp);
        this.add(jb1);
        this.add(jb2);
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

     
    
    
    

    
    


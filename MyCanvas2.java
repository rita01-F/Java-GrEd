package graphred;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyCanvas extends JPanel {
    ArrayList<Integer> x=new ArrayList<>();
    ArrayList<Integer> y=new ArrayList<>();
    MyCanvas me;
    public MyCanvas(){
        super();
        me=this;
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
              x.add(e.getX());
              y.add(e.getY());
              me.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(30, 30, getWidth(),  getHeight());
        
        g.setColor(Color.black);
        for(int i=1;i<x.size();i++){
            g.drawLine(x.get(i-1), y.get(i-1), x.get(i), y.get(i));
        }
    }
}

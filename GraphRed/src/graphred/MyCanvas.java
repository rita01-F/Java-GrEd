package graphred;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyCanvas extends JPanel {
    ArrayList<Rectangle> rectList = new ArrayList<>();
    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> y = new ArrayList<>();
    ArrayList<Point2D> pointList = new ArrayList<>();
    MyCanvas me;
    private int mode;
    Integer MouseX;
    Integer MouseY;
    BufferedImage buf;
    Graphics buffer;
    int width;
    int height;
    public int getMode(){
        return this.mode;
    }
    public void setMode(int mode){
        this.mode=mode;
    }


    public MyCanvas(int width, int height){
        this();
        this.width = width;
        this.height = height;
        buf = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        buffer = buf.getGraphics();
        buffer.setColor(Color.white);
        buffer.fillRect(0, 0, width, height);
    }
    
    public MyCanvas(){
        super();
        me= this;
        boolean er = true;
        mode =1;
        
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                y.add(e.getY());
                x.add(e.getX());
                me.PaintToBuffer();
                me.repaint();
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
        }
        );
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                
                MouseX = e.getX();
                MouseY = e.getY();
                me.PaintToBuffer();
                me.repaint();
               
            }
        });
        
    }        
    public void PaintToBuffer() {
        buffer.setColor(Color.white);
        buffer.fillRect(0,0,1600,1000);
        buffer.setColor(Color.black);
        for(int i = 1; i<x.size(); i++) {
            buffer.drawLine(x.get(x.size()-1), y.get(y.size()-1), x.get(i), y.get(i));
        }
        if (x.size() != 0) {
            buffer.drawLine(x.get(x.size()-1), y.get(y.size()-1), MouseX, MouseY);
        }
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(buf, 0, 0, me);
    }
    
    
}

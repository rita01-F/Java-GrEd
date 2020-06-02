package graphred;

import graphred.shapes.Queue;
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
    ArrayList<Point2D> pointList = new ArrayList<>();
    MyCanvas me;
    private int mode;
    BufferedImage buf;
    Graphics buffer;
    int width;
    int height;
    Queue q;
    public int getMode(){
        return this.mode;
    }
    public void setMode(int mode){
        this.mode=mode;
    }


    public MyCanvas(int width, int height,Queue q){
        this();
        this.width = width;
        this.height = height;
        this.q = q;
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
                q.getLastShape().addCoordinate(e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getX()>=40){
                    q.getLastShape().addCoordinate(e.getX(), e.getY());
                    me.PaintToBuffer();
                    me.repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getX()>=40){
                    q.getLastShape().addCoordinate(e.getX(), e.getY());
                    me.PaintToBuffer();
                    me.repaint();
                }
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
                if (e.getX()>=40){
                    q.getLastShape().putCanvasCoordinate(e.getX(), e.getY());
                    me.PaintToBuffer();
                    me.repaint();
                    
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                
            }
        });
        
    }        
    public void PaintToBuffer() {
        
        buffer.setColor(Color.white);
        buffer.fillRect(0,0,1600,1000);
        buffer.setColor(Color.black);
        
        q.paintShapes(buffer);
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(buf, 0, 0, me);
    }
    
    
}

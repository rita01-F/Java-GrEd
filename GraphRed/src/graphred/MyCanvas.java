package graphred;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyCanvas extends JPanel {
    ArrayList<Rectangle> rectList = new ArrayList<>();
    ArrayList<Point2D> pointList = new ArrayList<>();
    MyCanvas me;
    private int mode;

    public int getMode(){
        return this.mode;
    }
    public void setMode(int mode){
        this.mode=mode;
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
              switch (mode){
                  case 1:{}
                  case 2:{
                      pointList.add(e.getPoint());
                  }
              }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                switch (mode){
                    case 1:{}
                    case 2:{
                        pointList.add(e.getPoint());
                        Rectangle rect =new Rectangle();
                        rect.setFrameFromDiagonal(pointList.get(0),pointList.get(1));
                        rectList.add(rect);
                        pointList.remove(0);
                        pointList.remove(0);
                        repaint();
                    }
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
                switch (mode){
                    case 1:{
                        pointList.add(e.getPoint());
                        Rectangle rect =new Rectangle();
                        rect.setFrameFromDiagonal(pointList.get(0),new Point2D.Double(pointList.get(0).getX()+1,pointList.get(0).getY()+1));
                        rectList.add(rect);
                        pointList.remove(0);
                        repaint();
                    }
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });


    } 
    

                
    @Override
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0,0,1600,1000);

        g.setColor(Color.black);
        for(Rectangle rect:rectList){
            g.drawRect(rect.x,rect.y,rect.width,rect.height);

        }
    }
    
    
}

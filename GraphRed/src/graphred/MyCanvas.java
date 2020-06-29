package graphred;

import graphred.shapes.Queue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class MyCanvas extends JPanel {
    private MyCanvas me;
    private BufferedImage buf;
    private Graphics buffer;
    private int width;
    private int height;
    private Queue q;



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

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                q.getLastShape().addCoordinate(e.getPoint());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getY()>=0){
                    q.getLastShape().addCoordinate(e.getPoint());
                    me.PaintToBuffer();
                    me.repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getY()>=0){
                    q.getLastShape().addCoordinate(e.getPoint());
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
                if (e.getY()>=0){
                    q.getLastShape().putCanvasCoordinate(e.getPoint());
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
    public void Refresh(){
        buffer.setColor(Color.white);
        buffer.fillRect(0,0,1600,1000);
        buffer.setColor(Color.black);
        q.RefreshQueue();
        me.repaint();
    }
    public void SavePNG() throws IOException {
        ImageIO.write(buf, "png", new File("image.png"));
    }
    
    @Override
    public void paint(Graphics g){
        g.drawImage(buf, 0, 0, me);
    }


}

//package graphred;
//
//import java.awt.*;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//import java.awt.geom.Point2D;
//import java.util.ArrayList;
//import javax.swing.JPanel;
//
//public class MyCanvas extends JPanel {
//    ArrayList<Rectangle> rectList = new ArrayList<>();
//    ArrayList<Integer> x = new ArrayList<>();
//    ArrayList<Integer> y = new ArrayList<>();
//    ArrayList<Point2D> pointList = new ArrayList<>();
//    MyCanvas me;
//    private int mode;
//    Integer MouseX;
//    Integer MouseY;
//
//    public int getMode(){
//        return this.mode;
//    }
//    public void setMode(int mode){
//        this.mode=mode;
//    }
//
//
//    
//    public MyCanvas(){
//        super();
//        me= this;
//        boolean er = true;
//        mode =1;
//        
//        this.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                y.add(e.getY());
//                x.add(e.getX());
//                me.repaint();
//                
//                switch (mode){
//                    case 1:{}
//                    case 2:{
//                        pointList.add(e.getPoint());
//                    }
//                }
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//                switch (mode){
//                    case 1:{}
//                    case 2:{
//                        pointList.add(e.getPoint());
//                        Rectangle rect =new Rectangle();
//                        rect.setFrameFromDiagonal(pointList.get(0),pointList.get(1));
//                        rectList.add(rect);
//                        pointList.remove(0);
//                        pointList.remove(0);
//                        repaint();
//                    }
////                    case 3:{
////                        pointList.add(e.getPoint());
////                        Line line =new Line();
////                        //line.setFrameFromDiagonal(pointList.get(0),pointList.get(1));
////                        lineList.add(line);
////                        pointList.remove(0);
////                        pointList.remove(0);
////                        repaint();
////                    }
//                }
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                
//            }
//        }
//        );
//        this.addMouseMotionListener(new MouseMotionListener() {
//            @Override
//            public void mouseDragged(MouseEvent e) {
////                switch (mode){
////                    case 1:{
////                        pointList.add(e.getPoint());
////                        Rectangle rect =new Rectangle();
////                        rect.setFrameFromDiagonal(pointList.get(0),new Point2D.Double(pointList.get(0).getX()+1,pointList.get(0).getY()+1));
////                        rectList.add(rect);
////                        pointList.remove(0);
////                        repaint();
////                    }
////                }
//            }
//
//            @Override
//            public void mouseMoved(MouseEvent e) {
//                
//                MouseX = e.getX();
//                MouseY = e.getY();
//                repaint();
//                switch (mode){
//                    case 1:{
//                        
////                        pointList.add(e.getPoint());
////                        Rectangle rect =new Rectangle();
////                        rect.setFrameFromDiagonal(pointList.get(0),new Point2D.Double(pointList.get(0).getX()+1,pointList.get(0).getY()+1));
////                        rectList.add(rect);
////                        pointList.remove(0);
////                        repaint();
//                    }
//                }
//                
//            }
//        });
//
//
//    } 
//    
//
//                
//    @Override
//    public void paint(Graphics g){
//        g.setColor(Color.white);
//        g.fillRect(0,0,1600,1000);
//        g.setColor(Color.black);
//        for(int i = 1; i<x.size(); i++) {
//            g.drawLine(x.get(x.size()-1), y.get(y.size()-1), x.get(i), y.get(i));
//        }
//        if (x.size() != 0) {
//            g.drawLine(x.get(x.size()-1), y.get(y.size()-1), MouseX, MouseY);
//        }
////        for(Rectangle rect:rectList){
////            g.drawRect(rect.x,rect.y,rect.width,rect.height);
////        }
//        
//    }
//    
//    
//}

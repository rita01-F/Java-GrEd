package graphred;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GraphRed  extends JFrame{
    JLabel jl;
    JFrame fr;
    MyCanvas jp;
    
    public GraphRed(){
       super("New Graphics Edit");       
      // this.setSize(800,600);
       this.setExtendedState(MAXIMIZED_BOTH);
       this.getContentPane().setBackground(Color.DARK_GRAY);

       
       fr=this;
       this.setVisible(true);
       this.setLayout(null);
       
       
//       jl=new JLabel ("Ваше имя:");
//       jl.setBounds(10,10,100,20);
//       jl.setForeground(Color.lightGray);
       
       jp=new MyCanvas ();
       jp.setBounds(30,30, (int)fr.getWidth(), (int)fr.getHeight()); 
       JTextField jt=new JTextField (" Игорь"); // setBounds(x, y, width, height)
       jt.setBounds(105,10,100,20);
       
//       JButton jbm=new JButton ("Line");
//       jbm.setBounds(10,30,200,20);
//       
//       JButton jbr=new JButton ("Rectangle");
//       jbr.setBounds(10,40,200,20);
       
      JButton jb=new JButton ("Press F to pay respect");
      jb.setBounds(305,10,200,20);
       
       jb.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               jl.setText("Your Text");
               fr.repaint();
           }  
    });
       
      // this.add(jl);
       this.add(jt);
       this.add(jb);
       this.add(jp);
       this.repaint();
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
    }
    

    public static void main(String[] args) {
        GraphRed app = new GraphRed();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

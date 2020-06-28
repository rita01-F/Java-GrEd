/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred;

import graphred.shapes.Queue;
import graphred.tools.*;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author George
 */
public class ToolsPanel extends JPanel{
    ToolsPanel(Queue q, MyCanvas jp){
        super();
        this.setBounds(180, 0,  550, 40);
        this.setBackground(Color.gray);
        this.add(BorderLayout.WEST,new LineButton(q));
        this.add(BorderLayout.WEST,new EllipseButton(q));
        this.add(BorderLayout.WEST,new RectButton(q));
        this.add(BorderLayout.WEST,new PoligonButton(q));
        this.add(BorderLayout.WEST, new Save());
        this.add(BorderLayout.WEST, new Load(jp));
    }
}

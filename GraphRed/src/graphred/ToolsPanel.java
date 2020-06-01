/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred;

import graphred.shapes.Queue;
import graphred.tools.EllipseButton;
import graphred.tools.LineButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author George
 */
public class ToolsPanel extends JPanel{
    ToolsPanel(Queue q){
        super();
        this.setBounds(180, 0,  750, 40);
        this.setBackground(Color.gray);
        this.add(BorderLayout.WEST,new LineButton(q));
        this.add(BorderLayout.WEST,new EllipseButton(q));
    }
    
}

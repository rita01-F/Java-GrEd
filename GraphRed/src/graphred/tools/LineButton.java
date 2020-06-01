/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.tools;

import graphred.shapes.*;
import javax.swing.JButton;

/**
 *
 * @author George
 */
public class LineButton extends JButton {
    BaseShape bs = new Line();
    public LineButton(String name){
        super(name);
    }
    
    public BaseShape getShape(){
        return new Line();
    }
}

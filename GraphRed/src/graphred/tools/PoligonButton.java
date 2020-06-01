/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.tools;

import graphred.shapes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author George
 */
public class PoligonButton extends BaseButton {
    public PoligonButton(Queue q){
        super("Poligon");
        this.addActionListener(new ActionListener(){
            
             @Override
             public void actionPerformed(ActionEvent arg0){
                 q.addShape(new Poligon());
             }
        });
    }
}

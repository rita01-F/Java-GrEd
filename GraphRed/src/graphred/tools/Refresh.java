/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.tools;

import graphred.MyCanvas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Windows
 */
public class Refresh extends BaseButton {

    public Refresh(MyCanvas jp) {
        super("Refresh");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jp.Refresh();
            }
        });
    }

}

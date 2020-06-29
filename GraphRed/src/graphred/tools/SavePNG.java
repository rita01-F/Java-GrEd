/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.tools;

import graphred.MyCanvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 * @author Windows
 */
public class SavePNG extends BaseButton{
    
    public SavePNG(MyCanvas jp) {
        super("Save as PNG");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jp.SavePNG();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.ColorButtons;

import graphred.shapes.Queue;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author George
 */
public class OrangeColorButton extends BaseColorButton{
    public OrangeColorButton(Queue queue){
		super();
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				queue.getLastShape().setColor(Color.ORANGE);
				queue.setCurrColor(Color.ORANGE);
			}
		});
	}

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred;

import graphred.ColorButtons.BaseColorButton;
import graphred.ColorButtons.BlackColorButton;
import graphred.ColorButtons.BlueColorButton;
import graphred.ColorButtons.CyanColorButton;
import graphred.ColorButtons.GreenColorButton;
import graphred.ColorButtons.OrangeColorButton;
import graphred.ColorButtons.PurpleColorButton;
import graphred.ColorButtons.RedColorButton;
import graphred.ColorButtons.YellowColorButton;
import graphred.shapes.Queue;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 * @author George
 */
public class ColorButtonsPanel extends JPanel {
    ColorButtonsPanel(Queue q) {
        super();
        this.setBounds(0, 0, 180, 40);
        this.setBackground(Color.gray);

        BaseColorButton blackButton = new BlackColorButton(q);
        blackButton.setBackground(blackButton.getColor());
        this.add(BorderLayout.WEST, blackButton);

        BaseColorButton blueButton = new BlueColorButton(q);
        blueButton.setBackground(blueButton.getColor());
        this.add(BorderLayout.WEST, blueButton);

        BaseColorButton cyanButton = new CyanColorButton(q);
        cyanButton.setBackground(cyanButton.getColor());
        this.add(BorderLayout.WEST, cyanButton);

        BaseColorButton greenButton = new GreenColorButton(q);
        greenButton.setBackground(greenButton.getColor());
        this.add(BorderLayout.WEST, greenButton);

        BaseColorButton orangeButton = new OrangeColorButton(q);
        orangeButton.setBackground(orangeButton.getColor());
        this.add(BorderLayout.WEST, orangeButton);

        BaseColorButton purpleButton = new PurpleColorButton(q);
        purpleButton.setBackground(purpleButton.getColor());
        this.add(BorderLayout.WEST, purpleButton);

        BaseColorButton redButton = new RedColorButton(q);
        redButton.setBackground(redButton.getColor());
        this.add(BorderLayout.WEST, redButton);

        BaseColorButton yellowButton = new YellowColorButton(q);
        yellowButton.setBackground(yellowButton.getColor());
        this.add(BorderLayout.WEST, yellowButton);
    }

}

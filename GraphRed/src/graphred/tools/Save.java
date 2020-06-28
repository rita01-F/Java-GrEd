package graphred.tools;

import Save.Saver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Save extends BaseButton {
    public Save(){
        super("Save");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Saver();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }
}

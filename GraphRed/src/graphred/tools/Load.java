package graphred.tools;

import Save.Loader;
import graphred.MyCanvas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Load extends BaseButton {
    public Load(MyCanvas jp) {
        super("Load");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Loader(jp);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }
}

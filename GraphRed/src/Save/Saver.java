package Save;

import graphred.shapes.BaseShape;
import graphred.shapes.Queue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Saver{
    public Saver() throws IOException {
        SaveShapeQueue Queueshape = new SaveShapeQueue();
        for(BaseShape shape: Queue.singleton().getQueue()) {
            Queueshape.addShape(new SaveShape(shape));
        }
        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(Queueshape);
        objectOutputStream.close();
    }
}

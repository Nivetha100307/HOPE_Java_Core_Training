package DAY19;

import java.io.*;

class Studentt implements Serializable {
    String name;
    int mark;

    Studentt(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

class CustomObjectOutputStreamm extends ObjectOutputStream {
    CustomObjectOutputStreamm(OutputStream obj) throws IOException {
        super(obj);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}

public class SerializeExample {
    public static void main(String[] args) throws IOException {
        Studentt s = new Studentt("ABC", 89);
        File file = new File("student.txt");

        FileOutputStream fo = new FileOutputStream(file, true);
        ObjectOutputStream obj;

        if (file.length() == 0) {
            obj = new ObjectOutputStream(fo);
        } else {
            obj = new CustomObjectOutputStreamm(fo);
        }

        obj.writeObject(s);
        obj.close();
    }
}
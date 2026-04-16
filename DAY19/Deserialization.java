package DAY19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream("Student.txt");
        ObjectInputStream obj = new ObjectInputStream(fi);
        while (true) {
            try {
                Student s = (Student) obj.readObject();
                System.out.println(s.name + " " + s.mark);
            } catch (IOException e) {
                break;
            }
        }
        fi.close();
        obj.close();
    }
}
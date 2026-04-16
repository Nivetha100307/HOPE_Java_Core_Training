package DAY19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable {
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream {
    CustomObjectOutputStream(ObjectOutputStream obj) throws IOException {
        super(obj);
    }
    @Override
    protected void writeStreamHeader(){

    }
}
public class SerializationExample {
    public static void main(String[] args) throws IOException {
        Student s=new Student("ABC",89);
        FileOutputStream fo=new FileOutputStream("Student.txt");
        ObjectOutputStream obj=new ObjectOutputStream(fo);
        obj.writeObject(s);
        fo.close();
        obj.close();
    }
}
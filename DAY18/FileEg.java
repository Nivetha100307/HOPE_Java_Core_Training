import java.io.File;
import java.io.IOException;

class FileEg {
    public static void main(String[] args) throws IOException {
        File newFile = new File("test.txt");
        if (newFile.createNewFile()) {
            System.out.println("File created: " + newFile.getName());
        } else {
            System.out.println("Not able to create file");
        }
    }
}
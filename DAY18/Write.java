import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class Write {
    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("test.txt"));
            br.write("Write using file writer");
            br.newLine();
            br.write("Write using file writer");
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
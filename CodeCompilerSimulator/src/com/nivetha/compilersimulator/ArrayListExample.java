import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        
        System.out.println("Programming Languages:");
        for (String lang : languages) {
            System.out.println("- " + lang);
        }
        
        System.out.println("\nTotal languages: " + languages.size());
    }
}
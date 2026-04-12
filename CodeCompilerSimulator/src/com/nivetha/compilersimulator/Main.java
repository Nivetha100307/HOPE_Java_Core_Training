
import command.CommandHandler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CommandHandler handler = new CommandHandler();
        
        System.out.println("=== CLI Java Compiler Simulator ===");
        System.out.println("Commands: compile <File.java> | run <File.java> | exit");
        System.out.println("====================================\n");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            
            if (input.isEmpty()) continue;
            
            handler.processCommand(input);
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting simulator...");
                break;
            }
        }
        
        scanner.close();
    }
}
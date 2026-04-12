package engine;

import output.OutputHandler;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecutionEngine {
    private final OutputHandler outputHandler = new OutputHandler();

    public void execute(String className) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", className);
            pb.redirectErrorStream(true); // Merge stderr with stdout
            
            Process process = pb.start();
            
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                outputHandler.showError("Program exited with code: " + exitCode);
            }
            
        } catch (Exception e) {
            outputHandler.showError("Execution failed: " + e.getMessage());
            if (e.getMessage().contains("NoClassDefFoundError") || 
                e.getMessage().contains("ClassNotFound")) {
                outputHandler.showError("Make sure you have compiled the file first.");
            }
        }
    }
}
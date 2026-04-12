package analysis;

import output.OutputHandler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImportChecker {
    private final OutputHandler outputHandler = new OutputHandler();
    
    // Common class to required import mapping
    private static final Map<String, String> REQUIRED_IMPORTS = new HashMap<>();
    
    static {
        REQUIRED_IMPORTS.put("Scanner", "java.util.Scanner");
        REQUIRED_IMPORTS.put("ArrayList", "java.util.ArrayList");
        REQUIRED_IMPORTS.put("List", "java.util.List");
        REQUIRED_IMPORTS.put("File", "java.io.File");
        REQUIRED_IMPORTS.put("BufferedReader", "java.io.BufferedReader");
        REQUIRED_IMPORTS.put("System", ""); // built-in, no import needed
        // Add more as needed
    }

    public String checkMissingImports(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean hasImportJavaUtil = false;
            boolean hasImportJavaIo = false;
            
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                
                if (line.startsWith("import ")) {
                    if (line.contains("java.util")) hasImportJavaUtil = true;
                    if (line.contains("java.io")) hasImportJavaIo = true;
                    continue;
                }
                
                // Check for used classes that need imports
                for (Map.Entry<String, String> entry : REQUIRED_IMPORTS.entrySet()) {
                    String className = entry.getKey();
                    if (line.contains(className + ".") || 
                        (line.contains(" " + className) && !line.contains("import"))) {
                        
                        String required = entry.getValue();
                        if (required.isEmpty()) continue; // built-in
                        
                        if (required.contains("java.util") && !hasImportJavaUtil) {
                            return "Error: '" + className + "' is used but 'java.util.*' (or specific import) is missing.";
                        }
                        if (required.contains("java.io") && !hasImportJavaIo) {
                            return "Error: '" + className + "' is used but 'java.io.*' (or specific import) is missing.";
                        }
                    }
                }
            }
        } catch (IOException e) {
            outputHandler.showError("Error reading file for import analysis: " + e.getMessage());
        }
        return null; // No missing imports
    }
}
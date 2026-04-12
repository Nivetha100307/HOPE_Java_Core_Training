package validation;
import output.OutputHandler;
import java.io.File;

public class ValidationLayer {
    private final OutputHandler outputHandler = new OutputHandler();

    public boolean validateCompileCommand(String fileName) {
        return validateFile(fileName, "compile");
    }

    public boolean validateRunCommand(String fileName) {
        return validateFile(fileName, "run");
    }

    private boolean validateFile(String fileName, String operation) {
        if (fileName.isEmpty()) {
            outputHandler.showError("Filename is required. Example: " + operation + " Test.java");
            return false;
        }

        if (!fileName.endsWith(".java")) {
            outputHandler.showError("Only .java files are supported.");
            return false;
        }

        File file = new File(fileName);
        if (!file.exists()) {
            outputHandler.showError("File not found: " + fileName);
            return false;
        }

        return true;
    }
}
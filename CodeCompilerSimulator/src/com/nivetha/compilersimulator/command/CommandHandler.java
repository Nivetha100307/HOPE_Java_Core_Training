package command;

import validation.ValidationLayer;
import analysis.ImportChecker;
import engine.CompilationEngine;
import engine.ExecutionEngine;
import output.OutputHandler;

public class CommandHandler {

    private final ValidationLayer validationLayer = new ValidationLayer();
    private final ImportChecker importChecker = new ImportChecker();
    private final CompilationEngine compilationEngine = new CompilationEngine();
    private final ExecutionEngine executionEngine = new ExecutionEngine();
    private final OutputHandler outputHandler = new OutputHandler();

    public void processCommand(String input) {
        String[] parts = input.trim().split("\\s+");

        if (parts.length < 1) {
            outputHandler.showError("Invalid command.");
            return;
        }

        String command = parts[0].toLowerCase();
        String fileName = (parts.length > 1) ? parts[1] : "";

        try {
            switch (command) {
                case "compile":
                    handleCompile(fileName);
                    break;
                case "run":
                    handleRun(fileName);
                    break;
                case "exit":
                    // Handled in Main
                    break;
                default:
                    outputHandler.showError("Unknown command. Use: compile, run, or exit");
            }
        } catch (Exception e) {
            outputHandler.showError("Unexpected error: " + e.getMessage());
        }
    }

    private void handleCompile(String fileName) {
        if (!validationLayer.validateCompileCommand(fileName)) {
            return;
        }

        outputHandler.showInfo("Checking imports...");
        String importError = importChecker.checkMissingImports(fileName);
        if (importError != null) {
            outputHandler.showError(importError);
            return;
        }

        boolean success = compilationEngine.compile(fileName);

        if (success) {
            outputHandler.showSuccess("Compilation Successful ✅");
        }
    }

    private void handleRun(String fileName) {
        if (!validationLayer.validateRunCommand(fileName)) {
            return;
        }

        String className = fileName.replace(".java", "");

        executionEngine.execute(className);
    }
}
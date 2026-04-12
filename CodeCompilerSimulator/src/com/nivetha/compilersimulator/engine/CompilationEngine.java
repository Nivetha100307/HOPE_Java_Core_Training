package engine;

import output.OutputHandler;
import javax.tools.*;
import java.io.File;
import java.util.Arrays;

public class CompilationEngine {
    private final OutputHandler outputHandler = new OutputHandler();

    public boolean compile(String fileName) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler == null) {
            outputHandler.showError("JavaCompiler not available. Run with JDK instead of JRE.");
            return false;
        }

        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);

        Iterable<? extends JavaFileObject> compilationUnits = 
            fileManager.getJavaFileObjectsFromFiles(Arrays.asList(new File(fileName)));

        JavaCompiler.CompilationTask task = compiler.getTask(
            null, fileManager, diagnostics, null, null, compilationUnits);

        boolean success = task.call();

        for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
            outputHandler.showCompilationDiagnostic(diagnostic);
        }

        try {
            fileManager.close();
        } catch (Exception ignored) {}

        return success;
    }
}
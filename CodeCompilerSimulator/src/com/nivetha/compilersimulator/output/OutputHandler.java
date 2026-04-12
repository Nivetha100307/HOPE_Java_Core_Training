package output;

import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

public class OutputHandler {

    public void showSuccess(String message) {
        System.out.println("✅ " + message);
    }

    public void showError(String message) {
        System.out.println("❌ " + message);
    }

    public void showInfo(String message) {
        System.out.println("ℹ️  " + message);
    }

    public void showCompilationDiagnostic(Diagnostic<? extends JavaFileObject> diagnostic) {
        System.out.printf("%s: %s (Line %d)\n",
                diagnostic.getKind(),
                diagnostic.getMessage(null),
                diagnostic.getLineNumber());
    }
}
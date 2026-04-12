# CLI-Based Java Code Compiler Simulator

### **Architecture Overview**

The proposed system is a **modular, CLI-based compiler simulator** designed to mimic the workflow of a real Java development environment. It integrates Java’s built-in compilation and execution tools with custom layers for command processing, input validation, and static analysis.

### **1. High-Level System Architecture**

```
                    +-------------------+
                    |      User         |
                    |   (CLI Interface) |
                    +-------------------+
                               ↓
                    +-------------------+
                    |   Command Handler |
                    +-------------------+
                               ↓
                    +-------------------+
                    |  Validation Layer |
                    +-------------------+
                               ↓
                    +-------------------+
                    |   Analysis Layer  |
                    +-------------------+
                               ↓
          +-------------------+     +-------------------+
          | Compilation Engine|     |  Execution Engine |
          +-------------------+     +-------------------+
                               ↓
                    +-------------------+
                    |   Output Handler  |
                    +-------------------+
```

### **2. Module-wise Architecture**

**1. CLI Interface (Main Module)**

- **Role**: Serves as the entry point and user interaction layer.
- **Responsibilities**:
    - Displays a command prompt (`>`)
    - Continuously reads user input using `Scanner`
    - Parses raw input and forwards it to the Command Handler

**2. Command Handler (Parser)**

- **Role**: Interprets and decomposes user commands.
- **Supported Commands**:
    - `compile <filename.java>`
    - `run <filename.java>`
    - `exit`
- **Output**: Extracts command type and filename for downstream processing.

**3. Validation Layer**

- **Role**: Ensures system security, stability, and correctness of input.
- **Key Validations**:
    - Command whitelist (only `compile`, `run`, `exit`)
    - File extension check (must end with `.java`)
    - File existence verification
    - Null/empty input handling
    - Comprehensive exception handling to prevent crashes

**4. Analysis Layer (Static Analysis Module)** – *Unique Feature*

- **Role**: Performs lightweight static checks before compilation.
- **Key Components**:
    - **Import Dependency Checker**:
        - Scans source code for class usage (e.g., `Scanner`, `File`, `ArrayList`)
        - Detects missing imports (e.g., `java.util.*`, `java.io.*`)
        - Uses a predefined mapping (`Map<String, String>`) for common classes
    - **Basic Syntax Pre-check** (Optional): Detects obvious issues like unbalanced braces or missing semicolons (if time permits)

**5. Compilation Engine**

- **Technology**: `javax.tools.JavaCompiler`
- **Role**: Performs actual compilation of `.java` files into `.class` files.
- **Capabilities**:
    - Real-time syntax and semantic error detection
    - Returns detailed diagnostic messages on failure

**6. Execution Engine**

- **Technology**: `ProcessBuilder`
- **Role**: Executes the compiled `.class` file.
- **Process**:
    - Runs `java <ClassName>` (without `.class` or `.java` extension)
    - Captures both standard output and error streams
    - Handles runtime exceptions gracefully

**7. Output Handler**

- **Role**: Manages all user-facing responses.
- **Features**:
    - Clear success messages with ✅
    - Structured error reporting with ❌
    - Program output display
    - Colored/Formatted console output (optional enhancement)

### **3. End-to-End Workflow**

1. User enters command via CLI
2. Command Handler parses the input
3. Validation Layer verifies command, file, and format
4. Analysis Layer performs static import checks
5. Compilation Engine compiles the source file using `JavaCompiler`
6. On successful compilation → Execution Engine runs the program using `ProcessBuilder`
7. Output Handler displays results or errors

### **4. Key Design Principles**

- **Separation of Concerns**: Each module has a single, well-defined responsibility
- **Modularity**: Easy to extend or maintain individual components
- **Security & Robustness**: Strong input validation and exception handling
- **Real-world Integration**: Leverages Java’s official `JavaCompiler` and `ProcessBuilder` APIs
- **User Experience**: Intuitive CLI with clear feedback

### **One-Line Project Summary** (Recommended for Viva/PPT)

> “The CLI-Based Java Code Compiler Simulator is a modular system that integrates `JavaCompiler` for real-time compilation and `ProcessBuilder` for execution, augmented with custom command parsing, robust validation, and static import dependency analysis for enhanced user guidance.”
> 

---

This architecture is **professional, balanced, and accurate**. It highlights your custom contributions (especially the Analysis Layer) while clearly acknowledging the use of built-in Java tools.

Would you like me to:

- Convert this into **PPT slide format** (with slide titles and bullet points)?
- Provide **complete multi-class Java project code** with proper folder structure?
- Prepare **likely viva questions and model answers**?

Just tell me what you need next.
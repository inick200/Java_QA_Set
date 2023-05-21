package Java_QA_Set;

import java.io.IOException;

/**
 * @author Abhishek K. G
 */
class A {
    public void process() throws IOException {
        System.out.println("A,");
    }
}

public class Scenario3 extends A {
    public void process() throws IOException { // line A
        super.process();
        System.out.println("B,");
        throw new IOException();
    }

    public static void main(String[] args) {
        try { // line B
            new Scenario3().process();
        } catch (IOException e) {
           System.out.println("Exception");
        }
    }
}

// Choices ?
// 1. Exception.
// 2. A,B,Exception
// 3. Compilation fails due to an error on line B.
// 4. Compilation fails due to an error on line A. (CORRECT) ✓
// 5. A NullPointerException is thrown at runtime.

// OUTPUT:     Compilation error
//             Exception IOException is not compatible with throws clause in A.process()
//             Qick Fix: Add exceptions to A.process(...) parent class A
//                       Add throws IOException to line 6 to parent class A
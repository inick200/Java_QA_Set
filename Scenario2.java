package Java_QA_Set;

/**
 * @author Abhishek K. G
 */
class X {
    public void foo(){
        System.out.println("X ");
    }
}
public class Scenario2 extends X {
    public void foo() throws RuntimeException { // line A
        super.foo();
        if(true) throw new RuntimeException(); // line B
        System.out.println("B "); // line C
    }

    public static void main(String[] args) {
        new Scenario2().foo();
    }
}

// Choices ?
// 1. X, followed by Exception. (CORRECT) ✓
// 2. No output, and an Exception is thrown.
// 3. Compilation fails due to an error on line A.
// 4. X, followed by an Exception, followed by B.

// OUTPUT:
// X 
// Exception in thread "main" java.lang.RuntimeException
//         at Java_QA_Set.Scenario2.foo(Scenario2.java:11)
//         at Java_QA_Set.Scenario2.main(Scenario2.java:16)
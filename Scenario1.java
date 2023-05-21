package Java_QA_Set;
// This series is one of the set from scenario based java questions. Guess the output ?
/**
 * @author Abhishek K. G
 */
public class Scenario1 {
    static void test() throws RuntimeException {
        try {
            System.out.println("test");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("exception");
        }
    }
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println("runtime ex");
        }
        System.out.println("end");
    }
}

// O/P ---> 
        // test
        // exception
        // end
package Java_QA_Set;

/**
 * @author Abhishek K. Ghosh
 */
class MyException extends Exception {
    int detail;
    MyException(int a){
        detail = a;
    }
    public String toString(){
        return "detail";
    }
}

public class Scenario4 {
   static void compute(int a) throws MyException {
    throw new MyException(a);
   }
    public static void main(String[] args) {
        try {
            compute(3);
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }
}

// Choices ?
// 1. 3
// 2. Exception
// 3. Runtime Error
// 4. Compilation Error

// OUTPUT: 2. Exception
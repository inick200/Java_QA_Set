package Java_QA_Set;

/**
 * @author Abhishek K G.
 */
public class Scenario12 {
    int val = 85;
    Scenario12(){
        val = 41;
    }
    {
        val = 27;
    }
    public static void main(String[] args) {
        Scenario12 obj = new Scenario12();
        System.out.println(obj.val);
    }
}


// OPTIONS: 
//          a) 27
//          b) 85
//          c) 41
//          d) 0




// OUTPUT:
//          c) 41 (CORRECT OPTION) ✓
package Java_QA_Set;
import java.util.*;


/**
 * @author Abhishek K G.
 */
public class Scenario7 {
    public static void main(String[] args) {
       List<Integer> r1 = Arrays.asList(10, 20, 30, 40);
       List<Integer> r2 = Arrays.asList(50, 60, 70, 80, 90, 100);
       Collections.copy(r2, r1);
       for(Integer i: r2){
            System.out.println(i+ "");
       }
       
    }
}


// Choices: 
//          1. 50, 60, 70, 80, 90, 100
//          2. 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
//          3. 10, 20, 30, 40, 90, 100
//          4. 10, 60, 70, 80, 90, 100


// OUTPUT: 10, 20, 30, 40, 90, 100 (3rd option)

package Java_QA_Set;

import java.util.Arrays;

/**
 * @author Abhishek K G.
 */
public class Scenario9 {
    public static void main(String[] args) {
        int sum = Arrays.stream(new int[]{1,2,3,4,5}).filter(i -> i%2==0).map(i -> i*2).sum();
        System.out.println("sum: "+sum);
    }
}


// Choices:
//          1. 30
//          2. 12
//          3. 15
//          4. None of above


// OUTPUT:
//          2. 12 (CORRECT OPTION) ✓
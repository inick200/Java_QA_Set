package Java_QA_Set;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Abhishek K G.
 */
public class Scenario10 {
    public static void main(String[] args) {
        Comparator<Integer> numComparator = (num1, num2) -> num2.compareTo(num1);
        Integer arr[] = {1,4,3,2};
        Arrays.sort(arr, numComparator);
        for(Integer number: arr){
            System.out.println(number + "");
        }
    }    
}

// Choices:
//          a) 1 2 3 4
//          b) 1 4 3 2 
//          c) 4 3 2 1 
//          d) Compilation error



// OUTPUT:
//          c) 4 3 2 1 (CORRECT OPTION) ✓
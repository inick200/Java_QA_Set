package Java_QA_Set;


/**
 * @author Abhishek K G.
 */
public class Scenario5 {
    public static void main(String[] args) {
        String s1 = "Program";
        String s2 = "PROGRAM";
        StringBuilder sb = new StringBuilder();
        sb.append("Pro").append("gram");
        
        System.out.println(s1.equals(s2)); 
        System.out.println(sb.toString() == s1);
        System.out.println(sb.toString().equals(s1));

    }
}


// Choices ?
// 1. "true" is printed twice.
// 2. "false" is printed twice. (CORRECT) ✓
// 3. "true" is printed thrice.
// 4. "false" is printed once.

// OUTPUT:
//          false  (becasue of content check inequality)
//          false  (becasue s1 is stored in scp and sb is stored in heap)
//          true   (because content check of s1 and sb are equal)
package Java_QA_Set;

import java.util.*;

/**
 * @author Abhishek K G.
 */
class Student {
    int marks;
    String name;
    Student(int marks, String name){
        this.marks = marks;
        this.name = name;
    }
}
public class Scenario6 {
    public static void main(String[] args) {
        List<Student> firstArr = Arrays.asList(new Student(100, "Mary"), new Student(100, "John"));
        List<Student> secondArr = Arrays.asList(new Student(100, "Mary"), new Student(100, "John"));

        boolean firstResult = firstArr.equals(secondArr);
        boolean secondResult = firstArr == secondArr;
        boolean thirdResult = firstArr.stream().allMatch(i -> {
            Student second = secondArr.get(firstArr.indexOf(i));
            return i.marks == second.marks && i.name == second.name;
        });
        System.out.println(firstResult);
        System.out.println(secondResult);
        System.out.println(thirdResult);
    }
}
// Which of the above results will be true ? 

// Choices: 
//          1. firstResult
//          2. secondResult
//          3. thirdResult (CORRECT) ✓
//          4. All of the options
//          5. None of the options

// OUTPUT:
//          3. thirdResult (CORRECT) ✓ >>>> will return true.
package Java_QA_Set;

/**
 * @author Abhishek K G.
 */
class Animal {

}
class Dog extends Animal {

}

class Labrador extends Dog {

}

public class Scenario8 {

    static void printValue(Animal a){
        System.out.println("One");
    }
    static void printValue(Dog b){
        System.out.println("Two");
    }
    static void printValue(Object obj){
        System.out.println("Three");
    }
    public static void main(String[] args) {
        Labrador l = new Labrador();
        printValue(l);
    }
}

// Options:
//          1. Three
//          2. Two
//          3. One
//          4. Error


// OUTPUT:
//          2. Two (CORRECT OPTION) ✓
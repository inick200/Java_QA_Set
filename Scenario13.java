package Java_QA_Set;

/**
 * @author Abhishek K G.
 */
class P {
    P(){
        System.out.println("super call");
    }
    public String m(String s){
        return "parent " +s;
    }
}
class C extends P {
    C(){
        System.out.println("C contructor");
    }
    public String m(String s){
        return "child " +s;
    }
}

public class Scenario13 extends C {
    public static void main(String[] args) {
        P obj = new C();
        System.out.println(obj.m("class"));
    }
}


// Identify the correct order of execution ?

// OPTIONS:
//          1.  C contructor child class
//          2.  super call C contructor child class
//          3.  child class super call parent class
//          4.  C contructor parent class
//          5.  Compilation error



// OUTPUT: 
//          2. super call C contructor child class (CORRECT OPTION) ✓

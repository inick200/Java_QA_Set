package Java_QA_Set;

import java.util.*;

/**
 * @author Abhishek K G.
 */
class Color {
    private String name;
    public Color(String name){
        this.name = name;
    }
}

public class Scenario11 {
    public static void main(String[] args) {
        Map<Color, String> hm = new HashMap<>();
        hm.put(new Color("Red"), "Red");
        hm.put(new Color("Blue"), "Blue");
        hm.put(new Color("Green"), "Green");

        System.out.println(hm.get(new Color("Blue")));
    }
}

// Choices:
//          1. null
//          2. Blue
//          3. Green
//          4. Runtime exception
//          5. None of above



// OUTPUT:
//          1. null (CORRECT OPTION) ✓
package Java_QA_Set;

/**
 * @author Abhishek K G.
 * Defining & accessing Java enums example.
 */

enum ParkingSlots {
    BIG("slot for sedans/trucks only"),
    MEDIUM("slot for suvs/mid size vehicles only"),
    SMALL("slot for hatchbacks/motorbikes only");

    private final String slot;
    /**
     * @param slot defines the parking slot type.
    */
    ParkingSlots(String slot){
        this.slot = slot;
    }

    public String getValue(){
        return slot;
    }
}

public class Scenario14 {
    public static void main(String[] args) {
        ParkingSlots big = ParkingSlots.BIG;
        int value = ParkingSlots.BIG.ordinal();
        String name = ParkingSlots.BIG.name();

        System.out.println("slot: "+big.getValue());
        System.out.println("ordinal value: "+value);
        System.out.println("name: "+name);
    }
}


// OUTPUT:
//          slot: slot for sedans/trucks only
//          ordinal value: 0
//          name: BIG
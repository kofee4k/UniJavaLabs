package semester2;

public class Boat extends Vehicle {
    private int oars;

    public void setOars(int oars) {
        if (oars < 0) {
            throw new Error("Invalid negative number! Argument: oars count");
        }
        else if (oars == 0){
            throw new Error("Need oars to swim!");
        }
        else if (this.passengers*2 < oars){
            throw new Error("One too many oars!");
        }
        this.oars = oars;
    }

    @Override
    public String toString() {
        return "In a boat " + passengers + " passengers" + "\n" + "With " + oars + " oars";
    }
}

package semester2;

public class Boat extends Vehicle {
    private int oars;

    public void setOars(int oars) {
        if (oars < 0) {
            System.out.println("Invalid negative number! Argument: oars count");
            return;
        }
        else if (oars == 0){
            System.out.println("Need oars to swim!");
            return;
        }
        else if (this.passengers*2 < oars){
            System.out.println("One too many oars!");
            return;
        }
        this.oars = oars;
    }

    public int getOars() {
        return oars;
    }

    @Override
    public String toString() {
        return "In a boat " + passengers + " passengers" + "\n" + "With " + oars + " oars";
    }
}

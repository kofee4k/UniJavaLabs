package semester2;

public class Vehicle {
    protected int passengers;

    public void setPassengers(int passengers) {
        if (passengers < 0) {
            throw new Error("Invalid negative number! Argument: passengers");
        }
        else if (passengers == 0){
            throw new Error("Need passengers to drive!");
        }
        this.passengers = passengers;
    }

}

package semester2;

public class Vehicle {
    protected int passengers;

    public void setPassengers(int passengers) {
        if (passengers < 0) {
            System.out.println("Invalid negative number! Argument: passengers");
            return;
        }
        else if (passengers == 0){
            System.out.println("Need passengers to drive!");
            return;
        }
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }
}

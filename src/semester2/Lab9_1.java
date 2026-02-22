package semester2;
import java.util.Scanner;

public class Lab9_1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Boat boat1 = new Boat();
    boat1.setPassengers(sc.nextInt());
    boat1.setOars(sc.nextInt());
    System.out.println(boat1);
    }
}

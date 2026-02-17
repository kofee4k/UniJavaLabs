package semester2;
import java.util.Scanner;

public class Lab8_2nd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cow cow = new Cow(sc.nextLine(), sc.nextLine(), sc.nextInt());

        System.out.println(cow.getInfo());
    }
}

package semester2;
import java.util.Scanner;

public class Lab8_1st {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cylinder Cyl1 = new Cylinder(sc.nextInt(), sc.nextInt());
        Cylinder Cyl2 = new Cylinder(sc.nextInt(), sc.nextInt());
        String x = " ";
        String y = " ";

        System.out.println("Area = " + Cyl1.getArea() + "\n" + "Volume = " + Cyl1.getVolume());
        System.out.println("Area = " + Cyl2.getArea() + "\n" + "Volume = " + Cyl2.getVolume());
        if(!Cyl1.isEqualAreas(Cyl2)) x = " not ";
        if(!Cyl1.isEqualVolumes(Cyl2)) y = " not ";

        System.out.println("Areas are" + x + "equal");
        System.out.println("Volumes are" + y + "equal");
    }
}

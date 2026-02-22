package semester2.Lab9_2;

import java.util.Scanner;

public class Lab9_2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose figure:");
        System.out.println("1 - Triangle");
        System.out.println("2 - IsoscelesTriangle");
        System.out.println("3 - EquilateralTriangle");
        System.out.println("4 - Quadrilateral");
        System.out.println("5 - Parallelogram");
        System.out.println("6 - Rhombus");
        System.out.println("7 - Circle");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter sides (space separated):");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        Integer[] sides = new Integer[parts.length];

        for (int i = 0; i < parts.length; i++) {
            sides[i] = Integer.parseInt(parts[i]);
        }

        switch (choice) {
            case 1:
                Triangle t = new Triangle(sides);
                System.out.println(t);
                break;

            case 2:
                IsoscelesTriangle it = new IsoscelesTriangle(sides);
                System.out.println(it);
                break;

            case 3:
                EquilateralTriangle et = new EquilateralTriangle(sides);
                System.out.println(et);
                break;

            case 4:
                Quadrilateral q = new Quadrilateral(sides);
                System.out.println(q);
                break;

            case 5:
                Parallelogram p = new Parallelogram(sides);
                System.out.println(p);
                break;

            case 6:
                Rhombus r = new Rhombus(sides);
                System.out.println(r);
                break;

            case 7:
                Circle c = new Circle(sides);
                System.out.println(c);
                break;

            default:
                System.out.println("Invalid value. Try again");
        }
        scanner.close();
    }
}

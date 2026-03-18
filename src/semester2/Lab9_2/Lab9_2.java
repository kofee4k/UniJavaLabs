package semester2.Lab9_2;

import java.util.Scanner;

public class Lab9_2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фигуру:");
        System.out.println("1 - Triangle");
        System.out.println("2 - IsoscelesTriangle");
        System.out.println("3 - EquilateralTriangle");
        System.out.println("4 - Quadrilateral");
        System.out.println("5 - Parallelogram");
        System.out.println("6 - Rhombus");
        System.out.println("7 - Circle");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите стороны:");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        Integer[] sides = new Integer[parts.length];

        for (int i = 0; i < parts.length; i++) {
            sides[i] = Integer.parseInt(parts[i]);
        }

        switch (choice) {
            case 1:
                try {
                    Triangle t = new Triangle(sides);
                    System.out.println(t);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;

            case 2:
                try {
                    IsoscelesTriangle it = new IsoscelesTriangle(sides);
                    System.out.println(it);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;

            case 3:
                try {
                    EquilateralTriangle et = new EquilateralTriangle(sides);
                    System.out.println(et);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;

            case 4:
                try {
                    Quadrilateral q = new Quadrilateral(sides);
                    System.out.println(q);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;

            case 5:
                try {
                    Parallelogram p = new Parallelogram(sides);
                    System.out.println(p);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;

            case 6:
                try {
                    Rhombus r = new Rhombus(sides);
                    System.out.println(r);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;

            case 7:
                try{
                    Circle c = new Circle(sides);
                    System.out.println(c);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;

            default:
                System.out.println("Invalid value. Try again");
        }
        scanner.close();
    }
}

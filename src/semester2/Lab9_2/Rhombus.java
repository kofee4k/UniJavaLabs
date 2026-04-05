package semester2.Lab9_2;

public class Rhombus extends Parallelogram {
    public Rhombus(Integer[] sides) {
        super(sides);
        if (!isRhombus(sides)){
            throw new IllegalArgumentException("Invalid value. Try again");
        }
    }

    public static boolean isRhombus(Integer[] sides) {
        return sides.length == 4 &&
                sides[0].equals(sides[1]) &&
                sides[1].equals(sides[2]) &&
                sides[2].equals(sides[3]);
    }
    @Override
    public String toString() {
        return "Rhombus contains " + getSideCount() + " equal sides\n" +
                "Its perimeter is " + getPerimeter();
    }
}
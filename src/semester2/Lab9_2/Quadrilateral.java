package semester2.Lab9_2;

public class Quadrilateral extends Polygon {
    public Quadrilateral(Integer[] sides) {
        super(sides);
        if (!isQuadrilateral(sides)){
            throw new IllegalArgumentException("Invalid value. Try again");
        }
    }

    public static boolean isQuadrilateral(Integer[] sides) {
        return sides != null && sides.length == 4;
    }

    @Override
    public String toString() {
        return "Quadrilateral contains " + getSideCount() + " sides\n" +
                "Its perimeter is " + getPerimeter();
    }
}

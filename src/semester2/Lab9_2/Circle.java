package semester2.Lab9_2;

public class Circle extends Polygon {
    public Circle(Integer[] sides) {
        super(sides);
        if (!isCircle()){
            throw new IllegalArgumentException("Invalid value. Try again");
        }
    }

    public double getArea() {
        int radius = sides[0];
        return Math.PI * radius * radius;
    }

    public boolean isCircle() {
        return sides != null &&
                sides.length == 1 &&
                sides[0] >= 1;
    }
    @Override
    public String toString() {
        int r = sides[0];

        return "Circle radius is " + r + "\n" +
                "Its perimeter is " + (2 * Math.PI * r) + "\n" +
                "Its area is " + getArea();
    }
}
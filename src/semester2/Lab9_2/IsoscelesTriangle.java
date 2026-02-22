package semester2.Lab9_2;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(Integer[] sides) {
        super(sides);
    }

    public boolean isIsoscelesTriangle(Integer[] sides) {
        return sides[0].equals(sides[1]) ||
                sides[0].equals(sides[2]) ||
                sides[1].equals(sides[2]);
    }
    @Override
    public String toString() {
        return "Isosceles triangle contains pair of equal sides\n" +
                "Its perimeter is " + getPerimeter() + "\n" +
                "Its radius of incircle is " + getInRadius();
    }
}
package semester2.Lab9_2;

public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle(Integer[] sides) {
        super(sides);
        if (!isEquilateralTriangle()){
            throw new IllegalArgumentException("Invalid value. Try again");
        }
    }

    public boolean isEquilateralTriangle() {
        return sides[0].equals(sides[1]) &&
                sides[1].equals(sides[2]);
    }
    @Override
    public String toString() {
        return "Equilateral triangle contains " + getSideCount() + " equal sides\n" +
                "Its perimeter is " + getPerimeter() + "\n" +
                "Its radius of incircle is " + getInRadius();
    }
}

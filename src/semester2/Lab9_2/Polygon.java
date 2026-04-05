package semester2.Lab9_2;

public class Polygon {
    protected Integer[] sides;

    protected static boolean hasInvalidSides(Integer[] sides) {
        if (sides == null || sides.length < 3)
            return true;

        for (int side : sides) {
            if (side < 1)
                return true;
        }

        for (int i = 0; i < sides.length; i++) {
            int sum = 0;
            for (int j = 0; j < sides.length; j++) {
                if (i != j)
                    sum += sides[j];
            }
            if (sides[i] >= sum)
                return true;
        }

        return false;
    }

    public Polygon(Integer[] sides) {
        this.sides = sides;
        if (hasInvalidSides(sides)){
            throw new IllegalArgumentException("Invalid value. Try again");
        }
    }

    public int getSideCount() {
        return sides.length;
    }

    public int getPerimeter() {
        int sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Polygon contains " + sides.length + "\n" + "Its perimeter is " + getPerimeter();
    }
}

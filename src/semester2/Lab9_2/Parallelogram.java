package semester2.Lab9_2;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(Integer[] sides) {
        super(sides);
    }

    public boolean isParallelogram() {
        return sides.length == 4 &&
                sides[0].equals(sides[2]) &&
                sides[1].equals(sides[3]);
    }
    @Override
    public String toString() {
        if (!isParallelogram())
            return "Invalid value. Try again";
        return "Parallelogram contains two pairs of parallel sides\n" +
                "Its perimeter is " + getPerimeter();
    }
}

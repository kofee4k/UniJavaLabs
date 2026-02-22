package semester2.Lab9_2;

public class Triangle extends Polygon {

    public Triangle(Integer[] sides) {
        super(sides);
    }

    public double getInRadius() {
        double p = getPerimeter() / 2.0;
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area / p;
    }

    public boolean isTriangle() {
        if (sides.length != 3)
            return false;

        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        return a + b > c && a + c > b && b + c > a;
    }
    @Override
    public String toString() {
        if (!isTriangle())
            return "Invalid value. Try again";
        return "Triangle contains " + getSideCount() + " sides\n" +
                "Its perimeter is " + getPerimeter() + "\n" +
                "Its radius of incircle is " + getInRadius();
    }
}

package semester2.Lab10_2;

public abstract class Weapon {
    protected int power;
    protected int distance;

    public Weapon(int power, int distance) {
        this.power = power;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", power: " + power +
                ", distance: " + distance;
    }
}

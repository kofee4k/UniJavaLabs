package semester2.Lab10_2.weapon;

public abstract class BaseWeapon implements Weapon {

    protected double power;

    public BaseWeapon(double power) {
        if (power < MIN_VALUE || power > MAX_VALUE) {
            throw new IllegalArgumentException(
                "Power must be between " + MIN_VALUE + " and " + MAX_VALUE + ", got: " + power
            );
        }
        this.power = power;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + ", power: " + power
                + ", distance: " + getDistance();
    }
}

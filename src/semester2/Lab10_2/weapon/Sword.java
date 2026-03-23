package semester2.Lab10_2.weapon;

public class Sword extends BaseWeapon {

    private static final int SWORD_DISTANCE = 2;

    public Sword(double power) {
        super(power);
    }

    @Override
    public int getDistance() {
        return SWORD_DISTANCE;
    }
}
